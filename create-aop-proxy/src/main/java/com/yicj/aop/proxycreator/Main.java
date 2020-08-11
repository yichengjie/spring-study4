package com.yicj.aop.proxycreator;

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


        AdvisedSupport config = null ;
        DefaultAopProxyFactory factory = new DefaultAopProxyFactory();
        AopProxy aopProxy = factory.createAopProxy(config);
        Object proxy = aopProxy.getProxy(Main.class.getClassLoader());

    }
}