package com.test.controller;

import com.test.service.UserServiceImpl;
import com.test.service.UsersService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: Lh
 * @Description:
 * @Date: Created in 15:47 2018/4/20
 */
public class JavaProxyTest {
    public static void main(String[] args) {
       final  UserServiceImpl userServiceImpl = new UserServiceImpl();
        UsersService userService = (UsersService) Proxy.newProxyInstance(JavaProxyTest.class.getClassLoader(),new Class[]{UsersService.class},new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("前置通知");
                method.invoke(userServiceImpl,args);
                System.out.println("后置通知");
                return null;

            }
        });


    }
}
