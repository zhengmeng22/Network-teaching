package com.zm.net.teaching.user.service;


import com.zm.net.teaching.commons.mapper.UserLoginMapper;
import com.zm.net.teaching.commons.utils.EmailUtils;
import com.zm.net.teaching.domain.User;
import com.zm.net.teaching.domain.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;
import tk.mybatis.mapper.entity.Example;


import java.util.UUID;

@Service
@Transactional
public class UserLoginService {
    @Autowired
    private UserLoginMapper userLoginMapper;

    @Autowired
    private UserService userService;

    @Autowired
    private EmailUtils emailUtils;

    public boolean save(UserLogin userLogin, User user){
        try {

            userLogin.setEmailId(0);
            userLogin.setUuid(UUID.randomUUID().toString());
            userLogin.setPersonnelTypeId(1);
            userLogin.setUserLoginPwd(DigestUtils.md5DigestAsHex(userLogin.getUserLoginPwd().getBytes()));
            userLoginMapper.insert(userLogin);
            emailUtils.sendEmail(user.getUserEmail(),"你好,请"+"<a href='http://localhost:8080/email?UUID="+userLogin.getUuid()+"'>激活"+userLogin.getUuid()+"</a>");
            user.setUserLoginId(userLogin.getUserLoginId());
            userService.save(user);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public void emailUpdate(String UUID){
        Example example = new Example(UserLogin.class);
        example.and()
                .andEqualTo("uuid",UUID);
        UserLogin userLogin = userLoginMapper.selectOneByExample(example);
//        Example example1 = new Example(UserLogin.class);
//        Example.Criteria criteria = example.createCriteria();
//        criteria.andEqualTo("emailId",1);
//        example1.and()
//                .andEqualTo("emailId",1);
//        userLoginMapper.updateByExampleSelective(userLogin,example1);
        userLogin.setEmailId(1);
        userLoginMapper.updateByPrimaryKeySelective(userLogin);
    }

    public UserLogin adminlogin(UserLogin userLogin){
        userLogin.setUserLoginPwd(DigestUtils.md5DigestAsHex(userLogin.getUserLoginPwd().getBytes()));
        Example example = new Example(UserLogin.class);
        example.and()
                .andEqualTo("userLoginName",userLogin.getUserLoginName());
        UserLogin userLogin1 = userLoginMapper.selectOneByExample(example);
        if(userLogin1==null){
            return null;
        }else {
            if(userLogin1.getEmailId().equals(0)){
                return null;
            }
            if(userLogin1.getUserLoginPwd().equals(userLogin.getUserLoginPwd())) {
                return userLogin1;
            }
        }
        return null;
    }


}
