package com.yicj.study.hello;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * ClassName: MyNamespaceHandler
 * Description: TODO(描述)
 * Date: 2020/8/10 10:09
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
    }
}