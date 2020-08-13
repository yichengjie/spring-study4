package com.yicj.ioc.autowire;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * ClassName: Main
 * Description: TODO(描述)
 * Date: 2020/8/12 22:10
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class Main {

    public static void main(String[] args) {
        ClassPathResource resource = new ClassPathResource("beans.xml", Main.class);
        BeanFactory beanFactory = new XmlBeanFactory(resource) ;
        UserService userService = (UserService)beanFactory.getBean("userService") ;
        System.out.println(userService.getUserDaoList());
    }
}