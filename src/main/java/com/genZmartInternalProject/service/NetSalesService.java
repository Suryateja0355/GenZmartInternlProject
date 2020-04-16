package com.genZmartInternalProject.service;

import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genZmartInternalProject.repository.NetSalesRepository;

@Service
public class NetSalesService {
	
	@Autowired
	public NetSalesRepository netSales;
	
	public List<JSONObject> getItemsNetSales(){
		return netSales.itemsNetSales();
}
	


}
