package com.tmj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tmj.service.IUserService;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired private IUserService userService;
	
	
	@RequestMapping("/name")
	public String name(){
		return userService.userName();
	}
}
