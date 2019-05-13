package com.zm.net.teaching.controller.jsonController;

import com.zm.net.teaching.domain.User;
import com.zm.net.teaching.domain.UserLogin;
import com.zm.net.teaching.user.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private UserLoginService userLoginService;

    @RequestMapping(value = "save",method = RequestMethod.POST)
    public int save(UserLogin userLogin, User user){
        boolean falg = userLoginService.save(userLogin,user);
        if (falg) {
            return 1;
        }
        return 0;
    }

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public int adminlogin(UserLogin userLogin,HttpSession session){
        UserLogin adminlogin = userLoginService.adminlogin(userLogin);
        session.setAttribute("admin",adminlogin);
        if (adminlogin!=null) {
            return 1;
        }
        return 0;
    }



}
