package com.yicj.study.foo.model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Data
@Slf4j
public class Foo {

    public Foo(){
        log.info("bean的创建");
    }


    @PostConstruct
    public void init(){
        log.info("bean的初始化");
    }

    @PreDestroy
    public void destroy(){
        log.info("bean的销毁");
    }
}