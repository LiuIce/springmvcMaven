package com.test.service;


import com.test.dao.UsersDao;
import com.test.domain.User;
import com.test.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.domain.UserBeans;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service("usersService")
public class UserServiceImpl  implements UsersService {

	@Autowired
	private UsersMapper usersMapper;

	@Autowired
	private UsersDao  usersDao;

	public UserBeans findUser(Integer id) {
		if(id==null){
			return null;
		}
		UserBeans user=this.usersMapper.queryById(id);
		if(user==null){
			return null;
		}
		return user;
	}

	public UserBeans queryById(Integer id) {
		return null;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void save() {
		User user = new  User();
		user.setPassWord("123456");
		user.setUserName("wo");
		usersMapper.saveUser(user);
		child();
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void child() {
		User user = new  User();
		user.setPassWord("123456");
		user.setUserName("ta");
		usersMapper.saveUser(user);
		throw new RuntimeException("child Exception....................");
	}
}
