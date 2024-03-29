/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_hotel;

import Metodos.Guardar_Reservaciones;

/**
 *
 * @author redbi
 */
public class metodo_Pago extends javax.swing.JDialog {
    private int opc;
    private double costo;
    private int reserva;
    private boolean ejecuta = false;

    public metodo_Pago(java.awt.Frame parent, boolean modal, double total, int mod) {
        super(parent, modal);
        opc = mod;
        Guardar_Reservaciones gr = new Guardar_Reservaciones();
        reserva = gr.folio(mod);
        costo = total;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fSGradientPanel1 = new LIB.FSGradientPanel();
        btnEfectivo = new javax.swing.JButton();
        btnTarjeta = new javax.swing.JButton();
        btnTransferencia = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setType(java.awt.Window.Type.POPUP);

        btnEfectivo.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        btnEfectivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pago-en-efectivo.png"))); // NOI18N
        btnEfectivo.setText("Efectivo");
        btnEfectivo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEfectivo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEfectivo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEfectivoActionPerformed(evt);
            }
        });

        btnTarjeta.setFont(new java.awt.Font("Nirmala UI", 1, 20)); // NOI18N
        btnTarjeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tarjeta-de-credito.png"))); // NOI18N
        btnTarjeta.setText("Tarjeta");
        btnTarjeta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTarjeta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTarjetaActionPerformed(evt);
            }
        });

        btnTransferencia.setFont(new java.awt.Font("Nirmala UI", 1, 20)); // NOI18N
        btnTransferencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/transferencia-de-dinero.png"))); // NOI18N
        btnTransferencia.setText("Transferencia");
        btnTransferencia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTransferencia.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnTransferencia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferenciaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 28)); // NOI18N
        jLabel1.setText("Tipo de pago");

        javax.swing.GroupLayout fSGradientPanel1Layout = new javax.swing.GroupLayout(fSGradientPanel1);
        fSGradientPanel1.setLayout(fSGradientPanel1Layout);
        fSGradientPanel1Layout.setHorizontalGroup(
            fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fSGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                        .addComponent(btnEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        fSGradientPanel1Layout.setVerticalGroup(
            fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fSGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fSGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEfectivoActionPerformed
        pagoEfectivo();
    }//GEN-LAST:event_btnEfectivoActionPerformed

    private void btnTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTarjetaActionPerformed
        pagoTarjeta();
    }//GEN-LAST:event_btnTarjetaActionPerformed

    private void btnTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferenciaActionPerformed
        pagoTrans();
    }//GEN-LAST:event_btnTransferenciaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEfectivo;
    private javax.swing.JButton btnTarjeta;
    private javax.swing.JButton btnTransferencia;
    private LIB.FSGradientPanel fSGradientPanel1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    private void pagoEfectivo() {
        Pago_Efectivo pe = new Pago_Efectivo(null, true, costo, reserva, opc);
        pe.setLocationRelativeTo(null);
        pe.setVisible(true);
        Boolean pagado = pe.Pagado();
        if(pagado == true){
           ejecuta = true;  
        }    
        this.dispose();
    }

    private void pagoTarjeta() {
        Pago_Tarjeta pt = new Pago_Tarjeta(null, true, costo, reserva, opc);
        pt.setLocationRelativeTo(null);
        pt.setVisible(true);
        Boolean pagado = pt.Pagado();
        if(pagado == true){
           ejecuta = true;  
        }    
        this.dispose();
    }

    private void pagoTrans() {
        Pago_Transferencia ptrans = new Pago_Transferencia(null, true, costo, reserva, opc);
        ptrans.setLocationRelativeTo(null);
        ptrans.setVisible(true);
        Boolean pagado = ptrans.Pagado();
        if(pagado == true){
           ejecuta = true;  
        }    
        this.dispose();
    }
    
    public boolean guardar(){
        return ejecuta;           
    }
}
