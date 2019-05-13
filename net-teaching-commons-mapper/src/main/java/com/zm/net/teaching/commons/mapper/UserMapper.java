package com.zm.net.teaching.commons.mapper;

import com.zm.net.teaching.domain.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.MyMapper;
@Repository
public interface UserMapper extends MyMapper<User> {
}