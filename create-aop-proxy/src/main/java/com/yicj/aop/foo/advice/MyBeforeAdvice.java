package com.yicj.aop.foo.advice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.MethodBeforeAdvice;
import java.lang.reflect.Method;

/**
 * ClassName: MyBeforeAdvice
 * Description: TODO(描述)
 * Date: 2020/8/11 22:06
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
@Slf4j
public class MyBeforeAdvice  implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        log.info("===========> before advice .....");
    }
}