package com.nextstep.designPattern.strategyPattern;

public class StrategyGun implements Strategy {
    @Override
    public void getInfo() {
        System.out.println("총을 쏘자!");
    }
}
