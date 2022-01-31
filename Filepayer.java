package testh.testh;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;


public class Filepayer {

	
	
    public static void main( String[] args ) throws IOException
    {
    	
    	File file = new File("D:/allresult.pdf");
    	FileInputStream fis = new FileInputStream(file);
    	PDDocument pd = PDDocument.load(fis);
    	PDFTextStripper pr =new PDFTextStripper();
    String txt=pr.getText(pd);
    System.out.println(txt);
    pd.close();
    	fis.close();

    	

    
    
     }
}
