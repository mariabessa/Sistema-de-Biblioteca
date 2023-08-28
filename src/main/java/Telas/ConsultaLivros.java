
package Telas;

import Modelo.Livro;
import java.util.List;
import DAO.DAOLivro;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author maria
 */
public class ConsultaLivros extends javax.swing.JFrame {
    public void tabela(){
        String columns[] = {"id", "Nome"};
        DAOLivro daoLivro = new DAOLivro();
        List<Livro> livros = daoLivro.getList();
        List<Livro> livrosDisponiveis = livros.stream()
                .filter(Livro::isDisponibilidade)
                .collect(Collectors.toList());

        String[][] data = livrosDisponiveis.stream()
                .map(livro -> new String[]{livro.getId().toString(), livro.getTitulo()})
                .toArray(String[][]::new);
        DefaultTableModel model = new DefaultTableModel(data, columns);
        jTable1.setModel(model);
    }
    /**
     * Creates new form Login
     */
    public ConsultaLivros() {
        initComponents();
        tabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldId = new javax.swing.JTextField();
        Detalhes = new javax.swing.JButton();
        Voltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldId.setBackground(new java.awt.Color(143, 142, 142));
        jTextFieldId.setFont(new java.awt.Font("Garuda", 0, 18)); // NOI18N
        jTextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldId, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 150, 30));

        Detalhes.setContentAreaFilled(false);
        Detalhes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Detalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetalhesActionPerformed(evt);
            }
        });
        getContentPane().add(Detalhes, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 130, 50));

        Voltar.setContentAreaFilled(false);
        Voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(Voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 760, 270, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 290, 320));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultaLivros.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        // TODO add your handling code here:
        TelaOpcoesUsuario telaAnterior = new TelaOpcoesUsuario();
        telaAnterior.setVisible(true);
        dispose();
    }//GEN-LAST:event_VoltarActionPerformed

    private void DetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetalhesActionPerformed
        // TODO add your handling code here:
        if(jTextFieldId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo!");
        } else {
            int id = Integer.parseInt(jTextFieldId.getText()); // Obtém a matrícula como inteiro
            DAOLivro daoLivro = new DAOLivro();
            Livro livro = daoLivro.localizar(id);
            if(livro != null){
                LivroEspecificoUsuario tela = new LivroEspecificoUsuario(livro);
                tela.setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Id inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
                jTextFieldId.setText("");
            }
        }
    }//GEN-LAST:event_DetalhesActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ConsultaLivros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Detalhes;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldId;
    // End of variables declaration//GEN-END:variables
}
