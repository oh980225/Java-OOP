package com.nextstep.designPattern.tcpRefactoring;

public class Soldier {
    public void runContext(String weaponType) {
        System.out.println("전투 시작!");
        useWeapon(weaponType).getInfo();
        System.out.println("전투 끝...");
    }

    private Strategy useWeapon(final String weaponType) {
        return new Strategy() {
            @Override
            public void getInfo() {
                System.out.println(weaponType + "을 쓰자!");
            }
        };
    }
}
