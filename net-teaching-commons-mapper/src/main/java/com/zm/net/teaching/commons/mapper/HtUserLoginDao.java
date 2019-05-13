package com.zm.net.teaching.commons.mapper;


import com.zm.net.teaching.domain.UserLogin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface HtUserLoginDao {
	public UserLogin login(UserLogin user);
}
