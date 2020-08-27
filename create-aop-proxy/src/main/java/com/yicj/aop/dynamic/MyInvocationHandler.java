package com.yicj.aop.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ClassName: MyInvocationHandler
 * Description: TODO(描述)
 * Date: 2020/8/27 14:47
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class MyInvocationHandler implements InvocationHandler {


    public static Object wrap(Object target){
        ClassLoader loader = target.getClass().getClassLoader() ;
        Class<?>[] interfaces = target.getClass().getInterfaces() ;
        return Proxy.newProxyInstance(loader, interfaces, new MyInvocationHandler());
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


        return null;
    }
}