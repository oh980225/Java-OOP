package com.nextstep.designPattern.adapterPattern;

public class Main {
    public static void main(String[] args) {
        // 적용 전
        ServiceA sa = new ServiceA();
        ServiceB sb = new ServiceB();
        sa.serviceA();
        sb.serviceB();

        // 적용 후
        AdapterServiceA asa = new AdapterServiceA();
        AdapterServiceB asb = new AdapterServiceB();
        asa.service();
        asb.service();
    }
}
