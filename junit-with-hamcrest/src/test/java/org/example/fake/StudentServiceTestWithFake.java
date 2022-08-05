package org.example.fake;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.model.Student;
import com.example.service.StudentService;

public class StudentServiceTestWithFake {
	
	@Test
	@DisplayName(value="Test Add Method Return inserted object back")
	void testAddMethod() {
		
		
		StudentRepoFake fake = new StudentRepoFake();
		
		StudentService service = new StudentService(fake);
		
		Student ram = new Student(101,"Ram");
		
		Student actual = service.add(ram);
		
		assertEquals(actual, ram);
	}
	
	
	@Test
	@DisplayName("Test FindAll Methos REturn All the Elements Added")
	void testFindAll() {
		
     StudentRepoFake fake = new StudentRepoFake();
		
		StudentService service = new StudentService(fake);
		
		Student ram = new Student(101,"Ram");
		
		Student shyam = new Student(101,"Shyam");
		service.add(ram);
		service.add(shyam);
		
		int act =service.findAll().size();
		
	     assertEquals(2, act);
		
		
		
		
	}

}
