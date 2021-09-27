package sistema_hotel;
/**
 *
 * @author redbi
 */
public class Agregar_Reservacion extends javax.swing.JDialog {

    /**
     * Creates new form Agregar_Reservacion
     */
    public Agregar_Reservacion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNombreC = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTelC = new javax.swing.JTextField();
        combHab = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dateEntra = new datechooser.beans.DateChooserCombo();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dateSale = new datechooser.beans.DateChooserCombo();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblTotalNoches = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblPrecioNoche = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lblPrecioSub = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        combDisponibles = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBackground(new java.awt.Color(131, 25, 40));

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");

        txtNombreC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombreC.setName("Nombre"); // NOI18N
        txtNombreC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreCVaciar(evt);
            }
        });
        txtNombreC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Telefono:");

        txtTelC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        combHab.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        combHab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doble", "Jacuzzi", "Suite" }));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tipo de habitación:");

        txtCorreo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Correo:");

        dateEntra.setCurrentView(new datechooser.view.appearance.AppearancesList("Bordered",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(187, 187, 187),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(187, 187, 187),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(187, 187, 187),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(187, 187, 187),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    dateEntra.setCalendarPreferredSize(new java.awt.Dimension(280, 200));
    dateEntra.setNothingAllowed(false);
    dateEntra.setFormat(2);
    dateEntra.setFieldFont(new java.awt.Font("Nirmala UI", java.awt.Font.PLAIN, 16));

    jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel7.setForeground(new java.awt.Color(255, 255, 255));
    jLabel7.setText("Fecha de entrada:");

    jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel8.setForeground(new java.awt.Color(255, 255, 255));
    jLabel8.setText("Fecha de salida:");

    dateSale.setCurrentView(new datechooser.view.appearance.AppearancesList("Contrast",
        new datechooser.view.appearance.ViewAppearance("custom",
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12),
                new java.awt.Color(187, 187, 187),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12),
                new java.awt.Color(187, 187, 187),
                new java.awt.Color(0, 0, 255),
                true,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12),
                new java.awt.Color(0, 0, 255),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12),
                new java.awt.Color(128, 128, 128),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12),
                new java.awt.Color(187, 187, 187),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12),
                new java.awt.Color(187, 187, 187),
                new java.awt.Color(255, 0, 0),
                false,
                false,
                new datechooser.view.appearance.swing.ButtonPainter()),
            (datechooser.view.BackRenderer)null,
            false,
            true)));
dateSale.setCalendarPreferredSize(new java.awt.Dimension(280, 200));
dateSale.setFieldFont(new java.awt.Font("Nirmala UI", java.awt.Font.PLAIN, 16));

jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
jLabel9.setForeground(new java.awt.Color(255, 255, 255));
jLabel9.setText("Total de noches:");

lblTotalNoches.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
lblTotalNoches.setForeground(new java.awt.Color(255, 255, 255));
lblTotalNoches.setText("4 noches");

jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
jLabel11.setForeground(new java.awt.Color(255, 255, 255));
jLabel11.setText("Precio por noche:");

lblPrecioNoche.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
lblPrecioNoche.setForeground(new java.awt.Color(255, 255, 255));
lblPrecioNoche.setText("$ 1500");

jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
jLabel13.setForeground(new java.awt.Color(255, 255, 255));
jLabel13.setText("Subtotal:");

lblPrecioSub.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
lblPrecioSub.setForeground(new java.awt.Color(255, 255, 255));
lblPrecioSub.setText("$ 6000");

jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
jLabel4.setForeground(new java.awt.Color(255, 255, 255));
jLabel4.setText("Descuento:");

txtDesc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
jLabel15.setForeground(new java.awt.Color(255, 255, 255));
jLabel15.setText("$");

jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 27)); // NOI18N
jLabel16.setForeground(new java.awt.Color(255, 255, 255));
jLabel16.setText("Total:");

lblTotal.setFont(new java.awt.Font("Segoe UI", 0, 27)); // NOI18N
lblTotal.setForeground(new java.awt.Color(255, 255, 255));
lblTotal.setText("$ 6000");

jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
jLabel10.setForeground(new java.awt.Color(255, 255, 255));
jLabel10.setText("Habitaciones disponibles:");

combDisponibles.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
combDisponibles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0000" }));

javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
jPanel1.setLayout(jPanel1Layout);
jPanel1Layout.setHorizontalGroup(
    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(151, 151, 151)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7)
                                .addComponent(jLabel3)
                                .addComponent(txtTelC)
                                .addComponent(jLabel8)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblTotalNoches))
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dateEntra, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                .addComponent(dateSale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combHab, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(combDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblPrecioNoche))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(lblPrecioSub))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(lblTotal))
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 162, Short.MAX_VALUE))))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGap(26, 26, 26)
            .addComponent(jLabel2)
            .addGap(18, 18, 18)
            .addComponent(txtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jLabel5)
            .addGap(18, 18, 18)
            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel3)
                    .addGap(18, 18, 18)
                    .addComponent(txtTelC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel7)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(dateEntra, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel8)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(dateSale, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 6, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel6)
                    .addGap(18, 18, 18)
                    .addComponent(combHab, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel10)
                    .addGap(18, 18, 18)
                    .addComponent(combDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(lblPrecioNoche))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(lblTotalNoches))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(lblPrecioSub))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel16)
                .addComponent(lblTotal)
                .addComponent(jLabel4)
                .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel15))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(32, 32, 32)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(45, 45, 45))
    );

    jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("Reservaciones");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1)
            .addGap(294, 294, 294))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(0, 2, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //hola
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtNombreCVaciar(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreCVaciar

    }//GEN-LAST:event_txtNombreCVaciar

    private void txtNombreCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> combDisponibles;
    private javax.swing.JComboBox<String> combHab;
    private datechooser.beans.DateChooserCombo dateEntra;
    private datechooser.beans.DateChooserCombo dateSale;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblPrecioNoche;
    private javax.swing.JLabel lblPrecioSub;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalNoches;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtNombreC;
    private javax.swing.JTextField txtTelC;
    // End of variables declaration//GEN-END:variables

    
}
