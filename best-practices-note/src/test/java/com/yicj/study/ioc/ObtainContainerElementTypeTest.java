package com.yicj.study.ioc;

import com.yicj.study.beanwrap.FooModel;
import com.yicj.study.foo.service.UserService;
import org.junit.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.config.DependencyDescriptor;
import org.springframework.core.MethodParameter;
import org.springframework.core.PriorityOrdered;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * 获取容器中元素类型
 * ClassName: ObtainContainerElementTypeTest
 * Description: TODO(描述)
 * Date: 2020/8/13 21:11
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class ObtainContainerElementTypeTest {

    /**
     * 获取数组中元素的类型
     */
    @Test
    public void testComponentType(){
        FooModel[] fooModels = {new FooModel()} ;
        Class<?> componentType = fooModels.getClass().getComponentType();
        System.out.println(componentType.getName());
    }


    /**
     * 获取集合中的泛型类型
     */
    @Test
    public void testListElementType(){
        UserService userService = new UserService() ;
        BeanWrapper bw = new BeanWrapperImpl(userService);
        String propertyName = "userDaoList";
        PropertyDescriptor pd = bw.getPropertyDescriptor(propertyName);
        MethodParameter methodParam = BeanUtils.getWriteMethodParameter(pd);
        boolean eager = !PriorityOrdered.class.isAssignableFrom(bw.getWrappedClass());
        DependencyDescriptor descriptor = new AutowireByTypeDependencyDescriptor(methodParam, eager);
        Class<?> type = descriptor.getDependencyType();
        Class<?> elementType = descriptor.getCollectionType();
        boolean isInterFlag = type.isInterface() ;
        System.out.println(isInterFlag);
        System.out.println(elementType.getName());
    }


    /**
     * 获取List中元素的类型
     * @throws Exception
     */
    @Test
    public void testListElementTypePrimary() throws Exception {
        Class<UserService> clazz = UserService.class;
        Field curField = clazz.getDeclaredField("userDaoList");
        Class<?> fieldType = curField.getType();
        Type genericType = curField.getGenericType();
        System.out.println(fieldType);
        System.out.println(genericType);
        if (genericType instanceof ParameterizedType) {
            ParameterizedType pt = (ParameterizedType) genericType;
            // 得到泛型里的class类型对象
            Type[] actualTypeArguments = pt.getActualTypeArguments();
            System.out.println(actualTypeArguments[0]);
        }
    }



    class AutowireByTypeDependencyDescriptor extends DependencyDescriptor {
        public AutowireByTypeDependencyDescriptor(MethodParameter methodParameter, boolean eager) {
            super(methodParameter, false, eager);
        }

        @Override
        public String getDependencyName() {
            return null;
        }
    }
}