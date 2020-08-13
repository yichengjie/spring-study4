package com.yicj.aop.helloworld.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * ClassName: AspectJTest
 * Description: TODO(描述)
 * Date: 2020/8/9 11:11
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
@Slf4j
@Aspect
//@Component
public class AspectJTest {

    @Pointcut("execution(* com.yicj.aop..*.test(..))")
    public void test(){}


    @Before("test()")
    public void beforeTest(){
        log.info("before test....");
    }

    @After("test()")
    public void afterTest(){
        log.info("after test ... ");
    }

    @Around("test()")
    public Object aroundTest(ProceedingJoinPoint p){
        log.info("before1 ... ");
        Object o = null ;
        try {
            o = p.proceed() ;
        }catch (Throwable e){
            log.error("error : ", e);
        }
        log.info("after1 ...");
        return  o;
    }
}