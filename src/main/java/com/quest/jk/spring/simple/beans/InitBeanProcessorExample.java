package com.quest.jk.spring.simple.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitBeanProcessorExample implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof BeanProcessorExample) {
            System.out.println("postProcessBeforeInitialization : " + beanName);
            ((BeanProcessorExample) bean).setOrder(20);
        }
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof BeanProcessorExample) {
            System.out.println("postProcessAfterInitialization : " + beanName);
            ((BeanProcessorExample) bean).setOrder(40);
        }
        return bean;
    }
}
