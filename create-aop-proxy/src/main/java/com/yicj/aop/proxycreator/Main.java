package com.yicj.aop.proxycreator;

import com.yicj.aop.foo.advice.MyAfterAdvice;
import com.yicj.aop.foo.advice.MyBeforeAdvice;
import com.yicj.aop.foo.service.HelloService;
import org.springframework.aop.framework.AdvisedSupport;
import org.springframework.aop.framework.AopProxy;
import org.springframework.aop.framework.DefaultAopProxyFactory;

/**
 * ClassName: Main
 * Description: TODO(描述)
 * Date: 2020/8/11 21:36
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class Main {

    public static void main(String[] args) {
        HelloService helloService = new HelloService();
        helloService.setName("yicj");

        AdvisedSupport config = new AdvisedSupport();
        config.addAdvice(new MyBeforeAdvice());
        config.addAdvice(new MyAfterAdvice());
        config.setTarget(helloService);

        DefaultAopProxyFactory factory = new DefaultAopProxyFactory();
        AopProxy aopProxy = factory.createAopProxy(config);
        HelloService proxy = (HelloService)aopProxy.getProxy(Main.class.getClassLoader());
        proxy.hello("world");
    }
}