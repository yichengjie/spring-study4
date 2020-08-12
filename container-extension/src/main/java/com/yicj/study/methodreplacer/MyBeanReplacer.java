package com.yicj.study.methodreplacer;

import org.springframework.beans.factory.support.MethodReplacer;
import java.lang.reflect.Method;

public class MyBeanReplacer implements MethodReplacer {
    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("我替换了原来的方法");
        return null;
    }
}