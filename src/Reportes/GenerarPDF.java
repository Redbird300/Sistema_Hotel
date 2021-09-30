/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;

/**
 *
 * @author redbi
 */
public class GenerarPDF {

    public void crearPDF(int folio, String cliente, String correo,String telefono, String tipo, String habitacion, double subtotal, double total, String fechaEntra, String fechaSale, String dias, String des) {
        try {
            
            Document doc = new Document(PageSize.LETTER, 2, 2, 20, 20);
            Font fuente = new Font();
            fuente.setStyle(Font.BOLD);
            fuente.setStyle(10);
            Paragraph t1 = new Paragraph("Hotel Esperanza \n Frente al Estadio Lucero");
            t1.getFont().setSize(14);
            PdfWriter.getInstance(doc, new FileOutputStream("Folio" + folio + ".pdf"));
            doc.open();
            //Cabecera
            PdfPTable cabecera = new PdfPTable(2);
            cabecera.setWidths(new float[]{5, 1});
            cabecera.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            cabecera.addCell(t1);
            t1 = new Paragraph("Folio:\n" + folio);
            t1.getFont().setSize(10);
            cabecera.addCell(t1);
            //cliente
            PdfPTable tabla = new PdfPTable(1);
            Paragraph pCliente = new Paragraph("Cliente: " + cliente + "\n\nTelefono: " + telefono + "\n\nCorreo: " + correo);
            pCliente.getFont().setSize(10);
            tabla.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
            tabla.addCell(pCliente);
            //habitacion

            PdfPTable habit = new PdfPTable(2);
            
            PdfPCell c1 = new PdfPCell(new Phrase("Tipo de Habitacion:"));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            habit.addCell(c1);

            c1 = new PdfPCell(new Phrase("Habitación Seleccionada:"));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            habit.addCell(c1);

            c1 = new PdfPCell(new Phrase(tipo));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            habit.addCell(c1);

            c1 = new PdfPCell(new Phrase(habitacion));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            habit.addCell(c1);
            
            //Fechas y noches
            PdfPTable fechas = new PdfPTable(2);
            
            PdfPCell fechaSel = new PdfPCell(new Phrase("Fechas de Estancia"));
            fechaSel.setHorizontalAlignment(Element.ALIGN_CENTER);
            fechas.addCell(fechaSel);
            
            fechaSel = new PdfPCell(new Phrase("Total de noches:"));
            fechaSel.setHorizontalAlignment(Element.ALIGN_CENTER);
            fechas.addCell(fechaSel);
            
            fechaSel = new PdfPCell(new Phrase("Fecha de llegada: "+fechaEntra+"\n\nFecha de Salida: "+fechaSale));
            fechaSel.setHorizontalAlignment(Element.ALIGN_LEFT);
            fechas.addCell(fechaSel);
            
            fechaSel = new PdfPCell(new Phrase(dias));
            fechaSel.setHorizontalAlignment(Element.ALIGN_CENTER);
            fechaSel.setVerticalAlignment(Element.ALIGN_MIDDLE);
            fechas.addCell(fechaSel);            
            
            //Descuento
            Paragraph descu = new Paragraph("¿Aplica descuento?:   " + des);
            descu.setAlignment(Element.ALIGN_CENTER);
            
            //subtotal
            Paragraph subt = new Paragraph("Subtotal: $ "+ subtotal);
            subt.setIndentationRight(50);
            subt.setAlignment(Element.ALIGN_RIGHT);
            
            //total
            Paragraph ptotal = new Paragraph("Total: $ "+ total);
            ptotal.getFont().setSize(20);
            ptotal.setAlignment(Element.ALIGN_RIGHT);
            //Agregar al documento
            doc.add(cabecera);
            doc.add(tabla);
            doc.add(habit);
            doc.add(fechas);
            doc.add(descu);
            doc.add(subt);
            doc.add(ptotal);
            doc.close();
            try {
                File path = new File("Folio" + folio + ".pdf");
                Desktop.getDesktop().open(path);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } catch (Exception e) {
            System.out.println("Exception = " + e.getMessage());
        }
    }
}
