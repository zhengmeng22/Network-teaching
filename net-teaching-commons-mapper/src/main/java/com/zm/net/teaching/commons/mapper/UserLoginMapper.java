package com.zm.net.teaching.commons.mapper;

import com.zm.net.teaching.domain.UserLogin;
import org.springframework.stereotype.Repository;
import tk.mybatis.MyMapper;


@Repository
public interface UserLoginMapper extends MyMapper<UserLogin> {

}