package com.quest.jk.spring.simple.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kondurj on 3/20/16.
 */
public class XmlBasedBeanCreator {

    private static ApplicationContext context;

    public static ApplicationContext getInstance() {
        if (context == null) {
            context = new ClassPathXmlApplicationContext("beans.xml");
        }
        return context;
    }

}
