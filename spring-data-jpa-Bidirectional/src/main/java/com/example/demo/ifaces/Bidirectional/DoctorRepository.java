package com.example.demo.ifaces.Bidirectional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Doctor;



public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

}
