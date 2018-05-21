/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.mapper;

import com.test.dao.UsersDao;
import com.test.domain.User;
import com.test.domain.UserBeans;

public interface UsersMapper {

    public UserBeans queryById(Integer id);

    public void saveUser(User user);

}
