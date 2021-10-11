package sistema_hotel;

import BaseDatos.Conexion;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author redbi
 */
public class Ver_Reservaciones extends javax.swing.JDialog {

    int conta = 0;

    /**
     * Creates new form Agregar_Reservacion
     */
    public Ver_Reservaciones(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Llenar_Registros();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaReservas = new javax.swing.JTable();
        chbFecAct = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBackground(new java.awt.Color(131, 25, 40));

        tablaReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Cliente", "Telefono", "Habitacion", "Tipo", "Fecha de Entrada", "Fecha de salida"
            }
        ));
        jScrollPane3.setViewportView(tablaReservas);

        chbFecAct.setText("Ordenar por fecha actual");
        chbFecAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbFecActActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chbFecAct)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chbFecAct)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de Reservaciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(177, 177, 177))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chbFecActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbFecActActionPerformed
        if(chbFecAct.isSelected() == true){
            ordenar();
        }else{
            Llenar_Registros();
        }
    }//GEN-LAST:event_chbFecActActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chbFecAct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablaReservas;
    // End of variables declaration//GEN-END:variables

    public void Llenar_Registros() {
        Conexion con = new Conexion();
        ResultSet res = null;
        String sql = "SELECT * FROM reservaciones";
        Object nf[] = {null, null, null, null};
        String tipoHabitacion = "";
        DefaultTableModel dtm = (DefaultTableModel) tablaReservas.getModel();
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
                tablaReservas.setValueAt(res.getString(1), conta, 0);//#reservacion
                tablaReservas.setValueAt(res.getString(2), conta, 1);//Cliente
                tablaReservas.setValueAt(res.getString(3), conta, 2);//telefono
                tablaReservas.setValueAt(res.getString(5), conta, 3);//habitacion
                tablaReservas.setValueAt(res.getString(7), conta, 5);//Fecha entra
                tablaReservas.setValueAt(res.getString(8), conta, 6);//Fecha Sale
                int valor = res.getInt(6);
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
                tablaReservas.setValueAt(tipoHabitacion, conta,4);
                conta++;
            }
            con.Cerrar();
        } catch (Exception e) {
            System.out.println("Llenar RR>> " + e.getMessage());
        }
    }

    private void ordenar() {
        
    }
}