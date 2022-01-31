package testh.testh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        
        Scanner sc = new Scanner(System.in);
        
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        		
        SessionFactory sf = cfg.buildSessionFactory();	

       Session s =  sf.getCurrentSession();
s.beginTransaction();

FileInputStream file = new FileInputStream(new File("C:/Users/mani/Desktop/data.xlsx")); 
XSSFWorkbook workbook = new XSSFWorkbook(file); 
XSSFSheet sheet = workbook.getSheetAt(1); 
Row row;
for(int i=1; i<=sheet.getLastRowNum(); i++){  //points to the starting of excel i.e excel first row
    row = (Row) sheet.getRow(i);  //sheet number
    
    
        String id;
		if( row.getCell(0)==null) { id = "0"; }
        else id= row.getCell(0).toString();

           String name;
		if( row.getCell(1)==null) { name = "null";}  //suppose excel cell is empty then its set to 0 the variable
           else name = row.getCell(1).toString();   //else copies cell data to name variable

           String address;
		if( row.getCell(2)==null) { address = "null";   }
           else  address   = row.getCell(2).toString();
Transaction t = session.beginTransaction();
Student std = new Student();
std.setId(Double.parseDouble(id));
std.setName(name);
std.setAddress(address);
System.out.println(std.getId()+" "+std.getName()+" "+std.getAddress());
session.saveOrUpdate(std);
t.commit();		
}
file.close();  
        s.getTransaction().commit();
        
        s.close();
        System.out.println(sf);
        System.out.println(sf.isClosed());
        
    }
}
