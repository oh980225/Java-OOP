package com.nextstep.designPattern.decoratorPattern;

import com.nextstep.designPattern.proxyPattern.ProxyA;
import com.nextstep.designPattern.proxyPattern.ServiceA;

public class Main {
    public static void main(String[] args) {
        // 적용 전
        com.nextstep.designPattern.proxyPattern.ServiceA theServiceA = new ServiceA();
        System.out.println(theServiceA.getSomething());

        // 적용 후
        DecoratorA theDecorator = new DecoratorA();
        System.out.println(theDecorator.getSomething());
    }
}
