package com.nextstep.designPattern.templateCallbackPattern;

public class Soldier {
    public void runContext(Strategy strategy) {
        System.out.println("전투 시작!");
        strategy.getInfo();
        System.out.println("전투 끝...");
    }
}
