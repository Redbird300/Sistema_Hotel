/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author redbi
 */
public class Conexion_Excel {
    private  String driver = "com.mysql.cj.jdbc.Driver";
    private  String baseDatos = "jdbc:mysql://localhost:3306/sistema_hotel";
    private  String usuario = "root";
    private  String password = "";
   private Connection conn = null;
   
   public Connection conectar(){
       try{
           Class.forName(driver);
           conn = DriverManager.getConnection(baseDatos, usuario, password);
           if(conn != null){
               System.out.println("Conexion Correcta");
           }
       }catch(Exception e){
           System.out.println("Error: "+e);
       }
       return conn;
   }
}
