package com.example.demo.model;





import lombok.*;

//to get in JSON format


@Data
@AllArgsConstructor
@NoArgsConstructor
public class DriverDTO {
	

		
		
		
			private int driverId;
			
			private String driverName;
			
			private long mobileNumber;
			
			private double rating;
		    

}