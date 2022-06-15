package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constants.Endpoints;
import com.example.demo.domain.Login;
import com.example.demo.service.LoginService;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
//@CrossOrigin(origins = "http://127.0.0.1:80")
@RequestMapping(Endpoints.LOGIN)
public class LoginController {
	@Autowired
	LoginService loginService;

	@RequestMapping
	public List<Login> getAllLogins() {
		return this.loginService.getAll();

	}

	@RequestMapping(value = "/{id}")
	public Login getLoginById(@PathVariable(value = "id") Integer id) {
		return loginService.getById(id);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	public void updateLogin(@PathVariable(value = "id") Integer id, @RequestBody Login entity) {
		this.loginService.update(entity);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deleteLogin(@PathVariable(value = "id") Integer id) {
		this.loginService.delete(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public void addLogin(@RequestBody Login entity) {
		this.loginService.add(entity);
	}
}
