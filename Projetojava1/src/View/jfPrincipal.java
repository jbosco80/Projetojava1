/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author João
 */
public class jfPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form jfPrincipal
     */
    public jfPrincipal() {
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

        jdpPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm_Cadastro = new javax.swing.JMenu();
        jm_Cadastro_Professor = new javax.swing.JMenuItem();
        jm_Cadastro_Aluno = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jm_Consulta_Professor = new javax.swing.JMenuItem();
        jm_Consulta_Aluno = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmListagemProfessor = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto Admin Escolar");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jdpPrincipal.setBackground(new java.awt.Color(0, 51, 51));
        jdpPrincipal.setForeground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jdpPrincipalLayout = new javax.swing.GroupLayout(jdpPrincipal);
        jdpPrincipal.setLayout(jdpPrincipalLayout);
        jdpPrincipalLayout.setHorizontalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 611, Short.MAX_VALUE)
        );
        jdpPrincipalLayout.setVerticalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 384, Short.MAX_VALUE)
        );

        jm_Cadastro.setText("Cadastro");

        jm_Cadastro_Professor.setText("Cadastro Professor");
        jm_Cadastro_Professor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_Cadastro_ProfessorActionPerformed(evt);
            }
        });
        jm_Cadastro.add(jm_Cadastro_Professor);

        jm_Cadastro_Aluno.setText("Cadastro Aluno");
        jm_Cadastro_Aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_Cadastro_AlunoActionPerformed(evt);
            }
        });
        jm_Cadastro.add(jm_Cadastro_Aluno);

        jMenuBar1.add(jm_Cadastro);

        jMenu2.setText("Consulta");

        jm_Consulta_Professor.setText("Professor");
        jm_Consulta_Professor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_Consulta_ProfessorActionPerformed(evt);
            }
        });
        jMenu2.add(jm_Consulta_Professor);

        jm_Consulta_Aluno.setText("Aluno");
        jm_Consulta_Aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_Consulta_AlunoActionPerformed(evt);
            }
        });
        jMenu2.add(jm_Consulta_Aluno);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Listagem");

        jmListagemProfessor.setText("Professor");
        jMenu3.add(jmListagemProfessor);

        jMenuItem1.setText("Sala");
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
this.setExtendedState(MAXIMIZED_BOTH);      
    }//GEN-LAST:event_formWindowOpened

    private void jm_Cadastro_ProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_Cadastro_ProfessorActionPerformed
        // TODO add your handling code here:
         
        jficadastro obj = new jficadastro();
        jdpPrincipal.add(obj);
        obj.setVisible(true);
        
    }//GEN-LAST:event_jm_Cadastro_ProfessorActionPerformed

    private void jm_Cadastro_AlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_Cadastro_AlunoActionPerformed
        // TODO add your handling code here:
        jfiAluno1 obj = new jfiAluno1();
        jdpPrincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_jm_Cadastro_AlunoActionPerformed

    private void jm_Consulta_ProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_Consulta_ProfessorActionPerformed
        // TODO add your handling code here:
          consulta_Professor obj = new consulta_Professor();
        jdpPrincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_jm_Consulta_ProfessorActionPerformed

    private void jm_Consulta_AlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_Consulta_AlunoActionPerformed
        // TODO add your handling code here:
         consulta_Aluno obj = new consulta_Aluno();
        jdpPrincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_jm_Consulta_AlunoActionPerformed

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
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JDesktopPane jdpPrincipal;
    private javax.swing.JMenuItem jmListagemProfessor;
    private javax.swing.JMenu jm_Cadastro;
    private javax.swing.JMenuItem jm_Cadastro_Aluno;
    private javax.swing.JMenuItem jm_Cadastro_Professor;
    private javax.swing.JMenuItem jm_Consulta_Aluno;
    private javax.swing.JMenuItem jm_Consulta_Professor;
    // End of variables declaration//GEN-END:variables
}
