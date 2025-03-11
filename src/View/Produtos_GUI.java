/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Filipe
 */
public class Produtos_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Produtos_GUI
     */
    public Produtos_GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("supermarket?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        produtoQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM Produto p");
        produtoList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : produtoQuery.getResultList();
        produtoQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM Produto p");
        produtoList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : produtoQuery1.getResultList();
        panelImage4 = new org.edisoncor.gui.panel.PanelImage();
        panelRect2 = new org.edisoncor.gui.panel.PanelRect();
        panelImage3 = new org.edisoncor.gui.panel.PanelImage();
        prod_BTN3 = new org.edisoncor.gui.button.ButtonIcon();
        jLabel2 = new javax.swing.JLabel();
        prod_BTN5 = new org.edisoncor.gui.button.ButtonIcon();
        jLabel7 = new javax.swing.JLabel();
        prod_BTN6 = new org.edisoncor.gui.button.ButtonIcon();
        jLabel13 = new javax.swing.JLabel();
        nome_txt = new org.edisoncor.gui.textField.TextFieldRound();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_produtos = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        enviar_BTN = new org.edisoncor.gui.button.ButtonRound();
        atualizar_BTN = new org.edisoncor.gui.button.ButtonRound();
        deletar_BTN = new org.edisoncor.gui.button.ButtonRound();
        Buscar_BTN1 = new org.edisoncor.gui.button.ButtonRound();
        valor_unit_txt = new org.edisoncor.gui.textField.TextFieldRound();
        codigo_txt1 = new org.edisoncor.gui.textField.TextFieldRound();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        panelImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fundo menu.jpg"))); // NOI18N
        panelImage4.setLayout(null);

        panelRect2.setLayout(null);

        panelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo mercado.png"))); // NOI18N

        javax.swing.GroupLayout panelImage3Layout = new javax.swing.GroupLayout(panelImage3);
        panelImage3.setLayout(panelImage3Layout);
        panelImage3Layout.setHorizontalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        panelImage3Layout.setVerticalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        panelRect2.add(panelImage3);
        panelImage3.setBounds(0, 0, 260, 170);

        prod_BTN3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pngegg.png"))); // NOI18N
        prod_BTN3.setText("buttonIcon1");
        prod_BTN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prod_BTN3ActionPerformed(evt);
            }
        });
        panelRect2.add(prod_BTN3);
        prod_BTN3.setBounds(310, 50, 130, 60);

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ajuda");
        panelRect2.add(jLabel2);
        jLabel2.setBounds(510, 110, 60, 30);

        prod_BTN5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ponto-de-interrogacao.png"))); // NOI18N
        prod_BTN5.setText("buttonIcon1");
        prod_BTN5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prod_BTN5ActionPerformed(evt);
            }
        });
        panelRect2.add(prod_BTN5);
        prod_BTN5.setBounds(470, 50, 130, 60);

        jLabel7.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Menu");
        panelRect2.add(jLabel7);
        jLabel7.setBounds(340, 120, 70, 14);

        prod_BTN6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/excluir.png"))); // NOI18N
        prod_BTN6.setText("buttonIcon1");
        prod_BTN6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prod_BTN6ActionPerformed(evt);
            }
        });
        panelRect2.add(prod_BTN6);
        prod_BTN6.setBounds(1270, 50, 130, 60);

        jLabel13.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Sair");
        panelRect2.add(jLabel13);
        jLabel13.setBounds(1320, 120, 40, 20);

        panelImage4.add(panelRect2);
        panelRect2.setBounds(-10, -10, 1420, 160);
        panelImage4.add(nome_txt);
        nome_txt.setBounds(30, 260, 200, 50);

        jLabel10.setBackground(new java.awt.Color(0, 255, 255));
        jLabel10.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("              Nome:");
        jLabel10.setOpaque(true);
        panelImage4.add(jLabel10);
        jLabel10.setBounds(30, 210, 200, 30);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, produtoList1, tabela_produtos);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codebar}"));
        columnBinding.setColumnName("Codebar");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${valor}"));
        columnBinding.setColumnName("Valor");
        columnBinding.setColumnClass(java.math.BigDecimal.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tabela_produtos);

        panelImage4.add(jScrollPane1);
        jScrollPane1.setBounds(690, 150, 680, 550);

        jLabel8.setBackground(new java.awt.Color(0, 255, 255));
        jLabel8.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("              Código:");
        jLabel8.setOpaque(true);
        panelImage4.add(jLabel8);
        jLabel8.setBounds(30, 350, 200, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 102));
        panelImage4.add(jLabel1);
        jLabel1.setBounds(320, 170, 180, 0);

        jLabel9.setBackground(new java.awt.Color(0, 255, 255));
        jLabel9.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("              Código:");
        jLabel9.setOpaque(true);
        panelImage4.add(jLabel9);
        jLabel9.setBounds(30, 350, 200, 30);

        jLabel12.setBackground(new java.awt.Color(0, 255, 255));
        jLabel12.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("         Valor Unitario:");
        jLabel12.setOpaque(true);
        panelImage4.add(jLabel12);
        jLabel12.setBounds(280, 210, 200, 30);

        enviar_BTN.setBackground(new java.awt.Color(255, 0, 0));
        enviar_BTN.setText("Salvar");
        enviar_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviar_BTNActionPerformed(evt);
            }
        });
        panelImage4.add(enviar_BTN);
        enviar_BTN.setBounds(50, 500, 140, 40);

        atualizar_BTN.setBackground(new java.awt.Color(255, 0, 0));
        atualizar_BTN.setText("Atualizar");
        atualizar_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizar_BTNActionPerformed(evt);
            }
        });
        panelImage4.add(atualizar_BTN);
        atualizar_BTN.setBounds(250, 500, 140, 40);

        deletar_BTN.setBackground(new java.awt.Color(255, 0, 0));
        deletar_BTN.setText("Deletar");
        deletar_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletar_BTNActionPerformed(evt);
            }
        });
        panelImage4.add(deletar_BTN);
        deletar_BTN.setBounds(50, 570, 140, 40);

        Buscar_BTN1.setBackground(new java.awt.Color(255, 0, 0));
        Buscar_BTN1.setText("Buscar");
        Buscar_BTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscar_BTN1ActionPerformed(evt);
            }
        });
        panelImage4.add(Buscar_BTN1);
        Buscar_BTN1.setBounds(250, 570, 140, 40);

        valor_unit_txt.setToolTipText("R$ 0,00");
        valor_unit_txt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        valor_unit_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor_unit_txtActionPerformed(evt);
            }
        });
        panelImage4.add(valor_unit_txt);
        valor_unit_txt.setBounds(280, 260, 200, 50);
        panelImage4.add(codigo_txt1);
        codigo_txt1.setBounds(30, 400, 200, 40);

        getContentPane().add(panelImage4);
        panelImage4.setBounds(0, 0, 1410, 780);

        bindingGroup.bind();

        setSize(new java.awt.Dimension(1397, 772));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void prod_BTN6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prod_BTN6ActionPerformed
    System.exit(0);
    }//GEN-LAST:event_prod_BTN6ActionPerformed

    private void prod_BTN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prod_BTN3ActionPerformed
        // TODO add your handling code here:
        new Menu_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_prod_BTN3ActionPerformed

    private void Buscar_BTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscar_BTN1ActionPerformed
     Controller.Produto_DAO.buscar();
    }//GEN-LAST:event_Buscar_BTN1ActionPerformed

    private void enviar_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviar_BTNActionPerformed
     Controller.Produto_DAO.salvar();
    }//GEN-LAST:event_enviar_BTNActionPerformed

    private void atualizar_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizar_BTNActionPerformed
     Controller.Produto_DAO.adicionar();  
    }//GEN-LAST:event_atualizar_BTNActionPerformed

    private void deletar_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletar_BTNActionPerformed
     Controller.Produto_DAO.excluir();
    }//GEN-LAST:event_deletar_BTNActionPerformed

    private void prod_BTN5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prod_BTN5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prod_BTN5ActionPerformed

    private void valor_unit_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor_unit_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valor_unit_txtActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Produtos_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produtos_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produtos_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produtos_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Produtos_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static org.edisoncor.gui.button.ButtonRound Buscar_BTN1;
    public static org.edisoncor.gui.button.ButtonRound atualizar_BTN;
    public static org.edisoncor.gui.textField.TextFieldRound codigo_txt1;
    public static org.edisoncor.gui.button.ButtonRound deletar_BTN;
    private javax.persistence.EntityManager entityManager;
    public static org.edisoncor.gui.button.ButtonRound enviar_BTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public static org.edisoncor.gui.textField.TextFieldRound nome_txt;
    private org.edisoncor.gui.panel.PanelImage panelImage3;
    private org.edisoncor.gui.panel.PanelImage panelImage4;
    private org.edisoncor.gui.panel.PanelRect panelRect2;
    private org.edisoncor.gui.button.ButtonIcon prod_BTN3;
    private org.edisoncor.gui.button.ButtonIcon prod_BTN5;
    public static org.edisoncor.gui.button.ButtonIcon prod_BTN6;
    private java.util.List<View.Produto> produtoList;
    private java.util.List<View.Produto> produtoList1;
    private javax.persistence.Query produtoQuery;
    private javax.persistence.Query produtoQuery1;
    public static javax.swing.JTable tabela_produtos;
    public static org.edisoncor.gui.textField.TextFieldRound valor_unit_txt;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
