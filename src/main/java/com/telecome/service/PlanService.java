package com.telecome.service;

import org.springframework.stereotype.Service;

import com.telecom.dto.ApiResponse;
import com.telecom.model.Plan;

@Service
public interface PlanService {
	
	public ApiResponse savePlan(Plan plan);
	
	public ApiResponse getPlans();

	public ApiResponse getPlan(String id);
}
