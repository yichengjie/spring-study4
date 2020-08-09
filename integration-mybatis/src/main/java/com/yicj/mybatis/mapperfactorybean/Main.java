package com.yicj.mybatis.mapperfactorybean;

import com.yicj.mybatis.mapper.UserMapper;
import com.yicj.mybatis.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: Main
 * Description: TODO(描述)
 * Date: 2020/8/9 17:32
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml", Main.class) ;
        UserMapper userMapper = (UserMapper) context.getBean("userMapper") ;
        String username = "yicj" ;
        User user = userMapper.getUser(username);
        System.out.println(user);
    }
}