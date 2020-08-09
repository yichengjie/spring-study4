package com.yicj.mybatis.mapperscannerconfigure;

import com.yicj.mybatis.mapper.UserMapper;
import com.yicj.mybatis.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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