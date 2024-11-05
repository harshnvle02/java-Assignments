package com.demo.Service;

public class LoginServiceImpl implements LoginService {

	@Override
	public String authenticate(String uname, String pass) {
       
		if(uname.equals("user") &&  pass.equals("user")){
			return "user";
		}
		else if(uname.equals("admin") && pass.equals("admin"))
		{
			return "admin";
		}
		
		return "false";
		
		
		
		
	}
	
	

}
