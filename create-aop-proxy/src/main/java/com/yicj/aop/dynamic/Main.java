package com.yicj.aop.dynamic;

import com.yicj.aop.foo.service.TestBean;

/**
 * ClassName: Main
 * Description: TODO(描述)
 * Date: 2020/8/27 14:51
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class Main {

    public static void main(String[] args) {
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true") ;
        TestBean testBean = new TestBean() ;
        MyInvocationHandler.wrap(testBean) ;
    }
}