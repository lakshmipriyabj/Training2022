package com.example.service;
import java.util.*;
import java.util.stream.*;

import com.example.model.Student;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
public class StudentService {

	private List<Student> studentList;

	public StudentService() {
		super();
		this.studentList = new ArrayList<Student>();
		
	}
	//add
	public boolean add(Student student)
	{
		return this.studentList.add(student);
	}
	
//	get
	
	
	public List<Student> getAll(){
		return this.studentList;
	}
	
	
	public Optional<Student> findById(int id)
	{
		return this.studentList
			.stream()
			.filter(e->e.getRollNumber()==id)
			.findFirst();
	}
	//delete
	public boolean remove(int id)
	{
		return this.studentList.removeIf(e->e.getRollNumber()==id);
	}
	
//	//update
//	public Student update(Student oldValue,Student newValue) {
//		
//		
//		int idxPos = this.studentList.indexOf(oldValue);
//		
//		return this.studentList.set(idxPos, newValue);
//		
//	}
public Student update(int id,Student newValue) {
		
		int idxPos = this.studentList.indexOf(findById(id).get());
		
		return this.studentList.set(idxPos, newValue);
		
	}
}

