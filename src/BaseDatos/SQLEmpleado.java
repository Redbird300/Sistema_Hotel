/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

/**
 *
 * @author redbi
 */
public class SQLEmpleado {
    
    private String sql;
    
    public String EliminarCuentaEmpleado(String Cuenta){
        sql = "DROP USER '"+Cuenta+"'@'%";
        return sql;
    }
    
    public String GenerarCuentaMySql(String clave, String password){
        sql = "CREATE USER"+clave+"'@'%' IDENTIFIED BY '"+password+"'";
                return sql;
    }
    
    public String PermisosCuentaMysql(String clave, String password){
        sql = "GRANT ALL ON *.* TO '"+clave+"'@'%' IDENTIFIED BY '"+password+"' WITH GR";
        return sql;
    }
}
