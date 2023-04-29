package com.example.petproduct.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.petproduct.model.Login;
import com.example.petproduct.repository.LoginRepository;

@Service
public class LoginService {
	@Autowired
	LoginRepository loginRepo;
public Login saveUser(Login u)
{
return loginRepo.save(u);
}
public String validateUser(String username,String password)
{
	String result="";
	Login u=loginRepo.findByUsername(username);
	if(u==null)
	{
		result="Invalid user";
	}
		else
		{
			if(u.getPassword().equals(password))
			{
				result="Login success";
			}
			else
			{
				result="Login failed";
			}
		}
	

	return result;
	}
	
	
	}


