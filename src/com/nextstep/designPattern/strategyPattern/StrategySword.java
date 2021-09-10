package com.nextstep.designPattern.strategyPattern;

public class StrategySword implements Strategy {
    @Override
    public void getInfo() {
        System.out.println("검을 쓰자!");
    }
}
