package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.BloodBankDTO;
import com.example.demo.entity.DonarDetail;
import com.example.demo.entity.PatientDetail;


@RestController
@RequestMapping(path="/client")
public class BloodBankController {
	
	@Autowired
	private RestTemplate template;
	
	@Autowired
	private BloodBankDTO dto;
	
	@GetMapping(path="/patients")
	public String getPatients() {
		
		return this.template.getForObject("http://PATIENT-DETAILS-SERVICE/api/v1/patients",String.class);
	}
	
	@GetMapping(path="/patientsJson")
	public PatientDetail[] getPatientsAsJson() {
		return this.template.getForObject("http://PATIENT-DETAILS-SERVICE/api/v1/patients", PatientDetail[].class);
	}
	
	@GetMapping(path="/donars")
   public DonarDetail[] getDonars( ) {
		
		return this.template.getForObject("http://DONAR-DETAILS-SERVICE/api/v1/donars", DonarDetail[].class);
	}
	
	@GetMapping(path="/srch/bg/{id}/{bloodgroup}")
	public BloodBankDTO getByBlood(@PathVariable("id")int id,@PathVariable("bloodgroup")String grp) {
		PatientDetail ptnDetail = this.template.getForObject("http://PATIENT-DETAILS-SERVICE/api/v1/patients/"+id,PatientDetail.class);
		DonarDetail[] dnrDetail = this.template.getForObject("http://DONAR-DETAILS-SERVICE/api/v1/donars/bg/"+grp,DonarDetail[].class);
		dto.setPatient(ptnDetail);
		List<DonarDetail> dn = Arrays.asList(dnrDetail);
//		List<DonarDetail> dn = Arrays.stream(dnrDetail).collect(Collectors.toList());
		dto.setDonar(dn);
		
		return dto;
	}
	
	@GetMapping(path="/srch/loc/{id}/{location}")
	public BloodBankDTO getByLocation(@PathVariable("id")int id,@PathVariable("location")String loc) {
		PatientDetail ptnDetail = this.template.getForObject("http://PATIENT-DETAILS-SERVICE/api/v1/patients/"+id,PatientDetail.class);
		DonarDetail[] dnrDetail = this.template.getForObject("http://DONAR-DETAILS-SERVICE/api/v1/donars/loc/"+loc,DonarDetail[].class);
		dto.setPatient(ptnDetail);
		List<DonarDetail> dn = Arrays.asList(dnrDetail);
//		List<DonarDetail> dn = Arrays.stream(dnrDetail).collect(Collectors.toList());
		dto.setDonar(dn);
		
		return dto;
	}

}
