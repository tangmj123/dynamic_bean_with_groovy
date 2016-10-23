package com.tmj.script.groovy

import org.springframework.stereotype.Service;

import com.tmj.service.IUserService;
@Service
class GroovyServiceImpl implements IUserService{

	@Override
	public String userName() {
		return "this is a groovy user name";
	}
}
