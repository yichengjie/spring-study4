package com.yicj.aop.helloworld.service;

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
public class HelloService {

    public void hello(){
        System.out.println("hello world");
    }
}