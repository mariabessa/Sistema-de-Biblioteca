/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

/**
 *
 * @author maria
 */
public class TelaOpcoesFunc extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public TelaOpcoesFunc() {
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

        Receber = new javax.swing.JButton();
        CadastroEmp = new javax.swing.JButton();
        Voltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Receber.setContentAreaFilled(false);
        Receber.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Receber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceberActionPerformed(evt);
            }
        });
        getContentPane().add(Receber, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 300, 50));

        CadastroEmp.setContentAreaFilled(false);
        CadastroEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CadastroEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroEmpActionPerformed(evt);
            }
        });
        getContentPane().add(CadastroEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 300, 50));

        Voltar.setContentAreaFilled(false);
        Voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(Voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 750, 300, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telaFunc.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CadastroEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroEmpActionPerformed
        // TODO add your handling code here:
        CadastroEmprestimo cadastroEmprestimo = new CadastroEmprestimo();
        cadastroEmprestimo.setVisible(true);
        dispose();
    }//GEN-LAST:event_CadastroEmpActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        // TODO add your handling code here:
        LoginConta telaAnterior = new LoginConta();
        telaAnterior.setVisible(true);
        dispose();
    }//GEN-LAST:event_VoltarActionPerformed

    private void ReceberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceberActionPerformed
        // TODO add your handling code here:
        emprestimoRecebido tela = new emprestimoRecebido();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_ReceberActionPerformed

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
            java.util.logging.Logger.getLogger(TelaOpcoesFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaOpcoesFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaOpcoesFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaOpcoesFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaOpcoesFunc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastroEmp;
    private javax.swing.JButton Receber;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
