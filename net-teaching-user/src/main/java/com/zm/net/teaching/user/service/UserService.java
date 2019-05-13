package com.zm.net.teaching.user.service;

import com.zm.net.teaching.commons.mapper.UserMapper;
import com.zm.net.teaching.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public void save(User user){
        userMapper.insert(user);
    }

    public User select(User user){
        Example example = new Example(User.class);
        example.and()
                .andEqualTo("userLoginId",user.getUserLoginId());
        User user1 = userMapper.selectOneByExample(example);
        return user1;
    }
}
