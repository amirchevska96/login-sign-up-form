package com.example.demo.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Endpoints {
	public static final String BASE = "/v1/api/accounts";
	public static final String LOGIN = BASE + "/login";
	public static final String SIGNUP = BASE + "/signup";

	
}