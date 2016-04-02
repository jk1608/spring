package com.quest.jk.spring.simple.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kondurj on 3/20/16.
 */
public class XmlBasedBeanCreator {

    private ApplicationContext context;

    public ApplicationContext getContext() {
        return context;
    }

    protected void setContext(final ApplicationContext context) {
        this.context = context;
    }

    public XmlBasedBeanCreator() {
        context = new ClassPathXmlApplicationContext("beans.xml");
    }
}
