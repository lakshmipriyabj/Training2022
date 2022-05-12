package com.example.demo.ifaces.Bidirectional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Bidirectional.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
