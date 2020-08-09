package com.yicj.aop.helloworld.service;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * ClassName: TestBean
 * Description: TODO(描述)
 * Date: 2020/8/9 11:04
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
@Data
@Slf4j
@Service
public class TestBean {

    private String testStr = "testStr";

    public void test(){
        log.info("test execute ....");
    }
}