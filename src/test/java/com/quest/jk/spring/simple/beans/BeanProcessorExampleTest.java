package com.quest.jk.spring.simple.beans;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

/**
 * Created by kondurj on 4/21/16.
 */
public class BeanProcessorExampleTest {
    private BeanProcessorExample cut;

    private ApplicationContext context = XmlBasedBeanCreator.getContext("beanProcessorExample.xml");

    @Before
    public void before() {
        cut = (BeanProcessorExample) context.getBean("beanProcessorExample");
    }

    @Test
    public void beanProcessorExample() {
        Assert.assertNotNull(cut);
        int actual = cut.getOrder();
        Assert.assertEquals(40, actual);
    }
}
