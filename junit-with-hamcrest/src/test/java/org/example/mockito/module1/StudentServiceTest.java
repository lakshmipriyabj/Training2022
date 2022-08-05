package org.example.mockito.module1;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.ifaces.StudentRepository;
import com.example.model.Student;
import com.example.service.StudentService;

@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {
	
	//2 with annotation
	
	
	@Mock
	StudentRepository studRepo;
	
	@Mock
	StudentService serviceMock;
	
	@InjectMocks
	StudentService studService;	

	@Test
	@DisplayName(value="Test Find All Method with Mockito Stub with annotation")
	void testFindAllWithAnnotation() {
	//stubbing
		
	    List<Student> list = new ArrayList<>(); 
		 list.add(new Student(101,"Riya"));
		list.add(new Student(102,"Priya"));
	   
 	
		when(studRepo.findAll()).thenReturn(list);
		
		assertEquals(studService.findStudentSize(),2);
	}
	
	
	//1 without annotation
	
	@Test
	@DisplayName(value="Test Find All Method with Mockito Stub")
	void testFindAll() {
		
		StudentRepository repo = mock(StudentRepository.class);
		StudentService service = new StudentService(repo);
		
		//stubbing
		
	    List<Student> list=Arrays.asList(new Student(101,"Riya"),new Student(102,"Priya"));
	 	
		when(repo.findAll()).thenReturn(list);
		
		assertEquals(service.findStudentSize(),2);
	}
	
	@Test
	@DisplayName(value="Test addwithCondition Method of the Service it should add elements" +
	"roll number is greater than 2000 else it should return a null value")
	void testAddWithCondition() {
		
		Student stud =  new Student(2020,"Ramesh");
		
	assertNotNull(studService.addWithCondition(stud));
		
	//	verify(studRepo.addWithCondition(),times(1));
     }
	
	@Test
	void testVerifyAddWithCondition() {
			
			Student stud =  new Student(2020,"Ramesh");
			serviceMock.addWithCondition(stud);
			verify(serviceMock,times(1)).addWithCondition(stud);
			
			
		}
	
}
