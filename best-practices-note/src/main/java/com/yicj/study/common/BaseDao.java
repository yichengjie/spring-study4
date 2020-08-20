package com.yicj.study.common;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class BaseDao<T> {
    public Class<T> clazz;

    public BaseDao() {
        Type superclass = getClass().getGenericSuperclass();
        if (superclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) superclass;
            Type[] typeArray = parameterizedType.getActualTypeArguments();
            if (typeArray != null && typeArray.length > 0) {
                  clazz=(Class)typeArray[0];
            }
        }
    }

    public T query(){
        Class<? extends BaseDao> aClass = this.getClass();
        System.out.println("clazz : " + clazz);
        return null ;
    }

    static class User{}
    static class UserDao extends BaseDao<User> {}
    static class HelloDao extends BaseDao {}

    public static void main(String[] args) {
//        BaseDao<User> dao = new UserDao() ;
//        dao.query();
//        BaseDao dao2 = new HelloDao() ;
//        dao2.query();
        BaseDao<Integer> dao3 = new BaseDao<>();
        dao3.query() ;
    }
}