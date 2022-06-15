package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.domain.Login;
import com.example.demo.repository.LoginRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

import ch.qos.logback.core.net.ObjectWriter;
@ExtendWith(MockitoExtension.class)
//@RunWith(MockitoJUnitRunner.class)
class LoginControllerTest {
	@Autowired
	private MockMvc mockmvc;

	ObjectMapper objectmapper = new ObjectMapper();
	ObjectWriter objectwriter = (ObjectWriter) objectmapper.writer();
	@Mock
	private LoginRepository loginRepo;
	@InjectMocks
	private LoginController loginController;
	


	@BeforeEach
	void setUp() throws Exception {
	}
	@Test
	final void testGetAllLogins() {
		List<Login> logins= new ArrayList<Login>(Arrays.asList(new Login("ange","258305"),new Login("ane","258"),new Login("ana","305")));
	}

	@Test
	final void testGetLoginById() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	final void testUpdateLogin() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	final void testDeleteLogin() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	final void testAddLogin() {
		fail("Not yet implemented"); // TODO
	}

}
