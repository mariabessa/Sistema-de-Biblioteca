/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;
import BO.ContextoLivro;
import DAO.DAOLivro;
import Modelo.Autor;
import Modelo.Categoria;
import Modelo.Livro;
import java.util.ArrayList;

/**
 *
 * @author maria
 */
public class LivroEspecifico extends javax.swing.JFrame {
    private Livro livro;

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    public LivroEspecifico(Livro livro) {
        initComponents();
        this.livro = livro;
        mostrarLivro();
    }
    private void mostrarLivro() {
        jTextFieldId.setText(livro.getId().toString()); // Define o ID como texto no campo de texto
        jTextFieldId.setEditable(false);
        jTextFieldNome.setText(livro.getTitulo()); // Define o nome no campo de texto
        jTextFieldNome.setEditable(false);
        jTextFieldEditora.setText(livro.getEditora()); // Define o ID como texto no campo de texto
        jTextFieldId.setEditable(false);
        jTextFieldNumPags.setText(livro.getNumeroDePaginas().toString()); // Define o nome no campo de texto
        jTextFieldNome.setEditable(false);
        StringBuilder autoresText = new StringBuilder();
        for (Autor autor : livro.getAutor()) {
            autoresText.append(autor.getNomeCompleto()).append("\n");
        }
        jTextArea1.setText(autoresText.toString());
        jTextArea1.setEditable(false);

        // Preencher jTextArea2 com categorias
        StringBuilder categoriasText = new StringBuilder();
        for (Categoria categoria : livro.getCategoria()) {
            categoriasText.append(categoria.getTitulo()).append("\n");
        }
        jTextArea2.setText(categoriasText.toString());
        jTextArea2.setEditable(false);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Excluir = new javax.swing.JButton();
        Atualizar = new javax.swing.JButton();
        jTextFieldNumPags = new javax.swing.JTextField();
        jTextFieldEditora = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        Voltar = new javax.swing.JButton();
        jTextFieldId = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Excluir.setContentAreaFilled(false);
        Excluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(Excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 700, 140, 50));

        Atualizar.setContentAreaFilled(false);
        Atualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(Atualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 700, 140, 50));

        jTextFieldNumPags.setFont(new java.awt.Font("Garuda", 0, 18)); // NOI18N
        jTextFieldNumPags.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumPagsActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNumPags, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 290, 30));

        jTextFieldEditora.setFont(new java.awt.Font("Garuda", 0, 18)); // NOI18N
        jTextFieldEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEditoraActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 290, 30));

        jTextFieldNome.setFont(new java.awt.Font("Garuda", 0, 18)); // NOI18N
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 290, 30));

        Voltar.setContentAreaFilled(false);
        Voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(Voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 760, 300, 50));

        jTextFieldId.setFont(new java.awt.Font("Garuda", 0, 18)); // NOI18N
        jTextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldId, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 290, 30));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 600, 280, 80));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 280, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/livro.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarActionPerformed
        ContextoLivro.setIdAtual(livro.getId());
        AtualizacaoLivro atualizacaoLivro = new AtualizacaoLivro();
        atualizacaoLivro.setVisible(true);
        dispose();
    }//GEN-LAST:event_AtualizarActionPerformed

    private void jTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        // TODO add your handling code here:
        TelaLivros tela = new TelaLivros();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_VoltarActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        // TODO add your handling code here:
        DAOLivro daoLivro = new DAOLivro();
        daoLivro.remover(livro);
        TelaLivros telaLivros = new TelaLivros();
        telaLivros.setVisible(true);
        dispose();
    }//GEN-LAST:event_ExcluirActionPerformed

    private void jTextFieldEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEditoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEditoraActionPerformed

    private void jTextFieldNumPagsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumPagsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumPagsActionPerformed

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
            java.util.logging.Logger.getLogger(LivroEspecifico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LivroEspecifico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LivroEspecifico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LivroEspecifico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        LivroEspecifico livroEspecifico = new LivroEspecifico(new Livro("o", "o", 123, new ArrayList<>(), new ArrayList<>())); // Fornecer um objeto Livro como argumento
        livroEspecifico.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atualizar;
    private javax.swing.JButton Excluir;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextFieldEditora;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNumPags;
    // End of variables declaration//GEN-END:variables
}