package com.nextstep.designPattern.strategyPattern;

public class StrategyPunch implements Strategy {
    @Override
    public void getInfo() {
        System.out.println("주먹으로 치자!");
    }
}
