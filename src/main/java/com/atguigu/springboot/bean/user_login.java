package com.atguigu.springboot.bean;

public class user_login {

    private Integer id;
    private String user_name;
    private String user_pwd;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd;
    }

    public Integer getId() {
        return id;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getUser_pwd() {
        return user_pwd;
    }
}
