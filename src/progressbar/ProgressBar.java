package progressbar;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.codec.Base64;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Date;

public class ProgressBar {

    public static void main(String[] args) {
        //Create instance
        ProgressBar pro = new ProgressBar();
        //Call generatePDF method
        pro.generatePDF();
        
    }
    
    /**
     * Method to generate PDF Files
     */
    private void generatePDF() {
        //Using try catch for error handling
        try {
            //Set output file name and directory
            OutputStream file = new FileOutputStream(new File("A:\\test.pdf"));
            
            Document doc = new Document();
            PdfWriter.getInstance(doc, file);
            
            //add text to PDF file
            doc.open();
            doc.add(new Paragraph("Hello world. This file is generated using iText"));
            doc.add(new Paragraph("PDF created at :" + new Date().toString()));
            doc.close();
            file.close();
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
   
