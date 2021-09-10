package com.nextstep.designPattern.adapterPattern;

public class AdapterServiceA {
    private final ServiceA theServiceA = new ServiceA();

    public void service() {
        theServiceA.serviceA();
    }
}
