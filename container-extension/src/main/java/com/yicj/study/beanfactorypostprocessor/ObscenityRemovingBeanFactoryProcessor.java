package com.yicj.study.beanfactorypostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionVisitor;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.util.StringValueResolver;

import java.util.HashSet;
import java.util.Set;

/**
 * ClassName: ObscenityRemovingBeanFactoryProcessor
 * Description: TODO(描述)
 * Date: 2020/8/8 11:36
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class ObscenityRemovingBeanFactoryProcessor implements BeanFactoryPostProcessor {

    private Set<String> obscenities;

    public ObscenityRemovingBeanFactoryProcessor(){
        this.obscenities = new HashSet<>() ;
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        String [] beanNames = beanFactory.getBeanDefinitionNames() ;
        for (String beanName: beanNames){
            BeanDefinition bd = beanFactory.getBeanDefinition(beanName);
            StringValueResolver valueResolver = strVal -> {
                if (isObscene(strVal)){
                    return "*****" ;
                }
                return strVal;
            };
            BeanDefinitionVisitor visitor = new BeanDefinitionVisitor(valueResolver) ;
            visitor.visitBeanDefinition(bd);
        }
    }

    private boolean isObscene(String value) {
        String potentialObscenity = value.toUpperCase() ;
        return this.obscenities.contains(potentialObscenity) ;
    }

    public void setObscenities(Set<String> obscenities) {
        this.obscenities.clear();
        for (String obscenity: obscenities){
            this.obscenities.add(obscenity.toUpperCase()) ;
        }
    }
}