package view;

import controller.ControllerDespesas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelDespesas;

/**
 *
 * @author Mariana Barretto
 */
public class ViewDespesas extends javax.swing.JFrame {
     ModelDespesas modelDespesas = new ModelDespesas();
      ControllerDespesas controllerDespesas = new ControllerDespesas();
      List<ModelDespesas> listaModelDespesas = new ArrayList<>();  
      String cadAlt = "cad";
   
      
      
    public ViewDespesas() {
        initComponents();
        setLocationRelativeTo(null);
        exibirDespesas(); 
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDespesa = new javax.swing.JTable();
        jbRemover = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtfValor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfConta = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jftData = new javax.swing.JFormattedTextField();
        jftEsperado = new javax.swing.JFormattedTextField();
        jcbTipo = new javax.swing.JComboBox<>();
        jbLimpar = new javax.swing.JButton();
        jtfId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Despesas");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jtDespesa.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Valor ", "Data Pagamento", "Data Pagamento Esperado", "Conta", "Tipo Despesas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtDespesa);
        if (jtDespesa.getColumnModel().getColumnCount() > 0) {
            jtDespesa.getColumnModel().getColumn(0).setPreferredWidth(50);
            jtDespesa.getColumnModel().getColumn(1).setMinWidth(50);
            jtDespesa.getColumnModel().getColumn(1).setPreferredWidth(50);
            jtDespesa.getColumnModel().getColumn(1).setMaxWidth(50);
            jtDespesa.getColumnModel().getColumn(2).setMinWidth(150);
            jtDespesa.getColumnModel().getColumn(2).setPreferredWidth(150);
            jtDespesa.getColumnModel().getColumn(2).setMaxWidth(150);
            jtDespesa.getColumnModel().getColumn(3).setMinWidth(150);
            jtDespesa.getColumnModel().getColumn(3).setPreferredWidth(150);
            jtDespesa.getColumnModel().getColumn(3).setMaxWidth(150);
        }

        jbRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/excluir.png"))); // NOI18N
        jbRemover.setText("Remover");
        jbRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRemoverActionPerformed(evt);
            }
        });

        jbEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/editar.png"))); // NOI18N
        jbEditar.setText("Editar");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Cadastrar Despesas");

        jtfValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfValorActionPerformed(evt);
            }
        });

        jLabel2.setText("Data Pagamento Esperado");

        jLabel3.setText("Data Pagamento");

        jLabel4.setText("Tipo Despesa");

        jLabel6.setText("Valor");

        jLabel7.setText("Conta");

        jtfConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfContaActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/salvar.png"))); // NOI18N
        jButton5.setText("Salvar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jftEsperado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jftEsperadoActionPerformed(evt);
            }
        });

        jcbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alimentação", "Educação", "Lazer", "Moradia", "Roupa", "Súde", "Transportes", "Outros" }));

        jbLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/limpar.png"))); // NOI18N
        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jtfId.setEditable(false);
        jtfId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIdActionPerformed(evt);
            }
        });

        jLabel5.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(203, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(196, 196, 196))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jftEsperado, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jtfId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                            .addComponent(jLabel5))
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtfValor)
                                    .addComponent(jtfConta))
                                .addGap(107, 107, 107))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcbTipo, 0, 137, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jftData)))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jftData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jftEsperado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEditar)
                    .addComponent(jbRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimpar))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfValorActionPerformed
      
    }//GEN-LAST:event_jtfValorActionPerformed
