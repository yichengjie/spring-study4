package com.yicj.study.ioc;

import com.yicj.study.beanwrap.FooModel;
import org.junit.Test;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyAccessorFactory;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.core.Ordered;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceEditor;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: HelloWorldTest
 * Description: TODO(描述)
 * Date: 2020/8/11 20:11
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class HelloWorldTest {

    /**
     *  bean define 使用样例1
     */
    @Test
    public void testBeanDefine1(){
        Class<?> cls =  FooModel.class;
        RootBeanDefinition beanDefinition = new RootBeanDefinition(cls);
        beanDefinition.setSource(null);
        beanDefinition.getPropertyValues().add("order", Ordered.HIGHEST_PRECEDENCE);
        beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
        //registry.registerBeanDefinition(AUTO_PROXY_CREATOR_BEAN_NAME, beanDefinition);
    }


    /**
     * bean wrap 设置对象属性
     */
    @Test
    public void testBeanWrap1(){
        FooModel fooModel = new FooModel() ;

        MutablePropertyValues pvs = new MutablePropertyValues();
        pvs.addPropertyValue(new PropertyValue("location", "classpath:hello.txt"));
        pvs.addPropertyValue(new PropertyValue("surname", "Blair"));
        pvs.addPropertyValue(new PropertyValue("age", "50"));
        pvs.addPropertyValue(new PropertyValue("date","2020-08-10")) ;


        BeanWrapper bw = PropertyAccessorFactory.forBeanPropertyAccess(fooModel);
        bw.registerCustomEditor(Resource.class, new ResourceEditor());
        bw.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),true));
        bw.setPropertyValues(pvs, true);



        Resource location = fooModel.getLocation();
        String filename = location.getFilename();
        System.out.println("file name : " + filename);

        System.out.println(fooModel);
    }
}