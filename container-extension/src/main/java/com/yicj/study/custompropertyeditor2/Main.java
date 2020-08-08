package com.yicj.study.custompropertyeditor2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: Main
 * Description: TODO(描述)
 * Date: 2020/8/8 17:38
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext cx =
                new ClassPathXmlApplicationContext("beans.xml", Main.class) ;
        Object userManager = cx.getBean("userManager");

        System.out.println(userManager);
    }
}