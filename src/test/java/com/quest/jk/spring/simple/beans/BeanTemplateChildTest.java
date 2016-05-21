package com.quest.jk.spring.simple.beans;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

/**
 * Created by kondurj on 5/22/16.
 */
public class BeanTemplateChildTest {

    private BeanTemplateChild cut;

    private ApplicationContext context = XmlBasedBeanCreator.getContext("beanTeamplate.xml");

    @Before
    public void before() {
        cut = (BeanTemplateChild) context.getBean("beanTemplateChild");
    }

    @Test
    public void beanProcessorExample() {
        Assert.assertNotNull(cut);
        String p1 = cut.getProp1();
        String p2 = cut.getProp2();
        String p3 = cut.getProp3();
        Assert.assertEquals("JK1", p1);
        Assert.assertEquals("info2", p2);
        Assert.assertEquals("JK3", p3);
    }

}
