package pe.egcc.ventaapp.view;

import javax.swing.table.DefaultTableModel;
import pe.egcc.ventaapp.controller.VentaController;
import pe.egcc.ventaapp.model.Item;

/**
 *
 * @author Gustavo Coronel
 */
public class VentaView extends javax.swing.JFrame {

  private VentaController controller;
  
  /**
   * Creates new form VentaView
   */
  public VentaView() {
    initComponents();
    controller = new VentaController();
    llenarCombo();
  }
  
  private void llenarCombo(){
    cboTipo.removeAllItems();
    for(String tipo: controller.getTipos() ){
      cboTipo.addItem(tipo);
    }
    cboTipo.setSelectedIndex(-1);
  }
  

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    cboTipo = new javax.swing.JComboBox<>();
    jLabel2 = new javax.swing.JLabel();
    txtTotal = new javax.swing.JTextField();
    btnProcesar = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    tblData = new javax.swing.JTable();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("VENTA");

    jLabel1.setText("Tipo:");

    cboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

    jLabel2.setText("Total:");

    btnProcesar.setText("Procesar");
    btnProcesar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnProcesarActionPerformed(evt);
      }
    });

    tblData.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null},
        {null, null},
        {null, null},
        {null, null}
      },
      new String [] {
        "CONCEPTO", "VALOR"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class, java.lang.Double.class
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }
    });
    jScrollPane1.setViewportView(tblData);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(31, 31, 31)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(cboTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addGap(18, 18, 18)
        .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(41, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel1)
              .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(28, 28, 28)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel2)
              .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addGap(18, 18, 18)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
    // Datos
    String tipo = cboTipo.getSelectedItem().toString();
    double total = Double.parseDouble(txtTotal.getText());
    // Proceso
    Item[] repo = controller.procesar(tipo, total);
    // Reporte
    showRepo(repo);
  }//GEN-LAST:event_btnProcesarActionPerformed

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
      java.util.logging.Logger.getLogger(VentaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(VentaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(VentaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(VentaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new VentaView().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnProcesar;
  private javax.swing.JComboBox<String> cboTipo;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable tblData;
  private javax.swing.JTextField txtTotal;
  // End of variables declaration//GEN-END:variables

  private void showRepo(Item[] repo) {
    DefaultTableModel tabla;
    tabla = (DefaultTableModel) tblData.getModel();
    tabla.setRowCount(0);
    for (Item i : repo) {
      Object[] rowData 
           = {i.getConcepto(), i.getValor()};
      tabla.addRow(rowData);
    }
  
  }
}
