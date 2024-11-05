package com.demo.service;

public class LoginServiceImpl implements LoginService {

	@Override
	public String authenticate(String userId, String pin) {
		
		if(userId.equals("user") && pin.equals("user")) {
			
			return "user";
		}
		else if(userId.equals("admin") && pin.equals("admin")) {
			
			return "admin";
		}
		else {
			return null;
		}
		
	}

}
