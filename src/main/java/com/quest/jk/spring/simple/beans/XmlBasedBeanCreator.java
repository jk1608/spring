package com.quest.jk.spring.simple.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kondurj on 3/20/16.
 */
public class XmlBasedBeanCreator {

    private static Map<String, ApplicationContext> contextMap = new HashMap<String, ApplicationContext>();
    private static ApplicationContext context;

    public synchronized static ApplicationContext getContext(String... configXMLs) {
        if (configXMLs == null) {
            return null;
        }
        String contextKey = getKey(configXMLs);
        AbstractApplicationContext context = (AbstractApplicationContext) contextMap.get(contextKey.toString());
        if (context == null) {
            context = new ClassPathXmlApplicationContext(configXMLs);
            contextMap.put(contextKey.toString(), context);
            context.registerShutdownHook();
        }
        return context;
    }

    protected static String getKey(String... fileNames) {
        StringBuilder contextKey = new StringBuilder();
        for (int i = 0; i < fileNames.length; i++) {
            String fileName = fileNames[i];
            if (!fileName.endsWith(".xml")) {
                return null;
            }
            int xmlIndex = fileName.lastIndexOf(".xml");
            contextKey.append(fileName.substring(0, xmlIndex));
        }
        return contextKey.toString();
    }

}
