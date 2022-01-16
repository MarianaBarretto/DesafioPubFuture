package view;

import controller.ControllerReceitas;
import model.ModelReceitas;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Mariana Barretto
 */
public class ViewReceitas extends javax.swing.JFrame {
      ModelReceitas modelReceitas = new ModelReceitas();
      ControllerReceitas controllerReceitas = new ControllerReceitas();
      List<ModelReceitas> listaModelReceitas = new ArrayList<>();  
      String cadAlt = "cad";
 
      
      
    public ViewReceitas() {
        initComponents();
        setLocationRelativeTo(null);
        exibirReceitas();   
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtfValor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfDescricao = new javax.swing.JTextField();
        jtfConta = new javax.swing.JTextField();
        jbSalvar = new javax.swing.JButton();
        jtfDataRecebimentoEsperado = new javax.swing.JFormattedTextField();
        jtfDataRecebimento = new javax.swing.JFormattedTextField();
        jcbSalario = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtReceitas1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jtfId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Receitas");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/excluir.png"))); // NOI18N
        jButton1.setText("Remover");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/editar.png"))); // NOI18N
        jButton4.setText("Editar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Cadastrar Receitas");

        jtfValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfValorActionPerformed(evt);
            }
        });

        jLabel2.setText("Data Recebimento Esperado");

        jLabel3.setText("Data Recebimento");

        jLabel4.setText("Tipo Receita");

        jLabel5.setText("Descrição");

        jLabel6.setText("Valor");

        jLabel7.setText("Conta");

        jtfDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDescricaoActionPerformed(evt);
            }
        });

        jtfConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfContaActionPerformed(evt);
            }
        });

        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/salvar.png"))); // NOI18N
        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jcbSalario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sálario", "Presente", "Prêmio", "Outros" }));
        jcbSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSalarioActionPerformed(evt);
            }
        });

        jtReceitas1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Valor", "Data Recebimento", "Data Recebimento Esperado", "Descrição", "Conta", "Tipo Receita"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtReceitas1);
        if (jtReceitas1.getColumnModel().getColumnCount() > 0) {
            jtReceitas1.getColumnModel().getColumn(0).setMinWidth(40);
            jtReceitas1.getColumnModel().getColumn(0).setPreferredWidth(40);
            jtReceitas1.getColumnModel().getColumn(0).setMaxWidth(40);
            jtReceitas1.getColumnModel().getColumn(1).setMinWidth(50);
            jtReceitas1.getColumnModel().getColumn(1).setPreferredWidth(50);
            jtReceitas1.getColumnModel().getColumn(1).setMaxWidth(50);
            jtReceitas1.getColumnModel().getColumn(2).setMinWidth(100);
            jtReceitas1.getColumnModel().getColumn(2).setPreferredWidth(100);
            jtReceitas1.getColumnModel().getColumn(2).setMaxWidth(100);
            jtReceitas1.getColumnModel().getColumn(3).setMinWidth(150);
            jtReceitas1.getColumnModel().getColumn(3).setPreferredWidth(150);
            jtReceitas1.getColumnModel().getColumn(3).setMaxWidth(150);
            jtReceitas1.getColumnModel().getColumn(4).setMinWidth(80);
            jtReceitas1.getColumnModel().getColumn(4).setPreferredWidth(80);
            jtReceitas1.getColumnModel().getColumn(4).setMaxWidth(80);
            jtReceitas1.getColumnModel().getColumn(5).setMinWidth(50);
            jtReceitas1.getColumnModel().getColumn(5).setPreferredWidth(50);
            jtReceitas1.getColumnModel().getColumn(5).setMaxWidth(50);
        }

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/limpar.png"))); // NOI18N
        jButton5.setText("Limpar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jtfId.setEditable(false);

        jLabel9.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(205, 205, 205))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jbSalvar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(121, 121, 121)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jtfDataRecebimentoEsperado, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtfConta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfDataRecebimento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jcbSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfDataRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfDataRecebimentoEsperado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62)
                .addComponent(jbSalvar)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfValorActionPerformed
      
    }//GEN-LAST:event_jtfValorActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
       
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jtfDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDescricaoActionPerformed
       
    }//GEN-LAST:event_jtfDescricaoActionPerformed

    private void jtfContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfContaActionPerformed
        
    }//GEN-LAST:event_jtfContaActionPerformed
