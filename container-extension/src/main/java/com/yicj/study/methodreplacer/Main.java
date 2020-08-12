package com.yicj.study.methodreplacer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
        ClassPathResource resource = new ClassPathResource("beans.xml", Main.class);
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        MyBean myBean = (MyBean) beanFactory.getBean("myBean");
        myBean.display();
    }
}