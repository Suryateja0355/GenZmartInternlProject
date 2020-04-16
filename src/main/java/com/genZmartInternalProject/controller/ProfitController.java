package com.genZmartInternalProject.controller;

import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.genZmartInternalProject.service.ProfitService;

@RestController
public class ProfitController {
	
	@Autowired
	public ProfitService profitService;
	
	@GetMapping("/itemsWithProfits")
	public List<JSONObject> getItemsWithAsProfits() {
		return profitService.getItemsWithProfits();
	}

	
	@GetMapping("/citiesWithProfits")
	public List<JSONObject> getCitiesWithProfits() {
		return profitService.getCitiesWithProfits();
	}
}
