
package Metodos;

import BaseDatos.Conexion;
import Reportes.GenerarPDF;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author RANSONWARE
 */
public class Guardar_Reservaciones {

    public void Subir_Base(String name, String email, String tel,String habitacion, int tipo_hab, String Entra, String Sale, int noches, double subtotal, double total, int mod) {
       //Sentencia sql para la base
        String sql = "";
        if (mod == 0) {
            sql = "insert into reservaciones (id_reservaciones, nombre, telefono, correo, habitacion, tipo, fecha_entra, fecha_sale, fecha_reservacion)"
                    + "VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        } else {
            sql = "insert into cotizaciones (id_cotizaciones, nombre, telefono, correo, habitacion, tipo, fecha_entra, fecha_sale, fecha_cotizaciones)"
                    + "VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        }

        //Guardar en base de datos
        try {
            Conexion con = new Conexion();
            con.Conectar();
            PreparedStatement ps = con.conexion.prepareStatement(sql);
            ps.setString(1, null);
            ps.setString(2, name);
            ps.setString(3, tel);
            ps.setString(4, email);
            ps.setString(5, habitacion );
            ps.setDouble(6, tipo_hab);
            ps.setString(7, Entra);
            ps.setString(8, Sale);
            ps.setString(9, null);
            ps.execute();
            con.Cerrar();
        } catch (Exception e) {
            System.out.println("Error SB>> " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Hubo un error en el formulario, intentelo de nuevo", "Error!", JOptionPane.ERROR_MESSAGE);
        }      
    }
    
    public void Crear_Pdf(String name, String email, String tel, String Entra, String Sale, int noches, int tipo_hab, String sel_habita, double subtotal, double total, int mod){
    //Declarar variables variables
        int folio = 0;
        String nombre = name;
        String correo = email;
        String telefono = tel;
        String des = "";
        //
        int dias = noches;
        if (dias > 3) {
            des = "Si";
        } else {
            des = "No";
        }
        //
        int habita = tipo_hab;
        String tipo = "";
        if (habita == 1) {
            tipo = "Doble";
        } else if (habita == 2) {
            tipo = "Jacuzzi";
        } else {
            tipo = "Doble";
        }    
    //Variable de pdf
        String sqlPDF = "";
        if (mod == 0) {
            sqlPDF = "SELECT * FROM reservaciones ORDER BY id_reservaciones DESC LIMIT 1";
        } else {
            sqlPDF = "SELECT * FROM cotizaciones ORDER BY id_cotizaciones DESC LIMIT 1";
        }
        //Generar pdf
        try {
            Conexion con = new Conexion();
            ResultSet res = null;
            
            con.Conectar();
            res = con.Consulta(sqlPDF);
            while (res.next()) {
                folio = res.getInt(1);
                GenerarPDF gpdf = new GenerarPDF();
                gpdf.crearPDF(folio, nombre, correo, telefono, tipo, sel_habita, subtotal, total, Entra, Sale, "" + dias, des, mod);
            }

            con.Cerrar();
        } catch (Exception e) {
            System.out.println("Error CPdf >> " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Hubo un error en la base de datos, intentelo de nuevo", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public int folio(int mod){
        int folio = 0;
        String sqlPDF = "";
        if (mod == 0) {
            sqlPDF = "SELECT * FROM reservaciones ORDER BY id_reservaciones DESC LIMIT 1";
        } else {
            sqlPDF = "SELECT * FROM cotizaciones ORDER BY id_cotizaciones DESC LIMIT 1";
        }
        //Generar pdf
        try {
            Conexion con = new Conexion();
            ResultSet res = null;
            
            con.Conectar();
            res = con.Consulta(sqlPDF);
            while (res.next()) {
                folio = res.getInt(1);
                return folio;
            }
            con.Cerrar();
        } catch (Exception e) {
            System.out.println("ErrorFol >> " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Hubo un error en la base de datos, intentelo de nuevo", "Error!", JOptionPane.ERROR_MESSAGE);
        }
        return folio;
    }
    
    public void guardar_Pago(int tipo_pago, String total, String cambio, String banco, String id_transaccion, String id_transferencia, int mod){
        int id_empleado = 1;
        int id_reservacion = folio(0)+1;
        if(mod == 1){
        CotizacionAReservacion();
        }
         try {
            Conexion con = new Conexion();
            String sql = "insert into pagos (id_pago, id_reservacion, id_empleado, tipo_pago, total, cambio, banco, id_transaccion, id_transferencia, fecha_pago)"
                    + "VALUES (?, ?, ?, ?, ?, ? , ?, ?, ?, ?)";
            con.Conectar();
            PreparedStatement ps = con.conexion.prepareStatement(sql);
            ps.setString(1, null);
            ps.setInt(2, id_reservacion);
            ps.setInt(3, id_empleado);
            ps.setInt(4, tipo_pago);
            ps.setString(5, total);
            ps.setString(6, cambio);
            ps.setString(7, banco);
            ps.setString(8, id_transaccion);
            ps.setString(9, id_transferencia);
            ps.setString(10, null);
            ps.execute();
            con.Cerrar();          
            JOptionPane.showMessageDialog(null, "Registro exitoso!!!");
        } catch (Exception e) {
            System.out.println("Error GP>> " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Hubo un error, intentelo de nuevo", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void CotizacionAReservacion() {
        int id_cotizacion = folio(1);
        try {
            Conexion con = new Conexion();
            String sql = "INSERT INTO reservaciones " +
                    "SELECT null, nombre, telefono, correo, habitacion, tipo, fecha_entra, fecha_sale, null FROM cotizaciones " +"WHERE id_cotizaciones = "+id_cotizacion;
            System.out.println(sql);
            con.Conectar();
           con.Cambiar(sql);
            con.Cerrar();
        } catch (Exception e) {
            System.out.println("Error CAR >> " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Hubo un error, intentelo de nuevo", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
