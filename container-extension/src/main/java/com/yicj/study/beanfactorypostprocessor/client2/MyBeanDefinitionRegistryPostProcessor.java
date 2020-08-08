package com.yicj.study.beanfactorypostprocessor.client2;

import com.yicj.study.foo.model.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * ClassName: MyBeanDefinitionRegistryPostProcessor
 * Description: TODO(描述)
 * Date: 2020/8/8 21:19
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
@Slf4j
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        log.info("====> MyBeanDefinitionRegistryPostProcessor...添加了foo之前的bean数="+registry.getBeanDefinitionCount());
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Foo.class) ;
        registry.registerBeanDefinition("helloFoo", rootBeanDefinition) ;
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        int beanDefinitionCount = beanFactory.getBeanDefinitionCount();
        log.info("====> MyBeanDefinitionRegistryPostProcessor...postProcessBeanFactory...的bean数="+beanDefinitionCount);
    }
}