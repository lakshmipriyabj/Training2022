package com.example.stub;

import java.util.Arrays;
import java.util.List;

import com.example.ifaces.StudentRepository;
import com.example.model.Student;

public class StudentRepositoryStub implements StudentRepository {

	@Override
	public Student add(Student entity) {
		
		return null;
	}

	@Override
	public List<Student> findAll() {
		
		return Arrays.asList(new Student(202,"Shiv"),new Student(203,"Div"));
	}

}
