package com.ws.serviceone;

import com.ws.utils.Hello;

/**
 * @author Jun
 * data  2019-10-21 20:36
 */
public class HelloServiceOne {

    public String say(int age) {
        Hello hello = new Hello();
        return hello.say(age);
    }
}
