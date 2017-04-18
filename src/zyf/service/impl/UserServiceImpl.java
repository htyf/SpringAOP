package zyf.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import zyf.dao.IUserDao;
import zyf.dao.impl.UserDaoImpl;
import zyf.service.IUserService;

@Component(value="userService")
public class UserServiceImpl implements IUserService{
	
	@Resource(name="userDao")
	IUserDao dao =null;

	@Override
	public void save() {
		
		dao.save();
	}

	@Override
	public void update() {
		dao.update();
	}

}
