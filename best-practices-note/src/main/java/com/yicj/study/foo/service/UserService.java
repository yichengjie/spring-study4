package com.yicj.study.foo.service;

import com.yicj.study.foo.dao.UserDao;

import java.util.List;

public class UserService {

    private List<UserDao> userDaoList ;

    public List<UserDao> getUserDaoList() {
        return userDaoList;
    }

    public void setUserDaoList(List<UserDao> userDaoList) {
        this.userDaoList = userDaoList;
    }
}