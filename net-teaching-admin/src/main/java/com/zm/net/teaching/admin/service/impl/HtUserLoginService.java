package com.zm.net.teaching.admin.service.impl;

import com.zm.net.teaching.commons.mapper.HtUserLoginDao;
import com.zm.net.teaching.domain.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HtUserLoginService {
	@Autowired
	private HtUserLoginDao dao;

	public UserLogin login(UserLogin user) {
		return dao.login(user);
	}
}
