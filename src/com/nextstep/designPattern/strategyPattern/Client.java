package com.nextstep.designPattern.strategyPattern;

public class Client {
    public static void main(String[] args) {
        Strategy strategy = null;
        Soldier rambo = new Soldier();

        strategy = new StrategyPunch();
        rambo.runContext(strategy);

        System.out.println();

        strategy = new StrategySword();
        rambo.runContext(strategy);

        System.out.println();

        strategy = new StrategyGun();
        rambo.runContext(strategy);
    }
}
