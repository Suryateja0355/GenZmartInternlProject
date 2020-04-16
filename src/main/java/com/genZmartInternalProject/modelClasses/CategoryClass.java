package com.genZmartInternalProject.modelClasses;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CategoryClass {

	@Id
	private Long category_id;
	private String category;
	
	public CategoryClass() {
		
	}
	public Long getCategory_id() {
		return category_id;
	}
	public void setCategory_id(Long category_id) {
		this.category_id = category_id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Category [category_id=" + category_id + ", category=" + category + "]";
	}	
}

