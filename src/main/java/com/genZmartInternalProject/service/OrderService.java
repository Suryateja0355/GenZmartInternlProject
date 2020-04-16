package com.genZmartInternalProject.service;

import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genZmartInternalProject.repository.OrderRepository;


@Service
public class OrderService {
	
	@Autowired
	public OrderRepository order;
	
	
	public List<JSONObject> getItemsWithLessOrders(){
		return order.ItemsWithLessOrders();
}
	
	public List<JSONObject> getItemsWithMoreOrders(){
		return order.ItemsWithMoreOrders();
}
}