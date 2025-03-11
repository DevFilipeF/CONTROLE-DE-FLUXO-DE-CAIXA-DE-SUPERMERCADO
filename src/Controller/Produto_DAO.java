package Controller;

import static View.Produtos_GUI.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class Produto_DAO {
    public static String nome, codebar;
    public static double valor;

    // Método para pegar os valores dos campos da GUI e atribuí-los às variáveis
    private static void pegadordevariavel() {
        // Atribui os valores dos campos da interface gráfica às variáveis
        codebar = codigo_txt1.getText();  // Pega o código de barras
        nome = nome_txt.getText();       // Pega o nome do produto
        try {
            valor = Double.parseDouble(valor_unit_txt.getText()); // Pega o valor e converte para double
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter valor: " + e.getMessage()); // Se não for possível converter, define o valor como 0.0
        }
    }

    // Método para salvar um novo produto no banco de dados
    public static void salvar() {
        pegadordevariavel();  // Chama o método para pegar os dados da GUI
        String query = "INSERT INTO produto (codebar, nome, valor) VALUES (?, ?, ?)";
        try (Connection conexao = Conecta_DAO.getConnection()) {
            PreparedStatement stmt = conexao.prepareStatement(query);
            stmt.setString(1, codebar);
            stmt.setString(2, nome);
            stmt.setDouble(3, valor); // Passa o valor como double
            stmt.executeUpdate();
            System.out.println("Produto salvo com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao salvar produto: " + e.getMessage());
        }
        atualizartabela();
        limparcampos();
    }

    public static void adicionar() {
        pegadordevariavel();  // Chama o método para pegar os dados da GUI
        String query = "REPLACE INTO produto (codebar, nome, valor) VALUES (?, ?, ?)";
        try (Connection conexao = Conecta_DAO.getConnection()) {
            PreparedStatement stmt = conexao.prepareStatement(query);
            stmt.setString(1, codebar);
            stmt.setString(2, nome);
            stmt.setDouble(3, valor); // Passa o valor como double
            stmt.executeUpdate();
            System.out.println("Produto adicionado/atualizado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao adicionar/atualizar produto: " + e.getMessage());
        }
        atualizartabela();
        limparcampos();
    }

    public static void excluir() {
        pegadordevariavel();  // Chama o método para pegar os dados da GUI
        String query = "DELETE FROM produto WHERE codebar = ?";
        try (Connection conexao = Conecta_DAO.getConnection()) {
            PreparedStatement stmt = conexao.prepareStatement(query);
            stmt.setString(1, codebar);
            stmt.executeUpdate();
            System.out.println("Produto excluído com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao excluir produto: " + e.getMessage());
        }
        atualizartabela();
        limparcampos();
    }

    public static void buscar() {
        pegadordevariavel();  // Chama o método para pegar os dados da GUI
        String query = "SELECT nome, valor FROM produto WHERE codebar = ?";
        try (Connection conexao = Conecta_DAO.getConnection()) {
            PreparedStatement stmt = conexao.prepareStatement(query);
            stmt.setString(1, codebar);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                nome = rs.getString("nome");
                valor = rs.getDouble("valor"); // Obtém o valor como double
                System.out.println("Produto encontrado: " + nome + " - " + valor);

                nome_txt.setText(nome);
                valor_unit_txt.setText(String.valueOf(valor));
                nome_txt.setText(codebar);
            } else {
                System.out.println("Produto não encontrado!");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar produto: " + e.getMessage());
        }
    }

    public static void editar() {
        pegadordevariavel();  // Chama o método para pegar os dados da GUI
        String query = "UPDATE produto SET nome = ?, valor = ? WHERE codebar = ?";
        try (Connection conexao = Conecta_DAO.getConnection()) {
            PreparedStatement stmt = conexao.prepareStatement(query);
            stmt.setString(1, nome); // Atualiza o nome
            stmt.setDouble(2, valor); // Atualiza o valor (passando como double)
            stmt.setString(3, codebar); // Define o codebar do produto que será atualizado
            stmt.executeUpdate();
            System.out.println("Produto editado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao editar produto: " + e.getMessage());
        }
        atualizartabela();
        limparcampos();
    }

    public static void atualizartabela() {
        String query = "SELECT * FROM produto";
        try (Connection conexao = Conecta_DAO.getConnection()) {
            PreparedStatement stmt = conexao.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            if (tabela_produtos == null) {
                System.out.println("Tabela 'tabela_produtos' não foi inicializada corretamente.");
                return;
            }
            
            
            
             // Criando um novo modelo de tabela para evitar conflitos
            DefaultTableModel modelo = new DefaultTableModel(new String[]{"Código", "Nome", "Valor"}, 0);
            tabela_produtos.setModel(modelo);

            while (rs.next()) {
                String codebar = rs.getString("codebar");
                String nome = rs.getString("nome");
                double valor = rs.getDouble("valor"); // Obtém o valor como double
                modelo.addRow(new Object[]{codebar, nome, valor});
            }
            System.out.println("Tabela atualizada com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar tabela: " + e.getMessage());
        }
    }

    private static void limparcampos() {
        nome_txt.setText("");
        valor_unit_txt.setText("");
        nome_txt.setText("");
    }
}
