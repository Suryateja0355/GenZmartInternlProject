package com.genZmartInternalProject.controller;

import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import com.genZmartInternalProject.service.GrowthService;

@RestController
public class GrowthController {
	

	@Autowired
	public GrowthService growthService;
	
	@GetMapping("/gettingGrowth")
	public List<JSONObject> getGrowthAsMonths() {
		return growthService.getGrowthInMonths();
	}


}
