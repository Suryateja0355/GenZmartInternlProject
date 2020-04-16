package com.genZmartInternalProject.controller;

import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.genZmartInternalProject.service.NetSalesService;

@RestController
public class NetSalesController {
	
	@Autowired
	public NetSalesService netSalesItem;
	
	@GetMapping("/netSalesItem")
	public List<JSONObject> getItemsWithNetSasles() {
		return netSalesItem.getItemsNetSales();
	}

}
