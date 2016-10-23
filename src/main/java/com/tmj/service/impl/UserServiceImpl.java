package com.tmj.service.impl;

import com.tmj.service.IUserService;
public class UserServiceImpl implements IUserService{

	@Override
	public String userName() {
		return "this is ordinary user name";
	}
}
