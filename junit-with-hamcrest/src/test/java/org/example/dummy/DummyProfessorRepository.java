package org.example.dummy;

import com.example.ifaces.ProfessorRepository;

public class DummyProfessorRepository implements ProfessorRepository {

	@Override
	public String getQualification() {
		
		throw new AssertionError("Not Yet Implemented");
	}

}