private void limparFormulario(){
        jtfId.setText("");  
        jtfValor.setText("");
        jtfDataRecebimento.setText("");
        jtfDataRecebimentoEsperado.setText("");
        jtfDescricao.setText("");
        jtfConta.setText("");
        cadAlt = "cad";
        
       
    } 

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        modelReceitas = new ModelReceitas();
        modelReceitas.setValor(Double.parseDouble(jtfValor.getText()));
        modelReceitas.setDataRecebimento(jtfDataRecebimento.getText());
        modelReceitas.setDataRecebimentoEsperado(jtfDataRecebimentoEsperado.getText());
        modelReceitas.setDescricao(jtfDescricao.getText());
        modelReceitas.setConta(Integer.parseInt(jtfConta.getText()));
        modelReceitas.setTipoReceita(jcbSalario.getSelectedItem().toString());
        if (cadAlt.equals("cad")){
            if (controllerReceitas.salvarReceitasController(modelReceitas)) {
                //cadastrou Receita
                JOptionPane.showMessageDialog(this, "Receita cadastrada com sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                // limpar
                limparFormulario();
                exibirReceitas();
            } else {
                // não cadastrou
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar receita!", "Erro", JOptionPane.ERROR_MESSAGE);

            }
        }else{
          modelReceitas.setIdReceitas(Integer.parseInt(jtfId.getText()));
           if (controllerReceitas.atualizarReceitasController(modelReceitas)) {
                //alterou conta
                JOptionPane.showMessageDialog(this, "Receita alterada com sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                // limpar
                limparFormulario();
                exibirReceitas();
            } else {
                // não alterou
                JOptionPane.showMessageDialog(this, "Erro ao alterar Receita!", "Erro", JOptionPane.ERROR_MESSAGE);

            }
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      int linha = jtReceitas1.getSelectedRow();
        if (linha < 0 ){
            JOptionPane.showMessageDialog(this, "Você deve seleciononar uma receita!");
        }else{
            int pIdReceitas = (int) jtReceitas1.getValueAt(linha, 0);
            if (controllerReceitas.excluirReceitasController(pIdReceitas)){
                exibirReceitas();
                limparFormulario();
                 JOptionPane.showMessageDialog(this, "Receita removida com sucesso!");
            }else{
                 JOptionPane.showMessageDialog(this, "Erro ao remover usuário");
        
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        cadAlt = "alt";
        modelReceitas = new ModelReceitas();        
        int linha = jtReceitas1.getSelectedRow();
        if (linha < 0 ){
            JOptionPane.showMessageDialog(this, "Você deve seleciononar uma receita!");
        }else{
            int pIdReceitas = (int) jtReceitas1.getValueAt(linha, 0);
           modelReceitas = controllerReceitas.getReceitasController(pIdReceitas);
           jtfId.setText(String.valueOf(modelReceitas.getIdReceitas()));
           jtfValor.setText(String.valueOf(modelReceitas.getValor()));
           jtfDataRecebimento.setText(modelReceitas.getDataRecebimento());
           jtfDataRecebimentoEsperado.setText(modelReceitas.getDataRecebimentoEsperado());
           jtfDescricao.setText(modelReceitas.getDescricao());
           jtfConta.setText(String.valueOf(modelReceitas.getConta()));
           jcbSalario.setSelectedItem(modelReceitas.getTipoReceita());
           
            
       }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        limparFormulario();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jcbSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSalarioActionPerformed
        
    }//GEN-LAST:event_jcbSalarioActionPerformed

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
            java.util.logging.Logger.getLogger(ViewReceitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewReceitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewReceitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewReceitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewReceitas().setVisible(true);
            }
        });
    }

    private void exibirReceitas(){
      listaModelReceitas = controllerReceitas.getListaReceitasController();
      DefaultTableModel modelo = (DefaultTableModel) jtReceitas1.getModel();
      modelo.setNumRows (0);
      
      for (int i = 0; i < listaModelReceitas.size(); i++){
        modelo.addRow(new Object[]{
           listaModelReceitas.get(i).getIdReceitas(),    
           listaModelReceitas.get(i).getValor(),
           listaModelReceitas.get(i).getDataRecebimento(),
           listaModelReceitas.get(i).getDataRecebimentoEsperado(),
           listaModelReceitas.get(i).getDescricao(),
           listaModelReceitas.get(i).getConta(),
           listaModelReceitas.get(i).getTipoReceita()
        });
      
      }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox<String> jcbSalario;
    private javax.swing.JTable jtReceitas1;
    private javax.swing.JTextField jtfConta;
    private javax.swing.JFormattedTextField jtfDataRecebimento;
    private javax.swing.JFormattedTextField jtfDataRecebimentoEsperado;
    private javax.swing.JTextField jtfDescricao;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfValor;
    // End of variables declaration//GEN-END:variables
}
