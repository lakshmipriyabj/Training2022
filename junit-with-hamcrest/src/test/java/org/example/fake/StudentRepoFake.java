package org.example.fake;

import java.util.ArrayList;
import java.util.List;

import com.example.ifaces.StudentRepository;
import com.example.model.Student;

public class StudentRepoFake implements StudentRepository {
	
	private List<Student> list;
	
	

	public StudentRepoFake() {
		super();
		list= new ArrayList<Student>();
	}

	

	@Override
	public Student add(Student entity) {
	
		return list.add(entity)?entity:null;
	}

	
	@Override
	public List<Student> findAll() {
		
		return this.list;
	}

}
