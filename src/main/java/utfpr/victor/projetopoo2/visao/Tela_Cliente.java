/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.victor.projetopoo2.visao;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import utfpr.victor.projetopoo2.modelo.rn.ClienteRN;
import utfpr.victor.projetopoo2.modelo.vo.Cliente;

/**
 *
 * @author victo
 */
public class Tela_Cliente extends javax.swing.JFrame {
    private Cliente cliente;
    private ClienteRN clienteRN;
    private List<Cliente> clientes;
    

    /**
     * Creates new form Tela_Funcionario
     */
    public Tela_Cliente() {
        initComponents();
        this.cliente = new Cliente();
        this.clienteRN = new ClienteRN();
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
        bATUALIZAR = new javax.swing.JButton();
        bEXCLUIR = new javax.swing.JButton();
        bPESQUISA = new javax.swing.JButton();
        txtPesquisar = new javax.swing.JTextField();
        bTODOS = new javax.swing.JButton();
        bVOLTAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Cliente");

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
                "Nome", "CPF", "Telefone", "Endereco"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tTABELA);

        bATUALIZAR.setText("Atualizar");
        bATUALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bATUALIZARActionPerformed(evt);
            }
        });

        bEXCLUIR.setText("Excluir");
        bEXCLUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEXCLUIRActionPerformed(evt);
            }
        });

        bPESQUISA.setText("Pesquisar");
        bPESQUISA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPESQUISAActionPerformed(evt);
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
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bPESQUISA)
                        .addGap(18, 18, 18)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 46, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(bTODOS, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bCADASTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bATUALIZAR, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bEXCLUIR, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(bVOLTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bPESQUISA)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bEXCLUIR)
                    .addComponent(bATUALIZAR)
                    .addComponent(bCADASTRAR)
                    .addComponent(bTODOS)
                    .addComponent(bVOLTAR))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCADASTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCADASTRARActionPerformed
       cadastroCliente cadCliente = new cadastroCliente();
       cadCliente.setVisible(true);
    }//GEN-LAST:event_bCADASTRARActionPerformed

    private void bEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEXCLUIRActionPerformed
        ClienteRN clienteRN = new ClienteRN();
        clienteRN.excluir(cliente);
    }//GEN-LAST:event_bEXCLUIRActionPerformed

    private void bTODOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTODOSActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) tTABELA.getModel();
            model.setNumRows(0);
            
            this.clientes = clienteRN.listarTodos();
            for(Cliente cliente : clientes){
                String [] linha = {cliente.getNome(), cliente.getCpf(), cliente.getTelefone(), cliente.getEndereco()};
                model.addRow(linha);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_bTODOSActionPerformed

    private void bPESQUISAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPESQUISAActionPerformed
        String filtro = txtPesquisar.getName();
        
        try {
            DefaultTableModel model = (DefaultTableModel) tTABELA.getModel();
            model.setNumRows(0);
            this.clientes = clienteRN.listarFitroLike(filtro);
            for(Cliente cliente : clientes){
                String [] linha = {cliente.getNome(), cliente.getCpf(),cliente.getTelefone(),cliente.getEndereco()};
                model.addRow(linha);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_bPESQUISAActionPerformed

    private void bVOLTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVOLTARActionPerformed
        Tela_ADM tela_adm = new Tela_ADM();
        tela_adm.setVisible(true);
    }//GEN-LAST:event_bVOLTARActionPerformed

    private void bATUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bATUALIZARActionPerformed
        ClienteRN clienteRN = new ClienteRN();
        clienteRN.atualizar(cliente);
    }//GEN-LAST:event_bATUALIZARActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bATUALIZAR;
    private javax.swing.JToggleButton bCADASTRAR;
    private javax.swing.JButton bEXCLUIR;
    private javax.swing.JButton bPESQUISA;
    private javax.swing.JButton bTODOS;
    private javax.swing.JButton bVOLTAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tTABELA;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
