package com.ws.servicetwo;

import com.ws.utils.Hello;

/**
 * @author Jun
 * data  2019-10-21 20:43
 */
public class HelloServiceTwo {

    public String say(Long age){
        return new Hello().say(age);
    }
}
