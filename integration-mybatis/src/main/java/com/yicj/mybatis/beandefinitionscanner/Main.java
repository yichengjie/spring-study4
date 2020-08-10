package com.yicj.mybatis.beandefinitionscanner;

import com.yicj.mybatis.beandefinitionscanner.anno.MyBean;
import org.springframework.context.support.GenericApplicationContext;

/**
 * ClassName: Main
 * Description: TODO(描述)
 * Date: 2020/8/9 20:10
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class Main {

    public static void main(String[] args) {
        String BASE_PACKAGE = "com.yicj.mybatis.beandefinitionscanner.service";
        GenericApplicationContext context = new GenericApplicationContext();
        MyClassPathDefinitionScanner scanner = new MyClassPathDefinitionScanner(context, MyBean.class);
        // 注册过滤器
        scanner.registerTypeFilter();
        int beanCount = scanner.scan(BASE_PACKAGE);
        context.refresh();
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println(beanCount);
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}