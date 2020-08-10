package com.yicj.study.hello;

import com.yicj.study.model.User;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * ClassName: UserBeanDefinitionParser
 * Description: TODO(描述)
 * Date: 2020/8/10 10:02
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    // Element对应的类
    @Override
    protected Class<?> getBeanClass(Element element){
        return User.class ;
    }

    // 从element中解析并提出对应的元素

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        String username = element.getAttribute("username") ;
        String email = element.getAttribute("email") ;
        // 将读取到的数据放入到BeanDefinitionBuilder中，待到完成所有bean解析后统一注册到beanFactory中
        if (StringUtils.hasText(username)){
            builder.addPropertyValue("username", username) ;
        }
        if (StringUtils.hasText(email)){
            builder.addPropertyValue("email", email) ;
        }
    }
}