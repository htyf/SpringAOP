package zyf.action;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import zyf.service.IUserService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserAction {
	@Resource(name="userService")
	IUserService service = null;
	
	@Test
	public void  test(){
		service.save();
		service.update();
	}

}
