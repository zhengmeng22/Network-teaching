package com.zm.net.teaching.controller.viewController;

import com.zm.net.teaching.user.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class UserLoginController {
    @Autowired
    private UserLoginService userLoginService;

    @RequestMapping("")
    public String vidoe(){
        return "videojs";
    }

    @RequestMapping(value = "email", method = RequestMethod.GET)
    public String emailUpdate(String UUID){
        userLoginService.emailUpdate(UUID);
        return "home";
    }


    @RequestMapping(value = "out", method = RequestMethod.GET)
    public String out(HttpSession session){
        session.removeAttribute("admin");
        return "redirect:home";
    }


}
