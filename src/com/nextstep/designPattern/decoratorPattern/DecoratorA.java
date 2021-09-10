package com.nextstep.designPattern.decoratorPattern;

public class DecoratorA implements IService {
    private ServiceA theServiceA;

    @Override
    public String getSomething() {
        System.out.println("1. 주목적 -> 호출에 대한 장식");
        System.out.println("2. 반환 결과에 장식을 더하여 전달");

        theServiceA = new ServiceA();
        return theServiceA.getSomething() + "?!?";
    }
}
