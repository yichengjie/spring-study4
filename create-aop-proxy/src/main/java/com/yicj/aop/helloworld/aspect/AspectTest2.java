package com.yicj.aop.helloworld.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * ClassName: AspectTest2
 * Description: TODO(描述)
 * Date: 2020/8/11 19:39
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
@Slf4j
@Aspect
@Component
public class AspectTest2 {
    //@Pointcut("execution(* com.yicj.aop..*.*(..))")
    @Pointcut("@annotation(com.yicj.aop.helloworld.anno.MyAnno)")
    public void test2(){}

    @Before("test2()")
    public void beforeTest(){
        log.info("before test2....");
    }
}