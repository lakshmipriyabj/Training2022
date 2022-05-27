package com.example.entity;



public class Country implements Comparable <Country> {
	

	private String country;
	private String place;
    private long population;
    
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Country(String country, String place, long population) {
		super();
		this.country = country;
		this.place = place;
		this.population = population;
	}
	
	


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getPlace() {
		return place;
	}


	public void setPlace(String place) {
		this.place = place;
	}


	public long getPopulation() {
		return population;
	}


	public void setPopulation(long population) {
		this.population = population;
	}


	@Override
	public String toString() {
		return "Country [country=" + country + ", place=" + place + ", population=" + population + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((place == null) ? 0 : place.hashCode());
		result = prime * result + (int) (population ^ (population >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (place == null) {
			if (other.place != null)
				return false;
		} else if (!place.equals(other.place))
			return false;
		if (population != other.population)
			return false;
		return true;
	}


	@Override
	public int compareTo(Country otherObj) {
		if(otherObj.population<this.population) return -1;
		if(otherObj.population>this.population) return -1;
		return 0;
	}
	

    
}
