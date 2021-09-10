package com.nextstep.designPattern.proxyPattern;

public class ProxyA implements IService {
    private ServiceA theServiceA;

    @Override
    public String getSomething() {
        System.out.println("1. 주목적 -> 호출에 대한 흐름 제어");
        System.out.println("2. 반환 결과 그대로 전달");

        theServiceA = new ServiceA();
        return theServiceA.getSomething();
    }
}
