package com.nextstep.designPattern.proxyPattern;

public class ServiceA implements IService {
    @Override
    public String getSomething() {
        return "helloMan";
    }
}
