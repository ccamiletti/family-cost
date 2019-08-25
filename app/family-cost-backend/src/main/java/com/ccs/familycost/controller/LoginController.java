package com.ccs.familycost.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ccs.familycost.model.UserEntity;
import com.ccs.familycost.services.UserService;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private UserService userService;

	@RequestMapping("")
	public void login(@RequestBody UserEntity user) {
		
		System.out.println(user);
		//userService.findById(user);
		
	}
	
	
}
