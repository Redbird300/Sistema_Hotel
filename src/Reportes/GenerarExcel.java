/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;

import BaseDatos.Conexion_Excel;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.Number;
import jxl.write.WriteException;


/**
 *
 * @author redbi
 */
public class GenerarExcel {
       Conexion_Excel con = new Conexion_Excel();
    Connection conect = con.conectar();
    private String ruta;

    

    private void EscribirExcel(String url) {
        int row = 0;
        ruta = url;
        File file = new File(ruta);
        WritableSheet excelSheet = null;
        WritableWorkbook workbook = null;

        try {
            workbook = Workbook.createWorkbook(file);
            //Nombre de la hoja
            workbook.createSheet("Dato", 0);
            //Obtenemos la hoja
            excelSheet = workbook.getSheet(0);
            System.out.println("Creando hoja >>>>> Listo");
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        //consulta sql
        String sql = "SELECT * FROM pagos";
        try {
            PreparedStatement pstm = conect.prepareStatement(sql);
            ResultSet res = pstm.executeQuery();
            
            while (res.next()) {
                //column - fila
                Number id = new Number(0, row, res.getLong(1));
                Label descripcion = new Label(1, row, res.getString(2));
                Number precio = new Number(2, row, res.getDouble(3));
                Number costo = new Number(3, row, res.getDouble(4));
                Number cantidad = new Number(4, row, res.getLong(5));
                Label categoria = new Label(5, row, res.getString(6));
                row++;
                try {
                    excelSheet.addCell(id);
                    excelSheet.addCell(descripcion);
                    excelSheet.addCell(precio);
                    excelSheet.addCell(costo);
                    excelSheet.addCell(cantidad);
                    excelSheet.addCell(categoria);
                } catch (WriteException ex) {
                    System.err.println(ex.getMessage());
                }
            }
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        //reescribimos el excel en el disco
        try{
            workbook.write();
            workbook.close();
        }catch(IOException ex){
            System.err.println(ex.getMessage());
        } catch (WriteException ex) {
             System.err.println(ex.getMessage());
        }
        System.out.println("Proceso completado");
        JOptionPane.showMessageDialog(null, "Se han exportado los archivos.", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void guardarExcel(){
        JFileChooser selectorArchivos = new JFileChooser();
        selectorArchivos.showSaveDialog(null);
        selectorArchivos.setDialogTitle("Guardar");
        File archivo = new File(selectorArchivos.getSelectedFile()+".xls");
        if(archivo != null){
            System.out.println(archivo);
            ruta = archivo.getAbsolutePath();
            System.out.println(ruta);
            EscribirExcel(ruta); 
        }else{
            System.out.println("No");
        }
    }
}
