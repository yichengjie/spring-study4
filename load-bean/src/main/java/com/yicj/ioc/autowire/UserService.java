package com.yicj.ioc.autowire;

import java.util.List;

/**
 * ClassName: UserService
 * Description: TODO(描述)
 * Date: 2020/8/12 22:08
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class UserService {

    private List<UserDao> userDaoList ;

    public List<UserDao> getUserDaoList() {
        return userDaoList;
    }

    public void setUserDaoList(List<UserDao> userDaoList) {
        this.userDaoList = userDaoList;
    }
}