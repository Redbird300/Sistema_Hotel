package sistema_hotel;

import BaseDatos.Conexion;
import Reportes.GenerarExcel;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author redbi
 */
public class Inicio extends javax.swing.JFrame {

    private double total = 0;
    private int cont = 0;
    private int conta = 0;
    int momento = 0;

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        llenarTablaEmpleados();
        llenarTablaHabitaciones();
        CambioEnTabla();
        cambiar_Tabla();
        sacarTotal();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PBotones = new javax.swing.JPanel();
        btnCambiarUsuario = new javax.swing.JButton();
        btnCCaja = new javax.swing.JButton();
        btnEmpleados = new javax.swing.JButton();
        btnHabitaciones = new javax.swing.JButton();
        lblPuesto = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        fSLabel1 = new LIB.FSLabel();
        btnSueldos = new javax.swing.JButton();
        Header = new javax.swing.JPanel();
        tpnPaneles = new javax.swing.JTabbedPane();
        PHabitaciones = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHabitaciones = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnVer = new javax.swing.JButton();
        btnGenerarReser = new javax.swing.JButton();
        btnVerR = new javax.swing.JButton();
        PEmpleados = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        btnAgregarEmpleado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        PCaja = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaControlCaja = new javax.swing.JTable();
        btnImprimirIE = new javax.swing.JButton();
        btnGenerarGastos = new javax.swing.JButton();
        btnInvertir = new javax.swing.JButton();
        btnCambiar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblTotalIE = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblEfectivo = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblTarjeta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PBotones.setBackground(new java.awt.Color(131, 25, 40));

