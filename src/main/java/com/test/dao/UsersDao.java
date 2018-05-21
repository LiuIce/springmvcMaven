package com.test.dao;


import com.test.domain.UserBeans;

public interface UsersDao {
	public UserBeans queryById(Integer id);

	public void save();

	public void child();


	public UserBeans	findUser(Integer id);

}
