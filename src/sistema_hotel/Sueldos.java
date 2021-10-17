/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_hotel;

import BaseDatos.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author redbi
 */
public class Sueldos extends javax.swing.JDialog {

    int dia = 0;
    double total = 0;

    /**
     * Creates new form Sueldos
     */
    public Sueldos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        permitir();
        initComponents();
        fecha();
        lblLeyenda.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        btnPagar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblLeyenda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Header.setBackground(new java.awt.Color(131, 25, 40));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sueldos");

        lblFecha.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("Fecha: 24/24/24");

        btnPagar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnPagar.setText("Pagar");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mucama:");

        jTextField1.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jTextField1.setText("3500 $");
        jTextField1.setEnabled(false);

        jTextField2.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jTextField2.setText("6500 $");
        jTextField2.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Recepcionista:");

        jTextField3.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jTextField3.setText("9000 $");
        jTextField3.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Administrador:");

        lblLeyenda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblLeyenda.setForeground(new java.awt.Color(255, 255, 255));
        lblLeyenda.setText("Ya se ha realizado el pago del dia de hoy.");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(73, 73, 73)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFecha)
                .addGap(204, 204, 204))
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addComponent(lblLeyenda)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFecha)
                .addGap(47, 47, 47)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel5))
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(lblLeyenda)
                .addGap(38, 38, 38)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        registrar_caja();
    }//GEN-LAST:event_btnPagarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblLeyenda;
    // End of variables declaration//GEN-END:variables

    private void fecha() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy");
        String fecha_hoy = "" + dtf.format(LocalDateTime.now());
        lblFecha.setText("Fecha: " + fecha_hoy);
        DateTimeFormatter day = DateTimeFormatter.ofPattern("dd");
        dia = Integer.valueOf(day.format(LocalDateTime.now()));
    }

    private void pagar() {
        Conexion con = new Conexion();
        ResultSet res = null;
        String sqla = "SELECT * FROM empleados";
        String sqlb = "INSERT  INTO sueldos (id_s, id_empleado, sueldo, fecha)"
                + " VALUES (?,?,?,?)";

        try {

            con.Conectar();
            res = con.Consulta(sqla);
            while (res.next()) {
                PreparedStatement ps = con.conexion.prepareStatement(sqlb);
                int id_emp = res.getInt(1);
                int puesto = res.getInt(6);
                double sueldo = 0;
                switch (puesto) {
                    case 0:
                        sueldo = 3500;
                        break;
                    case 1:
                        sueldo = 6500;
                        break;
                    case 2:
                        sueldo = 9000;
                        break;
                    default:
                        break;
                }
                ps.setString(1, null);
                ps.setInt(2, id_emp);
                ps.setDouble(3, sueldo);
                ps.setString(4, null);
                ps.execute();
                total = sueldo + total;
            }
            System.out.println("total>>" + total);
            JOptionPane.showMessageDialog(null, "Sueldos pagados de forma exitosa!!!");
            con.Cerrar();
        } catch (Exception e) {
            System.out.println("Sueldos >> " + e.getMessage());
        }
    }

    private void permisos() {
        if (dia == 1 || dia == 16) {
            btnPagar.setEnabled(true);
        } else {
            btnPagar.setEnabled(false);
        }
    }

    private void registrar_caja() {
        String[] botones = {"Efectivo", "Tarjeta", "Cancelar"};
        int ventana = JOptionPane.showOptionDialog(null, "Elige una opción", "Elige un metodo de pago", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
        if (ventana == 0 || ventana == 1) {
            pagar();
            System.out.println("total>>" + total);
            agregar_caja(ventana, total);
            permitir();
        } else {
            this.dispose();
        }
    }

    public void agregar_caja(int mod, double cantidad) {
        Conexion con = new Conexion();
        String sql = "INSERT INTO caja(id, efectivo, tarjeta, tipo)"
                + " VALUES (?,?,?,?)";
        String sqlb = "INSERT  INTO movimientos (id_mov, concepto, cantidad, tipo, fecha_mov)"
                + " VALUES (?,?,?,?,?)";
        //movimientos
        try {
            con.Conectar();
            PreparedStatement ps = con.conexion.prepareStatement(sqlb);
            ps.setString(1, null);
            ps.setString(2, "SUELDOS");
            ps.setDouble(3, cantidad);
            ps.setInt(4, 1);
            ps.setString(5, null);
            ps.execute();
            con.Cerrar();
        } catch (Exception e) {
            System.out.println("movimientos >> " + e.getMessage());
        }
        //caja
        try {
            con.Conectar();
            PreparedStatement ps = con.conexion.prepareStatement(sql);
            ps.setString(1, null);
            if (mod == 0) {
                ps.setDouble(2, cantidad);
                ps.setString(3, null);
            } else {
                ps.setString(2, null);
                ps.setDouble(3, cantidad);
            }
            ps.setInt(4, 1); //salida
            ps.execute();
            con.Cerrar();
        } catch (Exception e) {
            System.out.println("caja >> " + e.getMessage());
        }
    }

    private void permitir() {
        boolean pagado = false;
 
        Conexion con = new Conexion();
        ResultSet res = null;
        String sqla = "SELECT * FROM movimientos WHERE fecha_mov >= curdate()";

        try {
                   System.out.println("Sucede");
            con.Conectar();
            res = con.Consulta(sqla);
            while (res.next()) {
                String concepto = res.getString(2);
                if (concepto.equals("SUELDO")) {
                    pagado = true;
                     if (pagado == false) {
                lblLeyenda.setVisible(false);
                 btnPagar.setEnabled(true);
            } else {
                lblLeyenda.setVisible(true);
                 btnPagar.setEnabled(false);
            }
                }
            }
            con.Cerrar();
           
        } catch (Exception e) {
            System.out.println("Sueldos >> " + e.getMessage());
        }
    }

}
