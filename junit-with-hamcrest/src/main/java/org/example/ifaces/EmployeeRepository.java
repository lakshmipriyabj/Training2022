package org.example.ifaces;


import java.util.Optional;

import org.example.model.Employee;



public interface EmployeeRepository {
	
    
	public Optional<Employee> findById(int id);
	
	
	public Optional<Employee> deleteById(int id);

}
