package com.telecom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.telecom.dto.ApiResponse;
import com.telecom.model.Plan;
import com.telecom.model.User;
import com.telecom.repo.PlanRepo;
import com.telecome.service.PlanService;

@Service
public class PlanServiceImpl implements PlanService{
	
	@Autowired
	private PlanRepo planRepo;

	@Override
	public ApiResponse savePlan(Plan plan) {
		planRepo.save(plan);
		String message="Plan saved";
		ApiResponse response=new ApiResponse(HttpStatus.OK, message, null);
		return response;
	}

	@Override
	public ApiResponse getPlans() {
		List<Plan> plans=planRepo.findAll();
		ApiResponse response=new ApiResponse(HttpStatus.OK,null,plans);
		return response;
	}

	@Override
	public ApiResponse getPlan(Long id) {
		String message=null;
		ApiResponse response=null;
		Plan plan = planRepo.findById(id).isPresent() ? planRepo.findById(id).get() : null;
		if (plan == null) {
			message = "Plan doesn't exist with id " + id;
			response = new ApiResponse(HttpStatus.NO_CONTENT, message, plan);
		}
		response = new ApiResponse(HttpStatus.OK, null, plan);
		return response;
	}

	
}
