package org.example.service;


import org.example.ifaces.EmployeeRepository;
import org.example.model.Employee;



public class EmployeeService {

	
	private EmployeeRepository repo;

	
	
 



  public EmployeeService(EmployeeRepository repo) {
		super();
		this.repo = repo;
	}



	  public Employee findById(int id) {
	
	   Employee added= this.repo.findById(id).get();
	   added.setId(5600);
	   return added;
   }
	
	
	public Employee deleteById(int id) {
		
		return this.repo.deleteById(id).get();
	}
	
	
}
