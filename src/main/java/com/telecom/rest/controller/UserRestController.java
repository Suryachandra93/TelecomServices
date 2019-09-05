package com.telecom.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telecom.dto.ApiResponse;
import com.telecom.model.User;
import com.telecome.service.UserService;

@RestController
@RequestMapping("/user/")
public class UserRestController {

	@Autowired
	private UserService userService;

	@GetMapping(value = "all")
	public ApiResponse getUsers() {
		return userService.getUsers();
	}

	@GetMapping(value = "{id}")
	public ApiResponse getUser(@PathVariable(name = "id") String id) {
		return userService.getUser(id);
	}

	@PostMapping(value = "saveUser")
	public ApiResponse saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

	@DeleteMapping(value = "delete/{id}")
	public ApiResponse deleteUser(@PathVariable(name = "id") String id) {
		return userService.deleteUser(id);
	}

	@DeleteMapping(value = "deleteAll")
	public ApiResponse deleteAllUsers() {
		return userService.deleteUsers();
	}
}