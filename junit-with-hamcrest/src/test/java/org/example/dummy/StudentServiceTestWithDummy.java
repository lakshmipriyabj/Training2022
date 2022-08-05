package org.example.dummy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.fake.StudentRepoFake;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.model.Student;

import com.example.services.StudentService;

public class StudentServiceTestWithDummy {
	
	@Test
	@DisplayName(value="Test Add Method Return inserted object back")
	void testAddMethod() {
		
		
		StudentRepoFake fake = new StudentRepoFake();
		
	DummyProfessorRepository dummy = new DummyProfessorRepository();
	
	 StudentService service = new StudentService(fake,dummy);
			
		
		Student riya = new Student(101,"Riya");
		
		Student actual = service.add(riya);
		
		assertEquals(actual, riya);
	}

}
