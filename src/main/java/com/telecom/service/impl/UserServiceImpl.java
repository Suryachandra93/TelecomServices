package com.telecom.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.telecom.dto.ApiResponse;
import com.telecom.model.User;
import com.telecom.repo.UserRepo;
import com.telecome.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;

	private ApiResponse response = null;

	private String message = "";

	@Override
	public ApiResponse saveUser(User user) {
		message = "User Saved";
		userRepo.save(user);
		response = new ApiResponse(HttpStatus.OK, message, null);
		return response;
	}

	@Override
	public ApiResponse getUsers() {
		List<User> users = new ArrayList<User>();
		users = userRepo.findAll();
		response = new ApiResponse(HttpStatus.OK, null, users);
		return response;
	}

	@Override
	public ApiResponse getUser(Long id) {
		User user = userRepo.findById(id).isPresent() ? userRepo.findById(id).get() : null;
		if (user == null) {
			message = "User doesn't exist with id " + id;
			response = new ApiResponse(HttpStatus.NO_CONTENT, message, user);
		}
		response = new ApiResponse(HttpStatus.OK, null, user);
		return response;
	}

	@Override
	public ApiResponse deleteUser(Long id) {
		userRepo.deleteById(id);
		message = "User Deleted";
		response = new ApiResponse(HttpStatus.OK, message, null);
		return response;
	}

	@Override
	public ApiResponse deleteUsers() {
		userRepo.deleteAll();
		message = "Users Deleted";
		response = new ApiResponse(HttpStatus.OK, message, null);
		return response;
	}

}
