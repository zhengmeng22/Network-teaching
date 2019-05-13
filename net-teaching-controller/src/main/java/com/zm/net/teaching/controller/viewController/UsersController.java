package com.zm.net.teaching.controller.viewController;

import com.zm.net.teaching.domain.User;
import com.zm.net.teaching.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("users")
public class UsersController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "per", method = RequestMethod.GET)
    public String Person(User user, HttpSession session){
        User select = userService.select(user);
        session.setAttribute("user",select);
        return "PersonalCenter";
    }
}
