package org.example.mockito.employee;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;
import static  org.mockito.ArgumentMatchers.anyInt;

import java.util.Optional;

import org.example.ifaces.EmployeeRepository;
import org.example.model.Employee;
import org.example.service.EmployeeService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;




@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {
	
	@Mock
	EmployeeRepository repo;
	
	
	
	@InjectMocks
	EmployeeService service;
	
	 
	
	@Test
	void testfindById()
	{
           
		
		Employee list=new Employee(102,"Maha");
		Employee list1=new Employee(103,"Jerry");
		when(repo.findById(102)).thenReturn(Optional.of(list1));
		Employee expected=service.findById(102);
		assertEquals(expected,list1);
		
		  
	}
	
	@Test
	public void shouldThrowExceptionWhenElementNOtFound() {
	
		when(repo.findById(anyInt())).thenThrow(RuntimeException.class);
		assertThrows(RuntimeException.class, ()->service.findById(101));
	//	Employee expected = service.findById(2020);
	//	assertEquals(expected, emp);
		
	}
	
}
