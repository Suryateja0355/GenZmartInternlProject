package com.genZmartInternalProject.modelClasses;





import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BrandClass {
	@Id
	private Long brand_id;
	private String brand;
	
	public BrandClass() {
		
	}
	
	public Long getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(Long brand_id) {
		this.brand_id = brand_id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Brand [brand_id=" + brand_id + ", brand=" + brand + "]";
	}
}

