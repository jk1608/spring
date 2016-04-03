package com.quest.jk.spring.simple.beans;

/**
 * Created by kondurj on 4/3/16.
 */
public class HelloInitDestroy {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void init() {
        message = "jk";
    }

    public void destroy() {
        message = null;
        System.out.println("Object being destroyed");
    }
}
