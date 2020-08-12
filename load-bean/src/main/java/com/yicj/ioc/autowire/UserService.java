package com.yicj.ioc.autowire;

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

    private UserDao userDao ;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}