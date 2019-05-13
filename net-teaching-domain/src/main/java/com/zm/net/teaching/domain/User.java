package com.zm.net.teaching.domain;

import javax.persistence.*;

public class User {
    /**
     * 用户id
     */
    @Id
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 用户昵称
     */
    @Column(name = "user_Nickname")
    private String userNickname;

    /**
     * 用户头像地址
     */
    @Column(name = "user_img")
    private String userImg;

    /**
     * 真实姓名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 年龄
     */
    @Column(name = "user_age")
    private Integer userAge;

    /**
     * 用户手机
     */
    @Column(name = "user_tel")
    private String userTel;

    /**
     * 用户邮箱
     */
    @Column(name = "user_Email")
    private String userEmail;

    /**
     * 等级认证
     */
    @Column(name = "user_Grade")
    private Integer userGrade;

    /**
     * 登录表ID
     */
    @Column(name = "user_login_id")
    private Integer userLoginId;

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取用户昵称
     *
     * @return user_Nickname - 用户昵称
     */
    public String getUserNickname() {
        return userNickname;
    }

    /**
     * 设置用户昵称
     *
     * @param userNickname 用户昵称
     */
    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    /**
     * 获取用户头像地址
     *
     * @return user_img - 用户头像地址
     */
    public String getUserImg() {
        return userImg;
    }

    /**
     * 设置用户头像地址
     *
     * @param userImg 用户头像地址
     */
    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    /**
     * 获取真实姓名
     *
     * @return user_name - 真实姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置真实姓名
     *
     * @param userName 真实姓名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取年龄
     *
     * @return user_age - 年龄
     */
    public Integer getUserAge() {
        return userAge;
    }

    /**
     * 设置年龄
     *
     * @param userAge 年龄
     */
    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    /**
     * 获取用户手机
     *
     * @return user_tel - 用户手机
     */
    public String getUserTel() {
        return userTel;
    }

    /**
     * 设置用户手机
     *
     * @param userTel 用户手机
     */
    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    /**
     * 获取用户邮箱
     *
     * @return user_Email - 用户邮箱
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * 设置用户邮箱
     *
     * @param userEmail 用户邮箱
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * 获取等级认证
     *
     * @return user_Grade - 等级认证
     */
    public Integer getUserGrade() {
        return userGrade;
    }

    /**
     * 设置等级认证
     *
     * @param userGrade 等级认证
     */
    public void setUserGrade(Integer userGrade) {
        this.userGrade = userGrade;
    }

    /**
     * 获取登录表ID
     *
     * @return user_login_id - 登录表ID
     */
    public Integer getUserLoginId() {
        return userLoginId;
    }

    /**
     * 设置登录表ID
     *
     * @param userLoginId 登录表ID
     */
    public void setUserLoginId(Integer userLoginId) {
        this.userLoginId = userLoginId;
    }
}