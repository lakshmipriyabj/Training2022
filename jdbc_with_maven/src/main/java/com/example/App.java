package com.example;

import java.awt.Point;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

import com.example.demo.service.Invoice;
import com.example.demo.service.ProductService;
import com.example.entity.Member;
import com.example.dao.MemberRepository;
import com.example.entity.Product;
import com.example.util.ConnectionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
//    public static void main( String[] args)
//    {
////oracle
//	Connection con;
//		try {
//			con = DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
//		System.out.println(con);
//			con = ConnectionFactory.getOracleConnection();
//			 MemberRepository member = new MemberRepository(con);
//			 System.out.println(con);
//		        member.findAll().forEach(System.out::println);
//		    //    Product toAdd = new Product(9,"ups",470.00);
////				int rowAdded = service.addProduct(toAdd);
////				System.out.println("Row Added:=" +rowAdded);
//		        Member toAdd = new Member(8,"Priya","saidapet",LocalDate.of(2022, 04, 27),"Annual",5000,2,10.0);
//		        int rowAdded = member.add(toAdd);
//				System.out.println("Row Added:=" +rowAdded);
//			
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//    
//    }
//    }
    	//postgress
	public static void member() {
		Connection con;
	try {
				Connection con1 = ConnectionFactory.getPostgressConnection();
				System.out.println(con1);

		}
	catch(Exception e) {
			e.printStackTrace();
		}
       
        
   }
	
	
	
    public static void product()
	{
		Connection con=ConnectionFactory.getOracleConnection();
		ProductService service=new ProductService(con);
		

	       
//	       Product kathli = new Product(31,"moti choor laddu",450.00);
//	       Product jamun = new Product(33,"Badhusha",550.00);
//	       service.usingTxn(kathli,jamun);
	    		   
		
//		Product toadd=new Product(459,"jam",234.89);
//	    int rowAdded=service.addProduct(toadd);
//	
//	    System.out.println("rowAdded" +rowAdded);
//	    service.findAll().forEach(System.out::println);
//	    
	}
//
  public static void main(String[] args)
   {
//       product();
	  Connection con=ConnectionFactory.getOracleConnection();
	  ProductService service=new ProductService(con);
////			 Product kathli = new Product(11,"kaju kathli",450.00);
////	       Product jamun = new Product(12,"jamun",550.00);
////	       service.usingTxn(kathli,jamun);
       
	       Product pro = new Product(19,"cashew",600);
	       Invoice ino = new Invoice(224,"jai",2, 6);
	       
	       service.usingTxnusingcatchblock(pro, ino);
		
      
        
}

}
