package com.training.ifaces;

import com.training.ifaces.Conditional;;

public class Student implements Conditional {
	
	private  int MarkScored;

	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int markScored) {
		super();
		MarkScored = markScored;
	}

	public int getMarkScored() {
		return MarkScored;
	}

	public void setMarkScored(int markScored) {
		MarkScored = markScored;
	}
	@Override
	public boolean test(Object value) {
		// TODO Auto-generated method stub
		
		String strBranch = (String)value;
		
		boolean result = false;
		if(this.MarkScored>80 && strBranch.equalsIgnoreCase("ece"))
		{
			result = true;
		}
		return result;
	}
	
	
}
