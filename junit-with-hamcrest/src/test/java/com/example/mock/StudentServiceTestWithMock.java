package com.example.mock;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.model.Student;
import com.example.service.StudentService;

public class StudentServiceTestWithMock {
	
	@Test
	@DisplayName(value="Test verify Add Method with Mock")
	void testAddWithMock() {
		StudentServiceMock mock = new StudentServiceMock();
		
		StudentService service = new StudentService(mock);
		
		Student jerry = new Student(892,"Jerry");
		Student maha = new Student(456,"maha");
		service.add(jerry);
		service.add(maha);
		
		mock.verify(jerry,1);
		mock.verify(maha,2);
		
	}

}
