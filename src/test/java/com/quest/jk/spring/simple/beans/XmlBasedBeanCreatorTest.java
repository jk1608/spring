package com.quest.jk.spring.simple.beans;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

/**
 * Created by kondurj on 3/20/16.
 */
public class XmlBasedBeanCreatorTest {

    private ApplicationContext cut;

    @Before
    public void setUp() {
        cut = XmlBasedBeanCreator.getContext("beans.xml");
    }

    @Test
    public void getContext() {
        Assert.assertNotNull(cut);
    }

    @Test
    public void helloWorldBean() {
        HelloWorld hw = (HelloWorld) cut.getBean("helloWorld");
        Assert.assertNotNull(hw);
        hw.setMessage("jk");
        String message = hw.getMessage();
        Assert.assertNotNull(message);
        Assert.assertEquals("jk", message);
    }
}
