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
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

/**
 *
 * @author redbi
 */
public class GenerarPDF {
    private void crearPDF(int folio){
        try{
            Document doc = new Document(PageSize.LETTER, 2, 2, 20, 20);
            Font fuente = new Font();
            fuente.setStyle(Font.BOLD);
            fuente.setStyle(10);
            Paragraph t1 = new Paragraph("Hotel Esperanza \n Frente al estadio Lucero");
            t1.getFont().getSize();
        }catch(Exception e){
            
        }
    }
}
