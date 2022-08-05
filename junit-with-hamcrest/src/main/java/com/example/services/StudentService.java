package com.example.services;

import java.util.List;

import com.example.ifaces.ProfessorRepository;
import com.example.ifaces.StudentRepository;
import com.example.model.Student;

public class StudentService {
	
	private StudentRepository repo;
	private ProfessorRepository profo;
	
	
	public StudentService(StudentRepository repo, ProfessorRepository profo) {
		super();
		this.repo = repo;
		this.profo = profo;
	}
	
     public Student add(Student entity) {
		
		return this.repo.add(entity);
	}

	
	public List<Student> findAll(){
		
		return this.repo.findAll();
	}
	
	

}
