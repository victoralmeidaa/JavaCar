/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.victor.projetopoo2.visao;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utfpr.victor.projetopoo2.modelo.rn.FuncionarioRN;
import utfpr.victor.projetopoo2.modelo.vo.Funcionario;

/**
 *
 * @author victo
 */
public class Tela_Funcionario extends javax.swing.JFrame {

    private Funcionario funcionario;
    private FuncionarioRN funcionarioRN;
    private List<Funcionario> funcionarios;
    /**
     * Creates new form Tela_Funcionario
     */
    public Tela_Funcionario() {
        initComponents();
        this.funcionario = new Funcionario();
        this.funcionarioRN = new FuncionarioRN();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bCADASTRAR = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tTABELA = new javax.swing.JTable();
        bALTERAR = new javax.swing.JButton();
        bEXCLUIR = new javax.swing.JButton();
        bPESQUISAR = new javax.swing.JButton();
        txtPesquisar = new javax.swing.JTextField();
        bTODOS = new javax.swing.JButton();
        bVOLTAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Funcionario");

        bCADASTRAR.setText("Novo");
        bCADASTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCADASTRARActionPerformed(evt);
            }
        });

        tTABELA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Telefone", "Endereco", "Salario"
            }
        ));
        jScrollPane1.setViewportView(tTABELA);

        bALTERAR.setText("Atualizar");
        bALTERAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bALTERARActionPerformed(evt);
            }
        });

        bEXCLUIR.setText("Excluir");
        bEXCLUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEXCLUIRActionPerformed(evt);
            }
        });

        bPESQUISAR.setText("Pesquisar");
        bPESQUISAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPESQUISARActionPerformed(evt);
            }
        });

        bTODOS.setText("Todos");
        bTODOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTODOSActionPerformed(evt);
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
                .addGap(178, 178, 178)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(bPESQUISAR)
                        .addGap(18, 18, 18)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bTODOS, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bCADASTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bALTERAR, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bEXCLUIR, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bVOLTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bPESQUISAR)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bEXCLUIR)
                    .addComponent(bALTERAR)
                    .addComponent(bCADASTRAR)
                    .addComponent(bTODOS)
                    .addComponent(bVOLTAR))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCADASTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCADASTRARActionPerformed
        cadastroFuncionerio cadFun = new cadastroFuncionerio();
        cadFun.setVisible(true);
    }//GEN-LAST:event_bCADASTRARActionPerformed

    private void bEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEXCLUIRActionPerformed
       FuncionarioRN funcionarioRN1 =new FuncionarioRN();
       funcionarioRN1.excluir(funcionario);
        
        try{
            int linha =   tTABELA.getSelectedRow();
            Long id = Long.valueOf(tTABELA.getValueAt(linha, 0).toString());
            Funcionario funFind = funcionarioRN.listarUm(id);
            funcionarioRN.excluir(funFind);

            DefaultTableModel model = (DefaultTableModel) tTABELA.getModel();
            model.removeRow(linha);
            JOptionPane.showMessageDialog(null, "Funcionario Exclu??do com Sucesso!");
            //this.setCloseable(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        } 
    }//GEN-LAST:event_bEXCLUIRActionPerformed

    private void bTODOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTODOSActionPerformed
        
        try {
            DefaultTableModel model = (DefaultTableModel) tTABELA.getModel();
            model.setNumRows(0);  
            this.funcionarios = funcionarioRN.listarTodos();
            for(Funcionario funcionario : funcionarios){
                String [] linha = {funcionario.getNome(), funcionario.getCpf(),funcionario.getTelefone(),funcionario.getEndereco(), funcionario.getSalario()};
                model.addRow(linha);
            }
        } catch (Exception e) {
        } 
    }//GEN-LAST:event_bTODOSActionPerformed

    private void bVOLTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVOLTARActionPerformed
        Tela_ADM tela_adm = new Tela_ADM();
        tela_adm.setVisible(true);
    }//GEN-LAST:event_bVOLTARActionPerformed

    private void bPESQUISARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPESQUISARActionPerformed
        String filtro = txtPesquisar.getName();
        
        try {
            DefaultTableModel model = (DefaultTableModel) tTABELA.getModel();
            model.setNumRows(0);
            this.funcionarios = funcionarioRN.listarFitroLike(filtro);
            for(Funcionario funcionario : funcionarios){
                String [] linha = {funcionario.getNome(), funcionario.getCpf(),funcionario.getTelefone(),funcionario.getEndereco(), funcionario.getSalario()};
                model.addRow(linha);
            }
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_bPESQUISARActionPerformed

    private void bALTERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bALTERARActionPerformed
        FuncionarioRN funcionarioRN = new FuncionarioRN();
        funcionarioRN.atualizar(funcionario);
    }//GEN-LAST:event_bALTERARActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Funcionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bALTERAR;
    private javax.swing.JToggleButton bCADASTRAR;
    private javax.swing.JButton bEXCLUIR;
    private javax.swing.JButton bPESQUISAR;
    private javax.swing.JButton bTODOS;
    private javax.swing.JButton bVOLTAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tTABELA;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
