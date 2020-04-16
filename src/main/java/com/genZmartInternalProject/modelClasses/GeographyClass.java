package com.genZmartInternalProject.modelClasses;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class GeographyClass {
	
	@Id
	private Long City_id;
	private String City;
	private String State;
	
	public GeographyClass() {
		
	}
	
	
	public Long getCity_id() {
		return City_id;
	}
	public void setCity_id(Long city_id) {
		this.City_id = city_id;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		this.City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		this.State = state;
	}


	@Override
	public String toString() {
		return "Geography [City_id=" + City_id + ", City=" + City + ", State=" + State + "]";
	}
	
	

}
