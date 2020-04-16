package com.genZmartInternalProject.modelClasses;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CustomerClass {
	
	@Id
	private Long customer_id;
	private Long age;
	private Long city_id;
	private String customer_name;
	
	public CustomerClass() {
		
	}

	public Long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public Long getCity_id() {
		return city_id;
	}

	public void setCity_id(Long city_id) {
		this.city_id = city_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", age=" + age + ", city_id=" + city_id + ", customer_name="
				+ customer_name + "]";
	}
}
