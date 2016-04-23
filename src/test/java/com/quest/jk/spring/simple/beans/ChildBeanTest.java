package com.quest.jk.spring.simple.beans;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

/**
 * Created by kondurj on 4/23/16.
 */
public class ChildBeanTest {

    private ChildBean cut;

    private ApplicationContext beanFactory;

    @Before
    public void before() {
        beanFactory = XmlBasedBeanCreator.getContext("childBean.xml");
        cut = (ChildBean) beanFactory.getBean("childBean");
    }

    @Test
    public void childBean() {
        Assert.assertNotNull(cut);
        Assert.assertEquals("child-property1", cut.getProperty1());
        Assert.assertEquals("parent-property2", cut.getProperty2());
        Assert.assertEquals("child-property3", cut.getProperty3());
    }
}
