package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.example.demo.model.DriverDTO;

@RestController
@RequestMapping(path = "/api/v1")
public class ClientController {
	
	@Autowired
	RestTemplate template;
	
//	@GetMapping(path = "/client/drivers")
//	public String getDrivers() {
//		return template.getForObject("http://DRIVER-SERVICE/api/v1/drivers", String.class);
//	} 
	
	//[{"driverId":1020,"driverName":"Siva","mobileNumber":9887688,"rating":3.8},
	//{"driverId":103,"driverName":"ammu","mobileNumber":7439855,"rating":2.0},{"driverId":104,"driverName":"rinu","mobileNumber":39855,"rating":3.5},{"driverId":102,"driverName":"damu","mobileNumber":74355,"rating":4.2}]
	
	//to get in JSON format
	@GetMapping(path = "/client/drivers")
	public DriverDTO[] getDrivers() {
		return template.getForObject("http://DRIVER-SERVICE/api/v1/drivers", DriverDTO[].class);
	}
}
