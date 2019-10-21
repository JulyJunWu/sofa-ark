package com.ws.arkboot.controller;

import com.ws.serviceone.HelloServiceOne;
import com.ws.servicetwo.HelloServiceTwo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jun
 * data  2019-10-21 22:32
 */
@RestController
public class HelloController {

    @GetMapping("/1")
    public String one() {
        return new HelloServiceOne().say(18);
    }

    @GetMapping("/2")
    public String two() {
        return new HelloServiceTwo().say(888L);
    }

}
