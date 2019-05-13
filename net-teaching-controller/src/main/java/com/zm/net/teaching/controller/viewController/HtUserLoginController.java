package com.zm.net.teaching.controller.viewController;

import javax.servlet.http.HttpSession;

import com.zm.net.teaching.domain.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zm.net.teaching.admin.service.impl.HtUserLoginService;

@Controller
public class HtUserLoginController {
	@Autowired
	private HtUserLoginService service;

	/*
	 * 后台登陆方法 用于后台登陆跳转后台管理首页
	 */
	@RequestMapping("Htlogin")
	public String login(UserLogin user, HttpSession session) {
		UserLogin users = service.login(user);
		if (users != null) {
			session.setAttribute("users", users);
			return "Htshow";
		} else {
			return "htlogin";
		}
	}

	@RequestMapping("remove")
	public String removeuser(HttpSession session) {
		session.removeAttribute("users");
		return "redirect:Htinfos";
	}

	@RequestMapping("Htinfos")
	public String info() {
		return "htlogin";
	}

}
