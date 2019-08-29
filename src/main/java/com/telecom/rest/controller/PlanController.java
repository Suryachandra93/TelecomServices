package com.telecom.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telecom.dto.ApiResponse;
import com.telecom.model.Plan;
import com.telecome.service.PlanService;

@RestController
@RequestMapping("/plan/")
public class PlanController {
	
	@Autowired
	private PlanService planService;
	
	@GetMapping("all")
	public ApiResponse getPlans() {
		return planService.getPlans();
	}
	
	@GetMapping("{id}")
	public ApiResponse getPlan(@PathVariable Long id) {
		return planService.getPlan(id);
	}
	
	
	@PostMapping("savePlan")
	public ApiResponse savaPlan(@RequestBody Plan plan) {
		return planService.savePlan(plan);
	}
	
}
