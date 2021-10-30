package es.iessoterohernandez.daw.endes.HelloWorldPdf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class App 
{
 
	public static void main(String[] args)
    {
        writePDF();
    }
    
    private static void writePDF() {
 
        Document document = new Document();
 
        try {
        	String path = new File(".").getCanonicalPath();
        	String FILE_NAME = path + "/itext-test-file.pdf";
        	
            PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));
 
            document.open();
 
            Paragraph paragraphHello = new Paragraph();
            paragraphHello.add("Hola Mundo");
             
            document.add(paragraphHello);
            
            document.close();
 
        } catch (FileNotFoundException | DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
			e.printStackTrace();
		}
 
    }
}