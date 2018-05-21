package com.test.controller;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.Executors;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.test.domain.User;
import com.test.domain.UserBeans;
import com.test.service.UsersService;

@SuppressWarnings("unused")
@Controller
@RequestMapping("login")
public class LoginController {

    public static String SUCCESS = "welcom";

    @Resource
    UsersService usersService;

    @RequestMapping(value = "/welcome")
    public String toLoginPage(HttpServletRequest request) {
       UserBeans userBeans = usersService.findUser(34);
        System.out.println(userBeans.getUsername());
        return "welcome";
    }

    @RequestMapping(value = "/adduser")
    public void adduser(HttpServletRequest request) {
        usersService.save();
       /* try {
            usersService.child();
        } catch (Exception e) {
            e.printStackTrace();
        }*/

    }



    @RequestMapping(value = "/requestMapping", params = {"username", "age!=10"})
    public String requestMapping(HttpServletRequest request) {
        return "welcome";
    }


    @RequestMapping(value = "/testPathVariable/{id}", method = RequestMethod.GET)
    public String pathVariableTest(@PathVariable("id") Integer id) {
        System.out.println(id);
        return "welcome";
        //return "redirect:user/list.action";
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView() {
        String viewName = "welcome";
        ModelAndView modelAndView = new ModelAndView(viewName);
        modelAndView.addObject("time", new Date());
        return modelAndView;
    }
    
   /* @ModelAttribute
    public void getUser(@RequestParam(value="id",required=false) Integer id,Map<String, Object> map){
    	User user = new User(1,"张三","11111",16);
    	System.out.println("从数据库获取一个对象"+user);
    	map.put("user", user);
    }*/

    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(User user) {
        System.out.println("修改" + user);
        return SUCCESS;

    }
}

