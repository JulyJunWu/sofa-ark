package com.ws.test;

import com.alipay.sofa.ark.support.startup.SofaArkBootstrap;
import com.ws.serviceone.HelloServiceOne;
import com.ws.servicetwo.HelloServiceTwo;

/**
 * @author Jun
 * data  2019-10-22 20:49
 * java 普通应用使用 ark plugin
 */
public class TestArkSe {

    /**
     * 若启动失败,则将顶级pom除了自身其余module注释即可
     * @param args
     */
    public static void main(String[] args) {
        SofaArkBootstrap.launch(args);

        HelloServiceOne serviceOne = new HelloServiceOne();
        HelloServiceTwo serviceTwo = new HelloServiceTwo();

        serviceOne.say(18);
        serviceTwo.say(18L);
    }

}
