package com.telecome.service;

import org.springframework.stereotype.Service;

import com.telecom.dto.ApiResponse;
import com.telecom.model.User;

@Service
public interface UserService {

	public ApiResponse saveUser(User user);

	public ApiResponse getUsers();

	public ApiResponse getUser(Long id);

	public ApiResponse deleteUser(Long id);
	
	public ApiResponse deleteUsers();

}
