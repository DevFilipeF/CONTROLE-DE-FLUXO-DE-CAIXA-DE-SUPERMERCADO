package Controller;

import javax.swing.JOptionPane;
import static View.Dadosdoclient.*;
import static View.Menu_GUI.*;
import java.sql.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;

public class Pedido_DAO {
    public static String nome, caixa, Nitem, codebarra, nomecliente;
    public static double valor , valorecebido ;
    public static int unit;
    
    
    private static void pegarcampos() {
        caixa = caixa_txt.getText(); 
        Nitem = nitem_txt.getText(); 
        codebarra = code_txt.getText(); 
        unit = Integer.parseInt(unit_txt.getText());  
    }

 
    public static void inserir() {
        pegarcampos();  

        
        String sql = "SELECT nome, valor FROM Produto WHERE codebar = ?";
        
        try (Connection conn = Conecta_DAO.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, codebarra); 
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                
                nome = rs.getString("nome");
                valor = rs.getDouble("valor");

               
                String insertSql = "INSERT INTO Pedido (Nitem, caixa, nome, valor, unit, codebar) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement insertStmt = conn.prepareStatement(insertSql);
                insertStmt.setInt(1, Integer.parseInt(Nitem)); 
                insertStmt.setString(2, caixa); 
                insertStmt.setString(3, nome);  
                insertStmt.setDouble(4, valor);  
                insertStmt.setInt(5, unit);  
                insertStmt.setString(6, codebarra); 

                insertStmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Pedido inserido com sucesso.");
                somar();
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Produto não encontrado com o código de barras fornecido.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao inserir o pedido.");
        }
    }

    
    public static void buscar() {
    // Remover espaços extras do campo Nitem
        String nitemTexto = nitem_txt.getText().trim(); 

        if (nitemTexto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, informe o Nitem para buscar.");
            return;
        }

        int nitem;
        try {
            nitem = Integer.parseInt(nitemTexto); // Converte o texto para inteiro
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Nitem inválido. Digite um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Consultar o banco de dados para verificar o Nitem
        String sql = "SELECT codebar, unit FROM Pedido WHERE Nitem = ?";

        try (Connection conn = Conecta_DAO.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, nitem); // Define o Nitem na consulta SQL
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                // Se encontrar o Nitem no banco de dados, preencher os campos
                codebarra = rs.getString("codebar");
                unit = rs.getInt("unit");

                // Exibir os dados encontrados nos campos correspondentes
                code_txt.setText(codebarra);
                unit_txt.setText(String.valueOf(unit));

                JOptionPane.showMessageDialog(null, "Pedido encontrado com sucesso.");
            } else {
                // Se o Nitem não for encontrado
                JOptionPane.showMessageDialog(null, "Nitem não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao realizar a busca no banco de dados.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
}

   public static void editar() {
    pegarcampos();  

    
    String sqlProduto = "SELECT nome, valor FROM Produto WHERE codebar = ?";
    try (Connection conn = Conecta_DAO.getConnection()) {
        
        PreparedStatement stmtProduto = conn.prepareStatement(sqlProduto);
        stmtProduto.setString(1, codebarra);  
        ResultSet rsProduto = stmtProduto.executeQuery();

        if (rsProduto.next()) {
            
            String nomeProduto = rsProduto.getString("nome");
            double valorProduto = rsProduto.getDouble("valor");

            
            String sqlUpdate = "UPDATE Pedido SET unit = ?, codebar = ?, nome = ?, valor = ? WHERE Nitem = ?";
            PreparedStatement stmtUpdate = conn.prepareStatement(sqlUpdate);
            stmtUpdate.setInt(1, unit);  
            stmtUpdate.setString(2, codebarra);  
            stmtUpdate.setString(3, nomeProduto);  
            stmtUpdate.setDouble(4, valorProduto); 
            stmtUpdate.setInt(5, Integer.parseInt(Nitem));  

            int rowsUpdated = stmtUpdate.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso.");
                somar();
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(null, "N°item não encontrado para edição.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Produto não encontrado com o código de barras fornecido.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Erro ao editar o pedido.");
    }
}

    
    public static void excluir() {
        Nitem = nitem_txt.getText();  

        if (Nitem.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, informe o Nitem para excluir.");
            return;
        }

        String sql = "DELETE FROM Pedido WHERE Nitem = ?";

        try (Connection conn = Conecta_DAO.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, Integer.parseInt(Nitem)); 

            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Pedido excluído com sucesso.");
                somar();
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Nitem não encontrado para exclusão.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao excluir o pedido.");
        }
    }
    public static void finalizar() {
    caixa = caixa_txt.getText();  
    nomecliente = nomedocliente_txt.getText();  

    if (caixa.isEmpty() || nomecliente.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, informe o número do caixa e o nome do cliente.");
        return;
    }

    Document document = new Document();
    try {
      
        String filePath = "nota_fiscal_" + caixa + ".pdf";
        FileOutputStream fos = new FileOutputStream(filePath);
        PdfWriter writer = PdfWriter.getInstance(document, fos);
        
        document.open();
        
        Paragraph title = new Paragraph("NOTA FISCAL");
        title.setAlignment(Element.ALIGN_CENTER);
        title.setFont(FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16));
        document.add(title);
        
        Paragraph clientInfo = new Paragraph("Cliente: " + nomecliente + "\nCaixa: " + caixa);
        clientInfo.setAlignment(Element.ALIGN_LEFT);
        clientInfo.setFont(FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12));
        document.add(clientInfo);
        
       
        document.add(new Chunk("\n"));

        
        PdfPTable table = new PdfPTable(5);  
        table.setWidthPercentage(100);

        table.addCell("Nitem");
        table.addCell("Nome");
        table.addCell("Quant.");
        table.addCell("Valor Unit.");
        table.addCell("Valor Total");

        
        String sql = "SELECT Nitem, nome, unit, valor FROM Pedido WHERE caixa = ?";
        try (Connection conn = Conecta_DAO.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, caixa);
            ResultSet rs = stmt.executeQuery();

           
            double totalGeral = 0.0;
            while (rs.next()) {
                int nitem = rs.getInt("Nitem");
                String nomeProduto = rs.getString("nome");
                int unit = rs.getInt("unit");
                double valorUnitario = rs.getDouble("valor");

                double valorTotalItem = unit * valorUnitario;

                table.addCell(String.valueOf(nitem)); 
                table.addCell(nomeProduto);  
                table.addCell(String.valueOf(unit));  
                table.addCell(String.format(Locale.US, "%.2f", valorUnitario));  
                table.addCell(String.format(Locale.US, "%.2f", valorTotalItem));  

                totalGeral += valorTotalItem;  
            }

            
            table.addCell("");
            table.addCell("");
            table.addCell("Total:");
            table.addCell("");
            table.addCell(String.format(Locale.US, "%.2f", totalGeral));

            
            document.add(table);

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao buscar os itens do pedido.");
        }

        
        document.close();
        
        
        JOptionPane.showMessageDialog(null, "Nota fiscal gerada com sucesso! Salva em: " + filePath);

        
        limparCampos();

        
        limparDadosCaixa();

    } catch (DocumentException | IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Erro ao gerar a nota fiscal.");
    }
}
    

    private static void limparDadosCaixa() {
    String sqlDelete = "DELETE FROM Pedido WHERE caixa = ?";

    try (Connection conn = Conecta_DAO.getConnection()) {
        PreparedStatement stmtDelete = conn.prepareStatement(sqlDelete);
        stmtDelete.setString(1, caixa);  // Passa o número do caixa para excluir os registros relacionados

        int rowsDeleted = stmtDelete.executeUpdate();
        if (rowsDeleted > 0) {
            System.out.println("Dados do caixa " + caixa + " excluídos com sucesso.");
        } else {
            System.out.println("Nenhum dado encontrado para o caixa " + caixa + " para excluir.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Erro ao limpar os dados do caixa.");
    }
    
}
    
    public static void atualizarTabelaItens() {
    String query = "SELECT Nitem, nome, unit, valor, (unit * valor) AS total FROM Pedido";
    
    try (Connection conexao = Conecta_DAO.getConnection()) {
        PreparedStatement stmt = conexao.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();

        if (tabelaItens == null) {
            System.out.println("Tabela 'tabelaItens' não foi inicializada corretamente.");
            return;
        }

        // Criando um novo modelo de tabela para evitar conflitos
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"N° Item", "Nome", "Quantidade", "Valor Unitário", "Total"}, 0);
        tabelaItens.setModel(modelo);

        while (rs.next()) {
            int nItem = rs.getInt("Nitem");
            String nome = rs.getString("nome");
            int quantidade = rs.getInt("unit");
            double valorUnitario = rs.getDouble("valor");
            double total = rs.getDouble("total");

            modelo.addRow(new Object[]{nItem, nome, quantidade, valorUnitario, total});
        }
        System.out.println("Tabela de itens atualizada com sucesso!");
    } catch (SQLException e) {
        System.out.println("Erro ao atualizar tabelaItens: " + e.getMessage());
    }
}
    

   private static void limparCampos() {
    if (nomedocliente_txt != null) nomedocliente_txt.setText("");  
    if (nitem_txt != null) nitem_txt.setText("");
    if (unit_txt != null) unit_txt.setText("");
    if (code_txt != null) code_txt.setText("");
}
    public static void somar() {

    caixa = caixa_txt.getText();  

    if (caixa.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, informe o número do caixa.");
        return;
    }

    
    String sql = "SELECT unit, valor FROM Pedido WHERE caixa = ?";
    double subtotal = 0.0;

    try (Connection conn = Conecta_DAO.getConnection()) {
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, caixa);  
        ResultSet rs = stmt.executeQuery();

        
        while (rs.next()) {
            int unit = rs.getInt("unit");  
            double valorUnitario = rs.getDouble("valor");  

            
            subtotal += unit * valorUnitario;
            
        }

       
        subtotal_txt1.setText(String.format(Locale.US, "%.2f", subtotal));

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Erro ao calcular o subtotal.");
    }
}
}

