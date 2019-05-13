package com.zm.net.teaching.domain;

import javax.persistence.*;

@Table(name = "user_login")
public class UserLogin {
    /**
     * 学生登录表的ID
     */
    @Id
    @Column(name = "user_login_id")
    private Integer userLoginId;

    /**
     * 登录账号
     */
    @Column(name = "user_login_name")
    private String userLoginName;

    /**
     * 用户密码
     */
    @Column(name = "user_login_pwd")
    private String userLoginPwd;

    /**
     * 外键ID
     */
    @Column(name = "personnel_type_id")
    private Integer personnelTypeId;

    @Column(name = "email_id")
    private Integer emailId;

    private String uuid;

    /**
     * 获取学生登录表的ID
     *
     * @return user_login_id - 学生登录表的ID
     */
    public Integer getUserLoginId() {
        return userLoginId;
    }

    /**
     * 设置学生登录表的ID
     *
     * @param userLoginId 学生登录表的ID
     */
    public void setUserLoginId(Integer userLoginId) {
        this.userLoginId = userLoginId;
    }

    /**
     * 获取登录账号
     *
     * @return user_login_name - 登录账号
     */
    public String getUserLoginName() {
        return userLoginName;
    }

    /**
     * 设置登录账号
     *
     * @param userLoginName 登录账号
     */
    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName;
    }

    /**
     * 获取用户密码
     *
     * @return user_login_pwd - 用户密码
     */
    public String getUserLoginPwd() {
        return userLoginPwd;
    }

    /**
     * 设置用户密码
     *
     * @param userLoginPwd 用户密码
     */
    public void setUserLoginPwd(String userLoginPwd) {
        this.userLoginPwd = userLoginPwd;
    }

    /**
     * 获取外键ID
     *
     * @return personnel_type_id - 外键ID
     */
    public Integer getPersonnelTypeId() {
        return personnelTypeId;
    }

    /**
     * 设置外键ID
     *
     * @param personnelTypeId 外键ID
     */
    public void setPersonnelTypeId(Integer personnelTypeId) {
        this.personnelTypeId = personnelTypeId;
    }

    /**
     * @return email_id
     */
    public Integer getEmailId() {
        return emailId;
    }

    /**
     * @param emailId
     */
    public void setEmailId(Integer emailId) {
        this.emailId = emailId;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * @param uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}