private void limparFormulario(){
        jtfId.setText("");
        jtfValor.setText("");
        jftData.setText("");
        jftEsperado.setText("");
        jtfConta.setText("");
        cadAlt = "cad";
        
       
    } 
    private void jtfContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfContaActionPerformed
      
    }//GEN-LAST:event_jtfContaActionPerformed

    private void jbRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRemoverActionPerformed
        int linha = jtDespesa.getSelectedRow();
        if (linha < 0 ){
            JOptionPane.showMessageDialog(this, "Você deve seleciononar uma despesa!");
        }else{
            int pIdReceitas = (int) jtDespesa.getValueAt(linha, 0);
            if (controllerDespesas.excluirDespesasController(pIdReceitas)){
                 exibirDespesas();
                limparFormulario();
                 JOptionPane.showMessageDialog(this, "Despesa removida com sucesso!");
            }else{
                 JOptionPane.showMessageDialog(this, "Erro ao remover despesa");
        
            }
        }
    }//GEN-LAST:event_jbRemoverActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        limparFormulario();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       modelDespesas = new ModelDespesas();
        modelDespesas.setValor(Double.parseDouble(jtfValor.getText()));
        modelDespesas.setDataPagamento(jftData.getText());
        modelDespesas.setDataPagamentoEsperado(jftEsperado.getText());
        modelDespesas.setConta(Integer.parseInt(jtfConta.getText()));
        modelDespesas.setTipoDespesa(jcbTipo.getSelectedItem().toString());
        if (cadAlt.equals("cad")){
            if (controllerDespesas.salvarDespesasController(modelDespesas)) {
                //cadastrou Receita
                JOptionPane.showMessageDialog(this, "Despesa cadastrada com sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                // limpar
                limparFormulario();
                exibirDespesas();
            } else {
                // não cadastrou
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar Despesa!", "Erro", JOptionPane.ERROR_MESSAGE);

            }
        }else{
           modelDespesas.setIdDespesas(Integer.parseInt(jtfId.getText()));
           if (controllerDespesas.atualizarDespesasController(modelDespesas)) {
                //alterou conta
                JOptionPane.showMessageDialog(this, "Despesa alterado com sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                // limpar
                limparFormulario();
                exibirDespesas();
            } else {
                // não alterou
                JOptionPane.showMessageDialog(this, "Erro ao alterar despesa!", "Erro", JOptionPane.ERROR_MESSAGE);

            }
        }        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
       cadAlt = "alt";
        modelDespesas = new ModelDespesas();        
        int linha = jtDespesa.getSelectedRow();
        if (linha < 0 ){
            JOptionPane.showMessageDialog(this, "Você deve seleciononar uma despesa!");
        }else{
            int pIdDespesas = (int) jtDespesa.getValueAt(linha, 0);
           modelDespesas = controllerDespesas.getDespesasController(pIdDespesas);
           jtfId.setText(String.valueOf(modelDespesas.getIdDespesas()));
           jtfValor.setText(String.valueOf(modelDespesas.getValor()));
           jftData.setText(modelDespesas.getDataPagamento());
           jftEsperado.setText(modelDespesas.getDataPagamentoEsperado());
           jtfConta.setText(String.valueOf(modelDespesas.getConta()));
           jcbTipo.setSelectedItem(modelDespesas.getTipoDespesa());
           
            
       
    }           
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jftEsperadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftEsperadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jftEsperadoActionPerformed

    private void jtfIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIdActionPerformed

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
            java.util.logging.Logger.getLogger(ViewDespesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDespesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDespesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDespesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDespesas().setVisible(true);
            }
        });
    }
    private void exibirDespesas(){
      listaModelDespesas = controllerDespesas.getListaDespesasController();
      DefaultTableModel modelo = (DefaultTableModel) jtDespesa.getModel();
      modelo.setNumRows (0);
      
      for (int i = 0; i < listaModelDespesas.size(); i++){
        modelo.addRow(new Object[]{
           listaModelDespesas.get(i).getIdDespesas(),    
           listaModelDespesas.get(i).getValor(),
           listaModelDespesas.get(i).getDataPagamento(),
           listaModelDespesas.get(i).getDataPagamentoEsperado(),
           listaModelDespesas.get(i).getConta(),
           listaModelDespesas.get(i).getTipoDespesa()
        });
      
      }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbRemover;
    private javax.swing.JComboBox<String> jcbTipo;
    private javax.swing.JFormattedTextField jftData;
    private javax.swing.JFormattedTextField jftEsperado;
    private javax.swing.JTable jtDespesa;
    private javax.swing.JTextField jtfConta;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfValor;
    // End of variables declaration//GEN-END:variables
}
