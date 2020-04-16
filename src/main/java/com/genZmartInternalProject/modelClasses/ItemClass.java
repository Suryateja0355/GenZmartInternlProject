package com.genZmartInternalProject.modelClasses;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class ItemClass {
	
	@Id
	private Long item_id;
	private String item_name;
	@ManyToOne
	private BrandClass brand_id;
	@ManyToOne
	private CategoryClass category_id;
	@ManyToOne
	private SubCategoryClass sub_category_id;
	public Long getItem_id() {
		return item_id;
	}
	public void setItem_id(Long item_id) {
		this.item_id = item_id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public BrandClass getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(BrandClass brand_id) {
		this.brand_id = brand_id;
	}
	public CategoryClass getCategory_id() {
		return category_id;
	}
	public void setCategory_id(CategoryClass category_id) {
		this.category_id = category_id;
	}
	public SubCategoryClass getSub_category_id() {
		return sub_category_id;
	}
	public void setSub_category_id(SubCategoryClass sub_category_id) {
		this.sub_category_id = sub_category_id;
	}
	@Override
	public String toString() {
		return "ItemClass [item_id=" + item_id + ", item_name=" + item_name + ", brand_id=" + brand_id
				+ ", category_id=" + category_id + ", sub_category_id=" + sub_category_id + "]";
	}
	
	
	
	
	

}
