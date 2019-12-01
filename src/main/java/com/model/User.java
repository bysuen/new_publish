package com.model;

import java.util.Date;

public class User {
    private Integer userid;

    private String username;

    private String loginname;

    private String password;

    private String tel;

    private Date registertime;

    private String status;

    private Integer roleid;

    public User(Integer userid, String username, String loginname, String password, String tel, Date registertime, String status, Integer roleid) {
        this.userid = userid;
        this.username = username;
        this.loginname = loginname;
        this.password = password;
        this.tel = tel;
        this.registertime = registertime;
        this.status = status;
        this.roleid = roleid;
    }

    public User() {
        super();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }
}