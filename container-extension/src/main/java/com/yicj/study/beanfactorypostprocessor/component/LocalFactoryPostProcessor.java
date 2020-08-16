package com.yicj.study.beanfactorypostprocessor.component;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class LocalFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("BeanFactoryPostProcessor被调用了....");
		String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();

		for (String beanDefinitionName : beanDefinitionNames) {
			if (beanDefinitionName.equals("helloSpring")){
				BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanDefinitionName);
				//获取属性值,并执行修改
				MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();
				if (propertyValues.contains("name")){
					propertyValues.addPropertyValue("name","王五");
					System.out.println("属性值修改成功");
				}
			}
		}
	}
}