        btnCambiarUsuario.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btnCambiarUsuario.setText("Cambiar de usuario");
        btnCambiarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarUsuarioActionPerformed(evt);
            }
        });

        btnCCaja.setText("Control de caja");
        btnCCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCCajaActionPerformed(evt);
            }
        });

        btnEmpleados.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEmpleados.setText("Empleados");
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });

        btnHabitaciones.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnHabitaciones.setText("Habitaciones");
        btnHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacionesActionPerformed(evt);
            }
        });

        lblPuesto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPuesto.setForeground(new java.awt.Color(255, 255, 255));
        lblPuesto.setText("Administrador");

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Maria Delgado");

        fSLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/administrador.png"))); // NOI18N
        fSLabel1.setText("");

        btnSueldos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSueldos.setText("Sueldos");
        btnSueldos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSueldosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PBotonesLayout = new javax.swing.GroupLayout(PBotones);
        PBotones.setLayout(PBotonesLayout);
        PBotonesLayout.setHorizontalGroup(
            PBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBotonesLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(PBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(fSLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuario)
                    .addComponent(lblPuesto))
                .addGap(29, 29, 29))
            .addGroup(PBotonesLayout.createSequentialGroup()
                .addGroup(PBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PBotonesLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(PBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEmpleados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHabitaciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCCaja, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSueldos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(PBotonesLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnCambiarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PBotonesLayout.setVerticalGroup(
            PBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fSLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPuesto)
                .addGap(18, 18, 18)
                .addComponent(btnHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSueldos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 369, Short.MAX_VALUE)
                .addComponent(btnCambiarUsuario)
                .addGap(15, 15, 15))
        );

        getContentPane().add(PBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 850));

        Header.setBackground(new java.awt.Color(131, 25, 40));

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1160, Short.MAX_VALUE)
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 1160, 50));

        tpnPaneles.setToolTipText("");

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

        javax.swing.GroupLayout PHabitacionesLayout = new javax.swing.GroupLayout(PHabitaciones);
        PHabitaciones.setLayout(PHabitacionesLayout);
        PHabitacionesLayout.setHorizontalGroup(
            PHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PHabitacionesLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PHabitacionesLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PHabitacionesLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(21, 21, 21))))
            .addGroup(PHabitacionesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnVerR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGenerarReser)
                .addGap(18, 18, 18)
                .addComponent(btnVer)
                .addGap(0, 594, Short.MAX_VALUE))
        );
        PHabitacionesLayout.setVerticalGroup(
            PHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PHabitacionesLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(PHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerarReser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVerR, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpnPaneles.addTab("Habitaciones", PHabitaciones);

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

        javax.swing.GroupLayout PEmpleadosLayout = new javax.swing.GroupLayout(PEmpleados);
        PEmpleados.setLayout(PEmpleadosLayout);
        PEmpleadosLayout.setHorizontalGroup(
            PEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PEmpleadosLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(PEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        PEmpleadosLayout.setVerticalGroup(
            PEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PEmpleadosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(btnAgregarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186))
        );

        tpnPaneles.addTab("Empleados", PEmpleados);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Control de caja");

        tablaControlCaja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#Pago", "Tipo de Pago", "Fecha", "Total"
            }
        ));
        jScrollPane3.setViewportView(tablaControlCaja);

        btnImprimirIE.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        btnImprimirIE.setText("Imprimir");
        btnImprimirIE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirIEActionPerformed(evt);
            }
        });

        btnGenerarGastos.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        btnGenerarGastos.setText("Gastos");
        btnGenerarGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarGastosActionPerformed(evt);
            }
        });

        btnInvertir.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        btnInvertir.setText("Invertir");
        btnInvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvertirActionPerformed(evt);
            }
        });

        btnCambiar.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        btnCambiar.setText("Ver Egresos");
        btnCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Nirmala UI", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("TOTAL DE INGRESOS");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        lblTotalIE.setFont(new java.awt.Font("Nirmala UI", 0, 40)); // NOI18N
        lblTotalIE.setForeground(new java.awt.Color(0, 0, 0));
        lblTotalIE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalIE.setText("$ 00.0");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Efectivo:");

        lblEfectivo.setFont(new java.awt.Font("Nirmala UI", 0, 29)); // NOI18N
        lblEfectivo.setForeground(new java.awt.Color(0, 0, 0));
        lblEfectivo.setText("$ 00.0");

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Nirmala UI", 0, 29)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Saldo en general");

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Tarjeta:");

        lblTarjeta.setFont(new java.awt.Font("Nirmala UI", 0, 29)); // NOI18N
        lblTarjeta.setForeground(new java.awt.Color(0, 0, 0));
        lblTarjeta.setText("$ 00.0");

        javax.swing.GroupLayout PCajaLayout = new javax.swing.GroupLayout(PCaja);
        PCaja.setLayout(PCajaLayout);
        PCajaLayout.setHorizontalGroup(
            PCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PCajaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(PCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PCajaLayout.createSequentialGroup()
                        .addComponent(btnImprimirIE, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnGenerarGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btnInvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(btnCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(PCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PCajaLayout.createSequentialGroup()
                        .addGroup(PCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(jLabel8)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblTotalIE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(PCajaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(PCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEfectivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36))))
        );
        PCajaLayout.setVerticalGroup(
            PCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PCajaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(PCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PCajaLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblTotalIE)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEfectivo)
                            .addComponent(jLabel6))
                        .addGap(28, 28, 28)
                        .addGroup(PCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTarjeta)
                            .addComponent(jLabel9))))
                .addGap(29, 29, 29)
                .addGroup(PCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerarGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimirIE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        tpnPaneles.addTab("CCa", PCaja);

        getContentPane().add(tpnPaneles, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 1160, 840));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerRActionPerformed
        Mostrar_Reservaciones();
    }//GEN-LAST:event_btnVerRActionPerformed

    private void btnGenerarReserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReserActionPerformed
        CrearReservacion();
    }//GEN-LAST:event_btnGenerarReserActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        verReservaciones();
    }//GEN-LAST:event_btnVerActionPerformed

    private void tablaHabitacionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaHabitacionesMousePressed
        CambioEnTabla();
    }//GEN-LAST:event_tablaHabitacionesMousePressed

    private void btnAgregarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEmpleadoActionPerformed
        Agregar_Empleado ae = new Agregar_Empleado(this, true);
        llenarTablaEmpleados();
    }//GEN-LAST:event_btnAgregarEmpleadoActionPerformed

    private void btnHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacionesActionPerformed
        tpnPaneles.setSelectedIndex(0);
    }//GEN-LAST:event_btnHabitacionesActionPerformed

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        tpnPaneles.setSelectedIndex(1);
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void btnCCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCCajaActionPerformed
        tpnPaneles.setSelectedIndex(2);
        cambiar_Tabla();
    }//GEN-LAST:event_btnCCajaActionPerformed

    private void btnImprimirIEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirIEActionPerformed
        Imprimir();
    }//GEN-LAST:event_btnImprimirIEActionPerformed

    private void btnGenerarGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarGastosActionPerformed
        Generar_Movimiento();
    }//GEN-LAST:event_btnGenerarGastosActionPerformed

    private void btnInvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvertirActionPerformed
        Generar_Movimiento();
    }//GEN-LAST:event_btnInvertirActionPerformed

    private void btnCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarActionPerformed
        cambiar_Tabla();
    }//GEN-LAST:event_btnCambiarActionPerformed

    private void btnSueldosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSueldosActionPerformed
        Sueldos s = new Sueldos(this, true);
    }//GEN-LAST:event_btnSueldosActionPerformed

    private void btnCambiarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarUsuarioActionPerformed
        this.dispose();
        Login log = new Login();
    }//GEN-LAST:event_btnCambiarUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel PBotones;
    private javax.swing.JPanel PCaja;
    private javax.swing.JPanel PEmpleados;
    private javax.swing.JPanel PHabitaciones;
    private javax.swing.JButton btnAgregarEmpleado;
    private javax.swing.JButton btnCCaja;
    private javax.swing.JButton btnCambiar;
    private javax.swing.JButton btnCambiarUsuario;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnGenerarGastos;
    private javax.swing.JButton btnGenerarReser;
    private javax.swing.JButton btnHabitaciones;
    private javax.swing.JButton btnImprimirIE;
    private javax.swing.JButton btnInvertir;
    private javax.swing.JButton btnSueldos;
    private javax.swing.JButton btnVer;
    private javax.swing.JButton btnVerR;
    private LIB.FSLabel fSLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblEfectivo;
    private javax.swing.JLabel lblPuesto;
    private javax.swing.JLabel lblTarjeta;
    private javax.swing.JLabel lblTotalIE;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTable tablaControlCaja;
    private javax.swing.JTable tablaEmpleados;
    private javax.swing.JTable tablaHabitaciones;
    private javax.swing.JTabbedPane tpnPaneles;
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
                switch (valor) {
                    case 0:
                        tipoPuesto = "Recepcionista";
                        break;
                    case 1:
                        tipoPuesto = "Mucama";
                        break;
                    case 2:
                        tipoPuesto = "Administrador";
                        break;
                    default:
                        break;
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
                switch (valor) {
                    case 0:
                        tipoHabitacion = "Dobles";
                        break;
                    case 1:
                        tipoHabitacion = "Con Jaccuzi";
                        break;
                    case 2:
                        tipoHabitacion = "Suite";
                        break;
                    default:
                        break;
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
        String valor = (String) tm.getValueAt(tablaHabitaciones.getSelectedRow(), 0);
        int habitacion = Integer.parseInt(valor);
        System.out.println("hab" + habitacion);
        Mostrar_Reservaciones mr = new Mostrar_Reservaciones(this, true, habitacion);
        mr.setVisible(true);
        mr.setLocationRelativeTo(null);
    }

    private void Imprimir() {
        GenerarExcel gex = new GenerarExcel();
    }

    private void Generar_Movimiento() {
        Movimientos mov = new Movimientos(this, true);
    }

    private void cambiar_Tabla() {

        Conexion con = new Conexion();
        ResultSet res = null;
        String sql = "SELECT * FROM pagos";
        Object nf[] = {null, null, null, null};
        String tipoPago = "";
        DefaultTableModel dtm = (DefaultTableModel) tablaControlCaja.getModel();
        //limpiar la tabla
        for (int b = (momento - 1); b >= 0; b--) {
            dtm.removeRow(b);
        }
        momento = 0;
        try {
            con.Conectar();
            res = con.Consulta(sql);
            while (res.next()) {
                dtm.addRow(nf);
                tablaControlCaja.setValueAt(res.getString(1), momento, 0);//idPago
                int valor = res.getInt(4);
                switch (valor) {
                    case 0:
                        tipoPago = "Efectivo";
                        break;
                    case 1:
                        tipoPago = "Tarjeta";
                        break;
                    case 2:
                        tipoPago = "Transferencia";
                        break;
                    default:
                        break;
                }
                tablaControlCaja.setValueAt(tipoPago, momento, 1);//TipoPago
                tablaControlCaja.setValueAt(res.getString(10), momento, 2);//Fecha
                tablaControlCaja.setValueAt(res.getString(5), momento, 3);//Total
                momento++;
            }
            con.Cerrar();
        } catch (Exception e) {
            System.out.println("Llenar pagos>> " + e.getMessage());
        }
    }

    private void sacarTotal() {
        total = 0;
        double efectivo = 0;
        double tarjeta = 0;
        double ef = 0;
        double tar = 0;
        int numFila = tablaControlCaja.getRowCount();
        for (int j = 0; j < numFila; j++) {
            double cal = Double.parseDouble(String.valueOf(tablaControlCaja.getModel().getValueAt(j, 3)));
            String tipo = String.valueOf(tablaControlCaja.getModel().getValueAt(j, 1));
            if (tipo.equals("Efectivo")) {
                ef = Double.parseDouble(String.valueOf(tablaControlCaja.getModel().getValueAt(j, 3)));
                System.out.println("ef>>" + ef);
            } else if (tipo.equals("Tarjeta") || tipo.equals("Transferencia")) {
                tar = Double.parseDouble(String.valueOf(tablaControlCaja.getModel().getValueAt(j, 3)));
                tarjeta = tarjeta + tar;
            }
            total = total + cal;
            efectivo = efectivo + ef;
        }
        lblTotalIE.setText(String.format("Total = " + "%.2f", total));
        lblEfectivo.setText(String.format("%.2f", efectivo));
        lblTarjeta.setText(String.format("%.2f", tarjeta));
        System.out.println("tarjeta>>" + tarjeta);
    }
}
