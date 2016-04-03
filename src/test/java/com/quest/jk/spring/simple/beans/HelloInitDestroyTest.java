package com.quest.jk.spring.simple.beans;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

/**
 * Created by kondurj on 4/3/16.
 */
public class HelloInitDestroyTest {
    private HelloInitDestroy cut;

    private ApplicationContext context = XmlBasedBeanCreator.getInstance();

    @Before
    public void before() {
        cut = (HelloInitDestroy) context.getBean("helloInitDestroy");
    }

    @Test
    public void init() {
        Assert.assertNotNull(cut);
        Assert.assertEquals("jk", cut.getMessage());
    }
}
