package com.yicj.study.methodreplacer;

import com.yicj.study.util.CommonUtil;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
        CommonUtil.displayDynamicClass();
        ClassPathResource resource = new ClassPathResource("beans.xml", Main.class);
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        MyBean myBean = (MyBean) beanFactory.getBean("myBean");
        myBean.display();
        //
        myBean.hello();
    }
}