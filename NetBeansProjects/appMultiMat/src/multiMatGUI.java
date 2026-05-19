
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author antares
 */
public class multiMatGUI extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(multiMatGUI.class.getName());

    DefaultTableModel modelTablaA;
    DefaultTableModel modelTablaB;
    DefaultTableModel modelTablaC;

    Matrix matA;
    Matrix matB;
    Matrix matC;

    public multiMatGUI() {
        initComponents();
        modelTablaA = (DefaultTableModel) tMatA.getModel();
        modelTablaA.setRowCount(Integer.parseInt(this.spRenA.getValue().toString()));
        modelTablaA.setColumnCount(Integer.parseInt(this.spColsA.getValue().toString()));

        tMatA.setShowHorizontalLines(true);
        tMatA.setShowVerticalLines(true);

        modelTablaB = (DefaultTableModel) tMatB.getModel();
        modelTablaB.setRowCount(Integer.parseInt(this.spRenB.getValue().toString()));
        modelTablaB.setColumnCount(Integer.parseInt(this.spColsB.getValue().toString()));

        tMatB.setShowHorizontalLines(true);
        tMatB.setShowVerticalLines(true);

        modelTablaC = (DefaultTableModel) tMatC.getModel();
        modelTablaC.setRowCount(Integer.parseInt(this.spRenA.getValue().toString()));
        modelTablaC.setColumnCount(Integer.parseInt(this.spColsB.getValue().toString()));
        tMatC.setShowHorizontalLines(true);
        tMatC.setShowVerticalLines(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        acciones = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tMatC = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tMatB = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tMatA = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        rbDefault = new javax.swing.JRadioButton();
        rbCapturar = new javax.swing.JRadioButton();
        rbRandom = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        spRenA = new javax.swing.JSpinner();
        spColsA = new javax.swing.JSpinner();
        spColsB = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        spRenB = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tMatC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tMatC);

        tMatB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tMatB);

        tMatA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tMatA);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 0, 13), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        acciones.add(rbDefault);
        rbDefault.setForeground(new java.awt.Color(0, 0, 0));
        rbDefault.setText("Default");
        rbDefault.addActionListener(this::rbDefaultActionPerformed);

        acciones.add(rbCapturar);
        rbCapturar.setForeground(new java.awt.Color(0, 0, 0));
        rbCapturar.setText("Capturar");
        rbCapturar.addActionListener(this::rbCapturarActionPerformed);

        acciones.add(rbRandom);
        rbRandom.setForeground(new java.awt.Color(0, 0, 0));
        rbRandom.setText("Random");
        rbRandom.addActionListener(this::rbRandomActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbDefault)
                    .addComponent(rbRandom)
                    .addComponent(rbCapturar))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(rbDefault)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbCapturar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbRandom)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel1.setText("X");

        jLabel2.setText("=");

        jLabel3.setText("Renglones Mat A");

        jLabel4.setText("Columnas Mat A");

        spRenA.setModel(new javax.swing.SpinnerNumberModel(3, 3, 5, 1));
        spRenA.setValue(3);
        spRenA.addChangeListener(this::spRenAStateChanged);

        spColsA.setModel(new javax.swing.SpinnerNumberModel(3, 3, 5, 1));
        spColsA.addChangeListener(this::spColsAStateChanged);

        spColsB.setModel(new javax.swing.SpinnerNumberModel(3, 3, 5, 1));
        spColsB.addChangeListener(this::spColsBStateChanged);

        jLabel5.setText("Renglones Mat B");

        jLabel6.setText("Columnas Mat B");

        spRenB.setModel(new javax.swing.SpinnerNumberModel(3, 3, 5, 1));
        spRenB.addChangeListener(this::spRenBStateChanged);

        jLabel7.setText("Alejandro Ortiz Talamantes 25130537");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spColsA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spRenA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spColsB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spRenB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(spRenA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(spColsA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(spRenB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(spColsB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(77, 77, 77)
                            .addComponent(jLabel1)
                            .addGap(71, 71, 71)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel2)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Datos");
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbDefaultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDefaultActionPerformed

        modelTablaA.setRowCount(0);
        modelTablaB.setRowCount(0);
        modelTablaC.setRowCount(0);

        int[][] matrizA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {1, 2, 3}};
        int[][] matrizB = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        spRenA.setValue(matrizA.length);
        spRenB.setValue(matrizB.length);

        spColsA.setValue(matrizA[0].length);
        spColsB.setValue(matrizB[0].length);

        matA = new Matrix(matrizA);
        matB = new Matrix(matrizB);

        Matrix.llenar(modelTablaA, matA);
        Matrix.llenar(modelTablaB, matB);

        multiC();

    }//GEN-LAST:event_rbDefaultActionPerformed

    private void spRenAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spRenAStateChanged
        modelTablaA.setRowCount(Integer.parseInt(this.spRenA.getValue().toString()));

        modelTablaC.setRowCount(Integer.parseInt(this.spRenA.getValue().toString()));
    }//GEN-LAST:event_spRenAStateChanged

    private void spColsAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spColsAStateChanged
        modelTablaA.setColumnCount(Integer.parseInt(this.spColsA.getValue().toString()));
    }//GEN-LAST:event_spColsAStateChanged

    private void spRenBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spRenBStateChanged
        modelTablaB.setRowCount(Integer.parseInt(this.spRenB.getValue().toString()));
    }//GEN-LAST:event_spRenBStateChanged

    private void spColsBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spColsBStateChanged
        modelTablaB.setColumnCount(Integer.parseInt(this.spColsB.getValue().toString()));

        modelTablaC.setColumnCount(Integer.parseInt(this.spColsB.getValue().toString()));
    }//GEN-LAST:event_spColsBStateChanged

    private void rbRandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRandomActionPerformed

        matA = new Matrix((int) spRenA.getValue(), (int) spColsA.getValue());
        matB = new Matrix((int) spRenB.getValue(), (int) spColsB.getValue());

        matA.asignarRdm();
        matB.asignarRdm();
        
        Matrix.llenar(modelTablaA, matA);
        Matrix.llenar(modelTablaB, matB);

        multiC();
    }//GEN-LAST:event_rbRandomActionPerformed

    private void rbCapturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCapturarActionPerformed

        if (tMatA.isEditing()) {
            tMatA.getCellEditor().stopCellEditing();
        }
        if (tMatB.isEditing()) {
            tMatB.getCellEditor().stopCellEditing();
        }

        matA = new Matrix((int) spRenA.getValue(), (int) spColsA.getValue());
        matB = new Matrix((int) spRenB.getValue(), (int) spColsB.getValue());

        Matrix.capturar(modelTablaA, matA);
        Matrix.capturar(modelTablaB, matB);

        multiC();

    }//GEN-LAST:event_rbCapturarActionPerformed

    public void multiC (){
        try {
            matC = matA.multi(matB);
            Matrix.llenar(modelTablaC, matC);

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error de Dimensiones", JOptionPane.ERROR_MESSAGE);
        }        
    }

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new multiMatGUI().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup acciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton rbCapturar;
    private javax.swing.JRadioButton rbDefault;
    private javax.swing.JRadioButton rbRandom;
    private javax.swing.JSpinner spColsA;
    private javax.swing.JSpinner spColsB;
    private javax.swing.JSpinner spRenA;
    private javax.swing.JSpinner spRenB;
    private javax.swing.JTable tMatA;
    private javax.swing.JTable tMatB;
    private javax.swing.JTable tMatC;
    // End of variables declaration//GEN-END:variables
}
