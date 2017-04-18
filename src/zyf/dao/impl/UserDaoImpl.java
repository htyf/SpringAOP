package zyf.dao.impl;

import org.springframework.stereotype.Component;

import zyf.dao.IUserDao;

@Component(value="userDao")
public class UserDaoImpl implements IUserDao{

	@Override
	public void save() {
		System.out.println("UserDao........save");
		
	}

	@Override
	public void update() {
		System.out.println("UserDao........update");
		
	}

}
