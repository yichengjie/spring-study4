package com.yicj.mybatis.hello.mapper;

import com.yicj.mybatis.model.User;

import java.util.List;

/**
 * ClassName: UserMapper
 * Description: TODO(描述)
 * Date: 2020/8/9 17:24
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public interface UserMapper {

    Integer insertUser(User user) ;

    User getUser(String username) ;
}