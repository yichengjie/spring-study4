package com.yicj.aop.methodinterceptor;

import com.yicj.aop.foo.advice.MyAfterAdvice;
import com.yicj.aop.foo.advice.MyBeforeAdvice;
import com.yicj.aop.foo.service.HelloService;
import org.springframework.aop.framework.ReflectiveMethodInvocation;
import org.springframework.aop.framework.adapter.AfterReturningAdviceInterceptor;
import org.springframework.aop.framework.adapter.MethodBeforeAdviceInterceptor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Main
 * Description: TODO(描述)
 * Date: 2020/8/12 13:08
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class Main {

    public static void main(String[] args) throws Throwable {
        //1. 准备拦截器
        MyBeforeAdvice beforeAdvice = new MyBeforeAdvice() ;
        MyAfterAdvice afterAdvice = new MyAfterAdvice() ;
        MethodBeforeAdviceInterceptor beforeInterceptor = new MethodBeforeAdviceInterceptor(beforeAdvice);
        AfterReturningAdviceInterceptor afterInterceptor = new AfterReturningAdviceInterceptor(afterAdvice);
        List<Object> InterceptorList = new ArrayList<>();
        InterceptorList.add(beforeInterceptor);
        InterceptorList.add(afterInterceptor);
        //2.构建拦截器链
        //2.1 准备参数
        Object proxy = new Object() ;
        HelloService target = new HelloService();
        target.setName("yicj");
        Method method = target.getClass().getMethod("hello", String.class) ;
        Object[] arguments = {"test"} ;
        Class<?> targetClass = target.getClass() ;
        //2.1 实例化拦截器链对象
        Constructor<?>[] constructors = ReflectiveMethodInvocation.class.getDeclaredConstructors() ;
        Constructor constructor = constructors[0] ;
        constructor.setAccessible(true);
        Object obj = constructor.newInstance(proxy, target, method, arguments, targetClass, InterceptorList);
        ReflectiveMethodInvocation invocationChina = (ReflectiveMethodInvocation)obj ;
        //2.3 执行拦截器
        invocationChina.proceed() ;
    }
}