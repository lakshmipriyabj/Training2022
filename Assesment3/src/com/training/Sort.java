package com.training;

public class Sort {

	private String Fruites;

	public Sort() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sort(String fruites) {
		super();
		Fruites = fruites;
	}

	public String getFruites() {
		return Fruites;
	}

	public void setFruites(String fruites) {
		Fruites = fruites;
	}
	

	@Override
	public String toString() {
		return " " + Fruites + "";
	}
}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((Fruites == null) ? 0 : Fruites.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Sort other = (Sort) obj;
//		if (Fruites == null) {
//			if (other.Fruites != null)
//				return false;
//		} else if (!Fruites.equals(other.Fruites))
//			return false;
//		return true;
//	}
//
//	
//
//}
