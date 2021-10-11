package sistema_hotel;

import BaseDatos.Conexion;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author redbi
 */
public class Inicio extends javax.swing.JFrame {

    private int cont = 0;
    private int conta = 0;

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        llenarTablaEmpleados();
        llenarTablaHabitaciones();
        CambioEnTabla();
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fSLabel1 = new LIB.FSLabel();
        lblUsuario = new javax.swing.JLabel();
        lblPuesto = new javax.swing.JLabel();
        btnCambiarUsuario = new javax.swing.JButton();
        btnHabitaciones = new javax.swing.JButton();
        btnReservaciones = new javax.swing.JButton();
        btnEmpleados = new javax.swing.JButton();
        btnPagos = new javax.swing.JButton();
        btnCCaja = new javax.swing.JButton();
        btnCEmpleados = new javax.swing.JButton();
        btnCPagos = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHabitaciones = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnVer = new javax.swing.JButton();
        btnGenerarReser = new javax.swing.JButton();
        btnVerR = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        btnAgregarEmpleado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(131, 25, 40));

        fSLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/administrador.png"))); // NOI18N
        fSLabel1.setText("");

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Maria Delgado");

        lblPuesto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPuesto.setForeground(new java.awt.Color(255, 255, 255));
        lblPuesto.setText("Administrador");

        btnCambiarUsuario.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btnCambiarUsuario.setText("Cambiar de usuario");

        btnHabitaciones.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnHabitaciones.setText("Habitaciones");
        btnHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacionesActionPerformed(evt);
            }
        });

        btnReservaciones.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnReservaciones.setText("Reservaciones");

        btnEmpleados.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEmpleados.setText("Empleados");

        btnPagos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPagos.setText("Pagos");

        btnCCaja.setText("Control de caja");

        btnCEmpleados.setText("Control de empleados");

        btnCPagos.setText("Control de pagos");

        btnSalir.setBackground(new java.awt.Color(0, 0, 0));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("X");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        tablaHabitaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Tipo", "Piso", "Edificio"
            }
        ));
        tablaHabitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaHabitacionesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaHabitaciones);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Habitaciones");

        btnVer.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        btnVer.setText("Ver Registros");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        btnGenerarReser.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        btnGenerarReser.setText("Generar Reservaciones");
        btnGenerarReser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReserActionPerformed(evt);
            }
        });

        btnVerR.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        btnVerR.setText("Ver Reservaciones");
        btnVerR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 884, Short.MAX_VALUE)
                        .addGap(21, 21, 21))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnVerR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGenerarReser)
                .addGap(18, 18, 18)
                .addComponent(btnVer)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerarReser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVerR, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Habitaciones", jPanel3);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 929, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 751, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Pagos", jPanel6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 929, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 751, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Cpa", jPanel7);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 929, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 751, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Cem", jPanel8);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 929, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 751, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("CCa", jPanel9);

        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Nombre", "Puesto"
            }
        ));
        jScrollPane2.setViewportView(tablaEmpleados);

        btnAgregarEmpleado.setText("Agregar");
        btnAgregarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEmpleadoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Empleados");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnAgregarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Empleados", jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnReservaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHabitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPagos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCCaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCambiarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCEmpleados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCPagos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fSLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsuario)
                            .addComponent(lblPuesto))))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTabbedPane1)
                        .addGap(28, 28, 28))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fSLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPuesto)
                .addGap(18, 18, 18)
                .addComponent(btnHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCambiarUsuario)
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addGap(29, 29, 29))
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
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacionesActionPerformed
        //hola
    }//GEN-LAST:event_btnHabitacionesActionPerformed

    private void btnAgregarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEmpleadoActionPerformed
        Agregar_Empleado ae = new Agregar_Empleado(this, true);
        llenarTablaEmpleados();
    }//GEN-LAST:event_btnAgregarEmpleadoActionPerformed

    private void btnGenerarReserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReserActionPerformed
        CrearReservacion();
    }//GEN-LAST:event_btnGenerarReserActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        verReservaciones();
    }//GEN-LAST:event_btnVerActionPerformed

    private void btnVerRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerRActionPerformed
       Mostrar_Reservaciones();
    }//GEN-LAST:event_btnVerRActionPerformed

    private void tablaHabitacionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaHabitacionesMousePressed
       CambioEnTabla();
    }//GEN-LAST:event_tablaHabitacionesMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarEmpleado;
    private javax.swing.JButton btnCCaja;
    private javax.swing.JButton btnCEmpleados;
    private javax.swing.JButton btnCPagos;
    private javax.swing.JButton btnCambiarUsuario;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnGenerarReser;
    private javax.swing.JButton btnHabitaciones;
    private javax.swing.JButton btnPagos;
    private javax.swing.JButton btnReservaciones;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVer;
    private javax.swing.JButton btnVerR;
    private LIB.FSLabel fSLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblPuesto;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTable tablaEmpleados;
    private javax.swing.JTable tablaHabitaciones;
    // End of variables declaration//GEN-END:variables

    private void llenarTablaEmpleados() {
        Conexion con = new Conexion();
        ResultSet res = null;
        String sql = "SELECT * FROM empleados";
        Object nf[] = {null, null, null, null};
        String tipoPuesto = "";
        DefaultTableModel dtm = (DefaultTableModel) tablaEmpleados.getModel();
        //limpiar la tabla
        for (int b = (cont - 1); b >= 0; b--) {
            dtm.removeRow(b);
        }
        cont = 0;
        try {
            con.Conectar();
            res = con.Consulta(sql);
            while (res.next()) {
                dtm.addRow(nf);
                tablaEmpleados.setValueAt(res.getString(1), cont, 0);
                tablaEmpleados.setValueAt(res.getString(2), cont, 1);
                int valor = res.getInt(6);
                switch(valor){
                    case 0: tipoPuesto = "Recepcionista"; break;
                    case 1: tipoPuesto = "Mucama";break;
                    case 2: tipoPuesto = "Administrador";break;
                    default:break;
                }
                tablaEmpleados.setValueAt(tipoPuesto, cont, 2);
                cont++;
            }
            con.Cerrar();
        } catch (Exception e) {
            System.out.println("Llenar >> " + e.getMessage());
        }
    }

    private void llenarTablaHabitaciones() {

         Conexion con = new Conexion();
        ResultSet res = null;
        String sql = "SELECT * FROM habitaciones";
        Object nf[] = {null, null, null, null};
        String tipoHabitacion = "";
        DefaultTableModel dtm = (DefaultTableModel) tablaHabitaciones.getModel();
        //limpiar la tabla
        System.out.println("Funciona");
        for (int b = (conta - 1); b >= 0; b--) {
            dtm.removeRow(b);
           System.out.println("Sucede");
        }
        conta = 0;
        try {
            con.Conectar();
            res = con.Consulta(sql);
            while (res.next()) {
                dtm.addRow(nf);

                tablaHabitaciones.setValueAt(res.getString(1), conta, 0);
                tablaHabitaciones.setValueAt(res.getString(3), conta, 2);
                tablaHabitaciones.setValueAt(res.getString(4), conta, 3);
                int valor = res.getInt(2);
                switch(valor){
                    case 0: tipoHabitacion = "Dobles"; break;
                    case 1: tipoHabitacion = "Con Jaccuzi";break;
                    case 2: tipoHabitacion = "Suite";break;
                    default:break;
                }
                tablaHabitaciones.setValueAt(tipoHabitacion, conta, 1);
                conta++;
            }
            con.Cerrar();
        } catch (Exception e) {
            System.out.println("Llenar habitaciones>> " + e.getMessage());
        }
    }

    private void CrearReservacion() {
        Agregar_Reservacion ar = new Agregar_Reservacion(this, true);
    }

    private void verReservaciones() {
        Ver_Reservaciones vr = new Ver_Reservaciones(this, true);
    }
    
    private void CambioEnTabla() {
        int select = tablaHabitaciones.getSelectedRow();
        if (select == -1) {
            btnVerR.setEnabled(false);
        } else {
            btnVerR.setEnabled(true);
        }
    }

    private void Mostrar_Reservaciones() {
        DefaultTableModel tm = (DefaultTableModel) tablaHabitaciones.getModel();
        String valor = (String) tm.getValueAt(tablaHabitaciones.getSelectedRow(),0);
        int habitacion =  Integer.parseInt(valor);
        System.out.println("hab"+ habitacion);
       Mostrar_Reservaciones mr = new Mostrar_Reservaciones(this, true, habitacion);
       mr.setVisible(true);
       mr.setLocationRelativeTo(null);
    }

}
