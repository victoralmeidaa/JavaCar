/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.victor.projetopoo2.visao;

import javax.swing.JOptionPane;
import utfpr.victor.projetopoo2.modelo.conexao.ConexaoHibernate;
import utfpr.victor.projetopoo2.modelo.rn.FuncionarioRN;
import utfpr.victor.projetopoo2.modelo.vo.Funcionario;

/**
 *
 * @author Victor Almeida
 */
public class cadastroFuncionerio extends javax.swing.JFrame {

    /**
     * Creates new form cadastroFun
     */
    public cadastroFuncionerio() {
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

        TITULO = new javax.swing.JLabel();
        tNOME = new javax.swing.JTextField();
        tCPF = new javax.swing.JTextField();
        tTELEFONE = new javax.swing.JTextField();
        tENDERECO = new javax.swing.JTextField();
        tSALARIO = new javax.swing.JTextField();
        bCADASTRAR = new javax.swing.JButton();
        bVOLTAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TITULO.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        TITULO.setText("Cadastro Funcionario");

        tNOME.setText("NOME");
        tNOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNOMEActionPerformed(evt);
            }
        });

        tCPF.setText("CPF");
        tCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCPFActionPerformed(evt);
            }
        });

        tTELEFONE.setText("Telefone");
        tTELEFONE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tTELEFONEActionPerformed(evt);
            }
        });

        tENDERECO.setText("Endereço");

        tSALARIO.setText("Salario");

        bCADASTRAR.setBackground(new java.awt.Color(102, 255, 153));
        bCADASTRAR.setForeground(new java.awt.Color(102, 255, 153));
        bCADASTRAR.setText("Cadastrar");
        bCADASTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCADASTRARActionPerformed(evt);
            }
        });

        bVOLTAR.setText("Voltar");
        bVOLTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVOLTARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(tCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(tENDERECO, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(tTELEFONE, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(TITULO))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(tNOME, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(tSALARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bCADASTRAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bVOLTAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(TITULO))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(tNOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(tCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tTELEFONE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tENDERECO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tSALARIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bCADASTRAR)
                .addGap(18, 18, 18)
                .addComponent(bVOLTAR)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tTELEFONEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tTELEFONEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tTELEFONEActionPerformed

    private void tNOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNOMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNOMEActionPerformed

    private void bCADASTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCADASTRARActionPerformed
        
        String nome = tNOME.getText();
        String cpf = tCPF.getText();
        String endereco = tENDERECO.getText();
        String telefone = tTELEFONE.getText();
        String salario = tSALARIO.getText();
        
        Funcionario funcionario = new Funcionario();

        funcionario.setNome(nome);
        funcionario.setCpf(cpf);

        funcionario.setEndereco(endereco);
        funcionario.setTelefone(telefone);
        funcionario.setSalario(salario);
        
       FuncionarioRN funcionarioRN = new FuncionarioRN(); 
       funcionarioRN.cadastrar(funcionario);
        
       JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso!");
       
       Tela_Funcionario telaFun = new Tela_Funcionario();
       telaFun.setVisible(true);
       ConexaoHibernate.close();
       
    }//GEN-LAST:event_bCADASTRARActionPerformed

    private void tCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCPFActionPerformed

    private void bVOLTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVOLTARActionPerformed
       Tela_Funcionario telaFun = new Tela_Funcionario();
       telaFun.setVisible(true);
    }//GEN-LAST:event_bVOLTARActionPerformed

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
            java.util.logging.Logger.getLogger(cadastroFuncionerio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroFuncionerio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroFuncionerio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroFuncionerio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new cadastroFuncionerio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TITULO;
    private javax.swing.JButton bCADASTRAR;
    private javax.swing.JButton bVOLTAR;
    private javax.swing.JTextField tCPF;
    private javax.swing.JTextField tENDERECO;
    private javax.swing.JTextField tNOME;
    private javax.swing.JTextField tSALARIO;
    private javax.swing.JTextField tTELEFONE;
    // End of variables declaration//GEN-END:variables
}
