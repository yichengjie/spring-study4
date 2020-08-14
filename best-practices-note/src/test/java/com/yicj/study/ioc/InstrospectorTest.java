package com.yicj.study.ioc;

import com.yicj.study.foo.model.UserInfo;
import org.junit.Test;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

/**
 * ClassName: InstrospectorTest
 * Description: TODO(描述)
 * Date: 2020/8/14 21:15
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class InstrospectorTest {

    // 设置bean的某个属性
    @Test
    public void setProperty() throws Exception {
        UserInfo userInfo = new UserInfo() ;
        String userName = "userName" ;
        // 获取bean的某个属性描述符
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(userName, UserInfo.class);
        // 获得用于写入属性的方法
        Method writeMethod = propertyDescriptor.getWriteMethod();
        // 写入属性
        writeMethod.invoke(userInfo, "wong");
        System.out.println("set userName : " + userInfo.getUserName());
    }

    // 获取bean的某个属性值
    @Test
    public void getProperty() throws Exception{
        UserInfo userInfo = new UserInfo() ;
        userInfo.setUserName("张三");
        String userName = "userName" ;
        // 获取Bean的某个属性描述符
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(userName, UserInfo.class) ;
        // 获取用于读取属性的方法
        Method readMethod = propertyDescriptor.getReadMethod();
        // 读取属性值
        Object retValue = readMethod.invoke(userInfo);
        System.out.println("get userName :" + retValue);
    }

}