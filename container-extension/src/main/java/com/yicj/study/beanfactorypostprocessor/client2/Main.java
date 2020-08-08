package com.yicj.study.beanfactorypostprocessor.client2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: Main
 * Description: TODO(描述)
 * Date: 2020/8/8 21:27
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
@Slf4j
public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml", Main.class) ;

        Object helloFoo = context.getBean("helloFoo");

        log.info("hello foo : {}", helloFoo);
    }
}