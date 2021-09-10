package com.nextstep.designPattern.adapterPattern;

public class AdapterServiceB {
    private final ServiceB theServiceB = new ServiceB();

    public void service() {
        theServiceB.serviceB();
    }
}
