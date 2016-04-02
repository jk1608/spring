package com.quest.jk.spring.simple.beans;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

/**
 * Created by kondurj on 3/20/16.
 */
public class XmlBasedBeanCreatorTest {

    private XmlBasedBeanCreator cut;

    @Before
    public void setUp() {
        cut = new XmlBasedBeanCreator();
    }

    @Test
    public void getContext() {
        ApplicationContext context = cut.getContext();
        Assert.assertNotNull(context);
    }

    @Test
    public void helloWorldBean() {
        HelloWorld hw = (HelloWorld) cut.getContext().getBean("helloWorld");
        Assert.assertNotNull(hw);
        hw.setMessage("jk");
        String message = hw.getMessage();
        Assert.assertNotNull(message);
        Assert.assertEquals("jk", message);
    }
}
