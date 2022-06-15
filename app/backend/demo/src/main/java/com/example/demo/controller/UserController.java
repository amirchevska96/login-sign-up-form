package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constants.Endpoints;
import com.example.demo.domain.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping(Endpoints.SIGNUP)
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping
	public List<User> getAllUsers() {
		return userService.getAll();
	}

	@RequestMapping(value = "/{id}")
	public User getUserById(@PathVariable(value = "id") Integer id) {
		return userService.getById(id);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	public void updateUser(@PathVariable(value = "id") Integer id, @RequestBody User entity) {
		this.userService.update(entity);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deleteUser(@PathVariable(value = "id") Integer id) {
		this.userService.delete(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public void addUser(@RequestBody User entity) {
		this.userService.add(entity);
	}
}
