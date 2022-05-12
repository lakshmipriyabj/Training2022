package com.example.demo.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	public List<Employee> findByDateOfBirth(LocalDate date);
	public List<Employee>findByLocationAndSkillSet(String location,String skillset);
	public List<Employee>findByLocation(String location);
	public List<Employee>findBySkillSet(String skillset);
	
	@Query(nativeQuery=true,value="select * from lp_employees where skill_set=:skill or location=:loca")
	public List<Employee>getBySkillLoca(@Param("skill")String skill,
			                           @Param("loca") String loca);
}
