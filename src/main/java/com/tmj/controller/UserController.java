package com.tmj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tmj.config.config.Configs;
import com.tmj.domain.Person;
import com.tmj.service.IUserService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired private Configs configs;
    
	@Autowired private IUserService userService;
	
	@ApiOperation(value="Get person name",notes="")
	@RequestMapping(value="/name",method=RequestMethod.GET)
	public String name(){
		return userService.userName();
	}
	
	@ApiOperation(value="Add a person",notes="add a person")
    @RequestMapping(value="/add",method=RequestMethod.POST)
	public String createPerson(@RequestBody Person person){
	    
	   System.out.println("configs:"+configs);
	    return "SUCCESS";
	}
}
