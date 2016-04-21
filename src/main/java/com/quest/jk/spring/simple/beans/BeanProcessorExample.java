package com.quest.jk.spring.simple.beans;

/**
 * Created by kondurj on 4/21/16.
 */
public class BeanProcessorExample {

    private int order;

    public int getOrder() {
        System.out.println();
        System.out.println("getOrder : " + order);
        return order;
    }

    public void setOrder(final int order) {
        this.order = order;
        System.out.println("setOrder : " + this.order);
    }

    public void init() {
        order = 30;
        System.out.println("init");
        System.out.println(order);
    }

    public void destroy() {
        order = 100;
        System.out.println();
        System.out.println("destroyed");
        System.out.println(order);
    }
}
