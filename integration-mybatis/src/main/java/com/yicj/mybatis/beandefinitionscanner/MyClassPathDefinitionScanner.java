package com.yicj.mybatis.beandefinitionscanner;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;
import java.lang.annotation.Annotation;

public class MyClassPathDefinitionScanner extends ClassPathBeanDefinitionScanner {

    private Class type;

    public MyClassPathDefinitionScanner(BeanDefinitionRegistry registry, Class<? extends Annotation> type) {
        super(registry, false);
        this.type = type;
    }

    /**
     * 注册 过滤器
     */
    public void registerTypeFilter() {
        addIncludeFilter(new AnnotationTypeFilter(type));
        //---------------------
        // 扫描所有的类包括接口
//        addIncludeFilter(new TypeFilter() {
//            @Override
//            public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
//                return true;
//            }
//        });
    }

}