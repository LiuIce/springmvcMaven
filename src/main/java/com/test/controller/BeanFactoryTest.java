package com.test.controller;

import com.test.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @Author: Lh
 * @Description:
 * @Date: Created in 11:23 2018/4/20
 */
public class BeanFactoryTest {

    @Test
    public void createBeanTest() {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        UserServiceImpl bean = factory.createBean(UserServiceImpl.class);
        System.out.println(bean + "11111");
    }

    @Test
    public void dependcsTest() {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        UserServiceImpl bean = (UserServiceImpl) factory.createBean(UserServiceImpl.class,
                AutowireCapableBeanFactory.AUTOWIRE_BY_TYPE, true);
        System.out.println(bean);
    }
}
