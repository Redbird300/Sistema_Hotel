package BaseDatos;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    public Connection conexion;
    private Statement consulta;
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String baseDatos = "jdbc:mysql://localhost:3306/sistema_hotel";
    private static String usuario = "root";
    private static String password = "";
    private ResultSet res = null;

    public void Conectar() {
        try {
            Class.forName(driver);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Conexion fallida");
        }
        try {
            conexion = DriverManager.getConnection(baseDatos, usuario, password);
            consulta = conexion.createStatement();
            System.out.println("Conexion iniciada :D");
        } catch (SQLException e) {
            System.out.println("Conexion >> " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al conectar");
        }
    }

    public void Cerrar() {
        try {
            conexion.close();
            System.out.println("Conexion finalizada");
        } catch (Exception e) {
            System.out.println("Cerrar >> " + e.getMessage());
        }
    }

    public ResultSet Consulta(String sql) {
        try {
            consulta = conexion.createStatement();
            res = consulta.executeQuery(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Consulta >> " + e.getMessage());
        }
        return res;
    }

    public synchronized void Modificar(String sql) {
        try {
            consulta.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public ResultSet Cambiar(String sql) {
        try {
            consulta.executeUpdate(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Cambiar >> " + e.getMessage());
        }
        return res;
    }
}
