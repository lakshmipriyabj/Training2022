package com.example.resources;

import java.util.List;
import java.util.ResourceBundle;

import org.glassfish.grizzly.http.util.HttpStatus;

import com.example.model.Student;
import com.example.service.StudentService;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;

import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;



@Path("/students")
public class StudentResources {
	
	private static StudentService service=new  StudentService();
	
	public StudentResources() {
		super();
		
	}

//	@GET //create
//	@Produces(MediaType.APPLICATION_JSON)
//    public Student getStudents()
//	{
//		Student priya = new Student(101,"Priya",98);
//		return priya;
//		
//	}
	
	@POST //create
	@Produces(MediaType.APPLICATION_JSON)
	public Response  add(Student student) {
		
		boolean result =service.add(student);
		if(result) {
			return Response.ok(student).status(201).build();
		}
		else {
			return Response.status(400,"Not created").build();
		}
	}
	
	@GET //read
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getAll()
	{
		return service.getAll();
	}
	
	@GET  //read
	@Path("/{rollNumber}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findById(@PathParam("rollNumber") int id)
	{   try {
		Student entity = service.findById(id)
				.orElseThrow(()-> new RuntimeException("id not found"));
		return Response.ok(entity).build();
	} catch (RuntimeException e) {
	 e.printStackTrace();
	 return Response.ok("id not found").status(400).build();
	}
		
	}
	
	@DELETE   //delete
	@Path("/{rollNumber}")
	@Produces(MediaType.APPLICATION_JSON)
	
	public Response remove(@PathParam("rollNumber") int id) {
	boolean result = service.remove(id);
	if(result)
	{
		return Response.status(204,"One resource deleted").build();
	//	return Response.ok("One resource deleted").status(204).build();
		
	} else {
		return Response.status(400,"Not deleted").build();
	}
	}
	
	@PUT  //update
	@Path("/{rollNumber}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student updateById(@PathParam("rollNumber")  int id , Student newStudent)
	{
		return service.update(id,newStudent);
	}

	
	
}
