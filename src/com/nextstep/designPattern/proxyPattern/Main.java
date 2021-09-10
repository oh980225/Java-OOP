package com.nextstep.designPattern.proxyPattern;

public class Main {
    public static void main(String[] args) {
        // 적용 전
        ServiceA theServiceA = new ServiceA();
        System.out.println(theServiceA.getSomething());

        // 적용 후
        ProxyA theProxy = new ProxyA();
        System.out.println(theProxy.getSomething());
    }
}
