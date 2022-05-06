package com.training;

import com.example.entity.Product;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class ProductClient {

	public static void main(String[] args) {
	
		Client client = ClientBuilder.newClient();
		
		//find by id
		
		WebTarget target=client.target("http://localhost:8082/products");
		
		Invocation.Builder builder =target.request(MediaType.APPLICATION_JSON);
		
		Response resp = builder.get();
		
		
		
//		int ch=2;
//		
//		if(ch==4) {
//		Product[]  list = resp.readEntity(Product[].class);
//		
//	   for(Product eachProduct:list) {
//		   System.out.println(eachProduct);
//	   }
//	    
//		}
//		if(ch==1) {
//			String object = resp.readEntity(String.class);
//		    System.out.println(object);
//		    
//			}
//		
//		if(ch==2) {
//			WebTarget findByIdtarget=target.path("/srch/8");
//					
//					Invocation.Builder builder2=findByIdtarget.request(MediaType.APPLICATION_JSON);
//					
//					Response findByresp =	builder2.get();
//					Product object2=findByresp.readEntity(Product.class);
//					System.out.println(object2);
//				}
//		//GET. 0.
////		Response resp = builder.get();
////		System.out.println(resp);
////		
////	    String object = resp.readEntity(String.class);
////	    System.out.println(object);
//	    
//		//ADD
//	    if(ch==3) {
//	    	
//		Product toAdd = new Product(78, "book", 500);
//	    Response response = builder.post(Entity.entity(toAdd, MediaType.APPLICATION_JSON));
//	    
//	    System.out.println(response.getStatus());
//
//	    System.out.println(response.readEntity(String.class));
//	  
//	    
//	    }
//	    
//
//	}
		int ch=2;
if(ch == 4) {
			
			Product[] list= resp.readEntity(Product[].class);
			
			for(Product eachProduct:list) {
				
				System.out.println(eachProduct);
				
			}
		}
		
         if(ch == 1) {
			
        	 String object = resp.readEntity(String.class);
			
			System.out.println(object);
			
		}
        
         if(ch == 2) {
 			
        	 WebTarget findByIdTarget = target.path("/srch/77");
        	 
        	 Invocation.Builder builder2 = findByIdTarget.request(MediaType.APPLICATION_JSON);
        	 
        	 Response findByResp = builder2.get();
        	 
        	 Product object2 = resp.readEntity(Product.class);
     		
     		 System.out.println(object2);
		}
         
         if(ch == 3) {
		
		Product toAdd = new Product(77,"upa",560);
		
		Response response = builder.post(Entity.entity(toAdd, MediaType.APPLICATION_JSON));

		System.out.println(response.getStatus());
		
		System.out.println(response.readEntity(String.class));

	}

}
}
