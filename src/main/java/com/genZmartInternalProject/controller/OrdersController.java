package com.genZmartInternalProject.controller;

import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.genZmartInternalProject.service.OrderService;

@RestController
public class OrdersController {
	
	@Autowired
	public OrderService orderService;
	
	@GetMapping("/itemsWithLessOrders")
	public List<JSONObject> getItemsWithLessOrders() {
		return orderService.getItemsWithLessOrders();
	}


	@GetMapping("/itemsWithMoreOrders")
	public List<JSONObject> getItemsWithMoreOrders() {
		return orderService.getItemsWithMoreOrders();
	}
}
