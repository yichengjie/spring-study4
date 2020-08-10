package com.yicj.study.beanwrap;

import org.springframework.beans.*;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceEditor;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: HelloWorld
 * Description: TODO(描述)
 * Date: 2020/8/10 20:38
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class HelloWorld {

    public static void main(String[] args) throws IOException {
        MutablePropertyValues pvs = new MutablePropertyValues();
        pvs.addPropertyValue(new PropertyValue("location", "classpath:hello.txt"));
        pvs.addPropertyValue(new PropertyValue("surname", "Blair"));
        pvs.addPropertyValue(new PropertyValue("age", "50"));
        pvs.addPropertyValue(new PropertyValue("date","2020-08-10")) ;



        FooModel fooModel = new FooModel() ;
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