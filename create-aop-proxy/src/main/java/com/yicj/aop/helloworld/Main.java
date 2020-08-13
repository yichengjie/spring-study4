package com.yicj.aop.helloworld;

import com.yicj.aop.foo.service.HelloService;
import com.yicj.aop.foo.service.TestBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: Main
 * Description: TODO(描述)
 * Date: 2020/8/9 11:24
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext bf = new ClassPathXmlApplicationContext("beans.xml", Main.class) ;
        TestBean bean = (TestBean)bf.getBean("testBean") ;
        //System.out.println("===> " + bean.getClass().getName());
        bean.test();
        ////////////////////
        HelloService helloService = bf.getBean(HelloService.class);
        //System.out.println("===> " + helloService.getClass().getName());
        helloService.hello("test");
    }
}