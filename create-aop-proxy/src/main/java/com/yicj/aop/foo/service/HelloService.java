package com.yicj.aop.foo.service;

import com.yicj.aop.helloworld.anno.MyAnno;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * ClassName: HelloService
 * Description: TODO(描述)
 * Date: 2020/8/9 11:42
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
@Slf4j
@Service
@Data
@MyAnno
public class HelloService {
    private String name ;
    @MyAnno
    public void hello(String add){
        log.info("hello world and name is : {}", name);
    }
}