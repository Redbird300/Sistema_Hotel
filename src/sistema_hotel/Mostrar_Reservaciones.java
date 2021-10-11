package sistema_hotel;

import BaseDatos.Conexion;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author redbi
 */
public class Mostrar_Reservaciones extends javax.swing.JDialog {
    private int conta =0;
    private int habitacion = 0;
    /**
     * Creates new form Mostrar_Reservaciones
     */
    public Mostrar_Reservaciones(java.awt.Frame parent, boolean modal, int hab) {
        super(parent, modal);
        initComponents();
        habitacion = hab;
        lblHabitacion.setText("Habitación: "+hab);
         Llenar_Registros(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaReserHab = new javax.swing.JTable();
        chbFecAct = new javax.swing.JCheckBox();
        lblHabitacion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(131, 25, 40));

        tablaReserHab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#Reservacion", "Cliente", "Telefono", "Fecha de Entrada", "Fecha de salida"
            }
        ));
        jScrollPane3.setViewportView(tablaReserHab);

        chbFecAct.setText("Ordenar por fecha actual");
        chbFecAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbFecActActionPerformed(evt);
            }
        });

        lblHabitacion.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        lblHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        lblHabitacion.setText("Habitación:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chbFecAct)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lblHabitacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbFecAct)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reservaciones de la Habitación");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chbFecActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbFecActActionPerformed
        if(chbFecAct.isSelected() == true){
            Llenar_Registros(1);
        }else{
            Llenar_Registros(0);
        }
    }//GEN-LAST:event_chbFecActActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chbFecAct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblHabitacion;
    private javax.swing.JTable tablaReserHab;
    // End of variables declaration//GEN-END:variables

public void Llenar_Registros(int opc) {
        Conexion con = new Conexion();
        ResultSet res = null;
         String sql = null;
        if(opc == 0 ){
         sql = "SELECT * FROM reservaciones WHERE habitacion =  "+habitacion;
        }else{
            sql = "select * from reservaciones where habitacion = "+habitacion+" AND fecha_entra >= curdate() ORDER by fecha_entra";
        }
        Object nf[] = {null, null, null, null};
        DefaultTableModel dtm = (DefaultTableModel) tablaReserHab.getModel();
        //limpiar la tabla
        for (int b = (conta - 1); b >= 0; b--) {
            dtm.removeRow(b);
        }
        conta = 0;
        try {
            con.Conectar();
            res = con.Consulta(sql);
            while (res.next()) {
                dtm.addRow(nf);
                tablaReserHab.setValueAt(res.getString(1), conta, 0);//#reservacion
                tablaReserHab.setValueAt(res.getString(2), conta, 1);//Cliente
                tablaReserHab.setValueAt(res.getString(3), conta, 2);//telefono
                tablaReserHab.setValueAt(res.getString(7), conta, 3);//Fecha entra
                tablaReserHab.setValueAt(res.getString(8), conta, 4);//Fecha Sale
                conta++;
            }
            con.Cerrar();
        } catch (Exception e) {
            System.out.println("Llenar RR>> " + e.getMessage());
        }
    }
}
