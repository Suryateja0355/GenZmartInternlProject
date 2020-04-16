package com.genZmartInternalProject.modelClasses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


// entity class or pojo class or model class
@Entity
@Table(name="orders")
public class OrderModelClass {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long order_no;
	
	@ManyToOne
	private ItemClass item_id;

	
	private String sales_date;
	@ManyToOne
	private CustomerClass customer_id;
	@ManyToOne
	private GeographyClass city_id;

	
	private int Qty;
	
	private double price;
	
	private double COGS;
	
	private double discount_price;
	
	private String delivery_date;
	
	// constructor
	public OrderModelClass(long order_no, ItemClass item_id, String sales_date, CustomerClass customer_id, GeographyClass city_id, int qty,
			double price, double COGS, double discount_price, String delivery_date) {
		super();
		this.order_no = order_no;
		this.item_id = item_id;
		this.sales_date = sales_date;
		this.customer_id = customer_id;
		this.city_id = city_id;
		this.Qty = qty;
		this.price = price;
		this.COGS = COGS;
		this.discount_price = discount_price;
		this.delivery_date = delivery_date;
	}
	
	
	
	// defalut constructor is required
	public OrderModelClass() {
		super();
		
	}





	public long getOrder_no() {
		return order_no;
	}
	public void setOrder_no(long order_no) {
		this.order_no = order_no;
	}
	public ItemClass getItem_id() {
		return item_id;
	}
	public void setItem_id(ItemClass item_id) {
		this.item_id = item_id;
	}
	public String getSales_date() {
		return sales_date;
	}
	public void setSales_date(String sales_date) {
		this.sales_date = sales_date;
	}
	public CustomerClass getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(CustomerClass customer_id) {
		this.customer_id = customer_id;
	}
	public GeographyClass getCity_id() {
		return city_id;
	}
	public void setCity_id(GeographyClass city_id) {
		this.city_id = city_id;
	}
	public int getQty() {
		return Qty;
	}
	public void setQty(int qty) {
		Qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getCOGS() {
		return COGS;
	}
	public void setCOGS(double cOGS) {
		COGS = cOGS;
	}
	public double getDiscount_price() {
		return discount_price;
	}
	public void setDiscount_price(double discount_price) {
		this.discount_price = discount_price;
	}
	public String getDelivery_date() {
		return delivery_date;
	}
	public void setDelivery_date(String delivery_date) {
		this.delivery_date = delivery_date;
	}



	@Override
	public String toString() {
		return "OrderModelClass [order_no=" + order_no + ", item_id=" + item_id + ", sales_date=" + sales_date
				+ ", customer_id=" + customer_id + ", city_id=" + city_id + ", Qty=" + Qty + ", price=" + price
				+ ", COGS=" + COGS + ", discount_price=" + discount_price + ", delivery_date=" + delivery_date + "]";
	}


	
	
	
}
