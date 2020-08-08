package com.yicj.study.beanfactorypostprocessor.client1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * ClassName: Main
 * Description: TODO(描述)
 * Date: 2020/8/8 11:46
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
@Slf4j
public class Main {

    public static void main(String[] args) {
        ClassPathResource resource = new ClassPathResource("beans.xml", Main.class);
        ConfigurableListableBeanFactory bf = new XmlBeanFactory(resource) ;

        BeanFactoryPostProcessor bfpp = (BeanFactoryPostProcessor) bf.getBean("bfpp") ;
        bfpp.postProcessBeanFactory(bf);

        Object simpleBean = bf.getBean("simpleBean");

        log.info("simple bean : {}", simpleBean);
    }

}