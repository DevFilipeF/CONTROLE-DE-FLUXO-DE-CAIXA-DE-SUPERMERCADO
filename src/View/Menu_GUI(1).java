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
public class Menu_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Menu_GUI
     */
    public Menu_GUI() {
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

        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        panelRect1 = new org.edisoncor.gui.panel.PanelRect();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        prod_BTN2 = new org.edisoncor.gui.button.ButtonIcon();
        prod_BTN3 = new org.edisoncor.gui.button.ButtonIcon();
        jLabel2 = new javax.swing.JLabel();
        prod_BTN4 = new org.edisoncor.gui.button.ButtonIcon();
        jLabel4 = new javax.swing.JLabel();
        prod_BTN5 = new org.edisoncor.gui.button.ButtonIcon();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        subtotal_txt = new org.edisoncor.gui.textField.TextFieldRound();
        jLabel3 = new javax.swing.JLabel();
        codigo_txt = new org.edisoncor.gui.textField.TextFieldRound();
        jLabel9 = new javax.swing.JLabel();
        valor_unit_txt = new org.edisoncor.gui.textField.TextFieldRound();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        buttonSeven1 = new org.edisoncor.gui.button.ButtonSeven();
        jLabel1 = new javax.swing.JLabel();
        total_txt = new org.edisoncor.gui.textField.TextFieldRound();
        jLabel11 = new javax.swing.JLabel();
        subtotal_txt1 = new org.edisoncor.gui.textField.TextFieldRound();
        jLabel12 = new javax.swing.JLabel();
        subtotal_txt2 = new org.edisoncor.gui.textField.TextFieldRound();
        subtotal_txt3 = new org.edisoncor.gui.textField.TextFieldRound();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        buttonSeven3 = new org.edisoncor.gui.button.ButtonSeven();
        buttonSeven4 = new org.edisoncor.gui.button.ButtonSeven();
        buttonSeven5 = new org.edisoncor.gui.button.ButtonSeven();
        buttonSeven7 = new org.edisoncor.gui.button.ButtonSeven();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fundo menu.jpg"))); // NOI18N
        panelImage1.setLayout(null);

        panelRect1.setLayout(null);

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo mercado.png"))); // NOI18N

        javax.swing.GroupLayout panelImage2Layout = new javax.swing.GroupLayout(panelImage2);
        panelImage2.setLayout(panelImage2Layout);
        panelImage2Layout.setHorizontalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        panelImage2Layout.setVerticalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        panelRect1.add(panelImage2);
        panelImage2.setBounds(0, 0, 260, 170);

        prod_BTN2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/excluir.png"))); // NOI18N
        prod_BTN2.setText("buttonIcon1");
        prod_BTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prod_BTN2ActionPerformed(evt);
            }
        });
        panelRect1.add(prod_BTN2);
        prod_BTN2.setBounds(1270, 50, 130, 60);

        prod_BTN3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/produtos.png"))); // NOI18N
        prod_BTN3.setText("buttonIcon1");
        prod_BTN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prod_BTN3ActionPerformed(evt);
            }
        });
        panelRect1.add(prod_BTN3);
        prod_BTN3.setBounds(310, 50, 130, 60);

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ajuda");
        panelRect1.add(jLabel2);
        jLabel2.setBounds(670, 110, 60, 30);

        prod_BTN4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clientes.png"))); // NOI18N
        prod_BTN4.setText("buttonIcon1");
        prod_BTN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prod_BTN4ActionPerformed(evt);
            }
        });
        panelRect1.add(prod_BTN4);
        prod_BTN4.setBounds(470, 50, 130, 60);

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Clientes");
        panelRect1.add(jLabel4);
        jLabel4.setBounds(500, 120, 70, 14);

        prod_BTN5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ponto-de-interrogacao.png"))); // NOI18N
        prod_BTN5.setText("buttonIcon1");
        panelRect1.add(prod_BTN5);
        prod_BTN5.setBounds(630, 50, 130, 60);

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ajuda");
        panelRect1.add(jLabel5);
        jLabel5.setBounds(670, 110, 60, 30);

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sair");
        panelRect1.add(jLabel6);
        jLabel6.setBounds(1320, 120, 40, 20);

        jLabel7.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Produtos");
        panelRect1.add(jLabel7);
        jLabel7.setBounds(340, 120, 70, 14);

        panelImage1.add(panelRect1);
        panelRect1.setBounds(-10, -10, 1420, 160);

        subtotal_txt.setToolTipText("R$ 0,00");
        subtotal_txt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        subtotal_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtotal_txtActionPerformed(evt);
            }
        });
        panelImage1.add(subtotal_txt);
        subtotal_txt.setBounds(730, 700, 240, 60);

        jLabel3.setBackground(new java.awt.Color(0, 255, 255));
        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("         Caixa:");
        jLabel3.setOpaque(true);
        panelImage1.add(jLabel3);
        jLabel3.setBounds(30, 170, 280, 50);
        panelImage1.add(codigo_txt);
        codigo_txt.setBounds(30, 500, 200, 40);

        jLabel9.setBackground(new java.awt.Color(0, 255, 255));
        jLabel9.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("       Total Recebido:");
        jLabel9.setOpaque(true);
        panelImage1.add(jLabel9);
        jLabel9.setBounds(730, 660, 240, 30);

        valor_unit_txt.setToolTipText("R$ 0,00");
        valor_unit_txt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        valor_unit_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor_unit_txtActionPerformed(evt);
            }
        });
        panelImage1.add(valor_unit_txt);
        valor_unit_txt.setBounds(30, 380, 200, 50);

        jLabel10.setBackground(new java.awt.Color(0, 255, 255));
        jLabel10.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("        Valor Unitário:");
        jLabel10.setOpaque(true);
        panelImage1.add(jLabel10);
        jLabel10.setBounds(30, 340, 200, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "N° Prod", "Código", "Descrição", "Qtd", "Valor Unit.", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        panelImage1.add(jScrollPane1);
        jScrollPane1.setBounds(690, 150, 680, 360);

        jLabel8.setBackground(new java.awt.Color(0, 255, 255));
        jLabel8.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("              Código:");
        jLabel8.setOpaque(true);
        panelImage1.add(jLabel8);
        jLabel8.setBounds(30, 460, 200, 30);

        buttonSeven1.setBackground(new java.awt.Color(204, 0, 0));
        buttonSeven1.setText("Fechado");
        panelImage1.add(buttonSeven1);
        buttonSeven1.setBounds(190, 240, 116, 35);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 102));
        panelImage1.add(jLabel1);
        jLabel1.setBounds(320, 170, 180, 0);

        total_txt.setToolTipText("R$ 0,00");
        total_txt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        total_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_txtActionPerformed(evt);
            }
        });
        panelImage1.add(total_txt);
        total_txt.setBounds(280, 380, 200, 50);

        jLabel11.setBackground(new java.awt.Color(0, 255, 255));
        jLabel11.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("          Valor Total:");
        jLabel11.setOpaque(true);
        panelImage1.add(jLabel11);
        jLabel11.setBounds(280, 340, 200, 30);

        subtotal_txt1.setToolTipText("R$ 0,00");
        subtotal_txt1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        subtotal_txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtotal_txt1ActionPerformed(evt);
            }
        });
        panelImage1.add(subtotal_txt1);
        subtotal_txt1.setBounds(750, 570, 540, 70);

        jLabel12.setBackground(new java.awt.Color(0, 255, 255));
        jLabel12.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("   Forma De Pagamento:");
        jLabel12.setOpaque(true);
        panelImage1.add(jLabel12);
        jLabel12.setBounds(10, 620, 370, 30);

        subtotal_txt2.setToolTipText("R$ 0,00");
        subtotal_txt2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        subtotal_txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtotal_txt2ActionPerformed(evt);
            }
        });
        panelImage1.add(subtotal_txt2);
        subtotal_txt2.setBounds(1050, 700, 230, 60);

        subtotal_txt3.setToolTipText("R$ 0,00");
        subtotal_txt3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        subtotal_txt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtotal_txt3ActionPerformed(evt);
            }
        });
        panelImage1.add(subtotal_txt3);
        subtotal_txt3.setBounds(1080, 700, 200, 60);

        jLabel13.setBackground(new java.awt.Color(0, 255, 255));
        jLabel13.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("             Troco:");
        jLabel13.setOpaque(true);
        panelImage1.add(jLabel13);
        jLabel13.setBounds(1050, 660, 230, 30);

        jLabel14.setBackground(new java.awt.Color(0, 255, 255));
        jLabel14.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("                                             SubTotal:");
        jLabel14.setOpaque(true);
        panelImage1.add(jLabel14);
        jLabel14.setBounds(690, 530, 670, 30);

        buttonSeven3.setBackground(new java.awt.Color(0, 255, 0));
        buttonSeven3.setText("Aberto");
        panelImage1.add(buttonSeven3);
        buttonSeven3.setBounds(50, 240, 116, 35);

        buttonSeven4.setBackground(new java.awt.Color(0, 255, 255));
        buttonSeven4.setText("Pix");
        panelImage1.add(buttonSeven4);
        buttonSeven4.setBounds(10, 680, 116, 35);

        buttonSeven5.setBackground(new java.awt.Color(0, 255, 255));
        buttonSeven5.setText("Dinheiro");
        panelImage1.add(buttonSeven5);
        buttonSeven5.setBounds(10, 730, 116, 35);

        buttonSeven7.setBackground(new java.awt.Color(0, 255, 255));
        buttonSeven7.setText("Cartão");
        panelImage1.add(buttonSeven7);
        buttonSeven7.setBounds(140, 680, 116, 35);

        getContentPane().add(panelImage1);
        panelImage1.setBounds(0, 0, 1400, 770);

        setSize(new java.awt.Dimension(1397, 772));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void subtotal_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtotal_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subtotal_txtActionPerformed

    private void valor_unit_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor_unit_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valor_unit_txtActionPerformed

    private void total_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_total_txtActionPerformed

    private void subtotal_txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtotal_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subtotal_txt1ActionPerformed

    private void subtotal_txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtotal_txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subtotal_txt2ActionPerformed

    private void subtotal_txt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtotal_txt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subtotal_txt3ActionPerformed

    private void prod_BTN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prod_BTN2ActionPerformed
        // TODO add your handling code here:
        
        System.exit(0);
    }//GEN-LAST:event_prod_BTN2ActionPerformed

    private void prod_BTN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prod_BTN3ActionPerformed
        // TODO add your handling code here:
         new Produtos_GUI().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_prod_BTN3ActionPerformed

    private void prod_BTN4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prod_BTN4ActionPerformed
        // TODO add your handling code here:
        new Clientes_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_prod_BTN4ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonSeven buttonSeven1;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven3;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven4;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven5;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven7;
    private org.edisoncor.gui.textField.TextFieldRound codigo_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private org.edisoncor.gui.panel.PanelRect panelRect1;
    private org.edisoncor.gui.button.ButtonIcon prod_BTN2;
    private org.edisoncor.gui.button.ButtonIcon prod_BTN3;
    private org.edisoncor.gui.button.ButtonIcon prod_BTN4;
    private org.edisoncor.gui.button.ButtonIcon prod_BTN5;
    private org.edisoncor.gui.textField.TextFieldRound subtotal_txt;
    private org.edisoncor.gui.textField.TextFieldRound subtotal_txt1;
    private org.edisoncor.gui.textField.TextFieldRound subtotal_txt2;
    private org.edisoncor.gui.textField.TextFieldRound subtotal_txt3;
    private org.edisoncor.gui.textField.TextFieldRound total_txt;
    private org.edisoncor.gui.textField.TextFieldRound valor_unit_txt;
    // End of variables declaration//GEN-END:variables
}
