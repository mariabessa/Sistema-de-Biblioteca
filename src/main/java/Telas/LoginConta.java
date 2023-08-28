/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;
import DAO.DAOFuncionário;
import DAO.DAOUsuario;
import javax.swing.JOptionPane;
import javax.swing.text.*;

/**
 *
 * @author maria
 */
public class LoginConta extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public LoginConta() {
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

        Entrar = new javax.swing.JButton();
        Voltar = new javax.swing.JButton();
        jTextFieldReg = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Entrar.setContentAreaFilled(false);
        Entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarActionPerformed(evt);
            }
        });
        getContentPane().add(Entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 260, 50));

        Voltar.setContentAreaFilled(false);
        Voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(Voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 570, 260, 40));

        jTextFieldReg.setBackground(new java.awt.Color(143, 142, 142));
        jTextFieldReg.setFont(new java.awt.Font("Garuda", 0, 18)); // NOI18N
        jTextFieldReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRegActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 250, 30));

        jPasswordField1.setBackground(new java.awt.Color(143, 142, 142));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 250, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarActionPerformed
        if(jTextFieldReg.getText().isEmpty() || jPasswordField1.getPassword().toString().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } else if(!jTextFieldReg.getText().matches("\\d*")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Matrícula/Registro Acadêmico apenas com caracteres numéros!");
        } else {
            int registroOuMatricula = Integer.parseInt(jTextFieldReg.getText()); // Obtém a matrícula como inteiro
            String senha = new String(jPasswordField1.getPassword());
            if (DAOUsuario.verificarLogin(registroOuMatricula, senha)) {
                TelaOpcoesUsuario telaDeUsuario= new TelaOpcoesUsuario();
                telaDeUsuario.setVisible(true);
                dispose(); // Fecha a tela de login após o login bem-sucedido
            }else if (DAOFuncionário.verificarLogin(registroOuMatricula, senha)) {
                TelaOpcoesFunc telaDeFunc = new TelaOpcoesFunc();
                telaDeFunc.setVisible(true);
                dispose(); // Fecha a tela de login após o login bem-sucedido
            } else {
                JOptionPane.showMessageDialog(this, "Matrícula ou senha incorretas!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_EntrarActionPerformed

    private void jTextFieldRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRegActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_VoltarActionPerformed

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
            java.util.logging.Logger.getLogger(LoginConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginConta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Entrar;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldReg;
    // End of variables declaration//GEN-END:variables
}
