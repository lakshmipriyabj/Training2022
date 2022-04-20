package com.training.model;

import java.util.Map;
import java.util.Set;

public class Appointment {
	
	private  Map<Doctor,Set<Patient>> list;

	public Appointment() {
		super();
		this.list = list;
	}

	public Appointment(Map<Doctor, Set<Patient>> list) {
		super();
		this.list = list;
	}

	public Map<Doctor, Set<Patient>> getList() {
		return list;
	}

	public void setList(Map<Doctor, Set<Patient>> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Appointment [list=" + list + "]";
	}

	
	public Set<Patient> get(Doctor key){
		return list.get(key);
	}
	

}
