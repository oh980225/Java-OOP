package com.nextstep.designPattern.templateCallbackPattern;

import com.nextstep.designPattern.templateCallbackPattern.Soldier;

public class Client {
    public static void main(String[] args) {
        Soldier rambo = new Soldier();

        rambo.runContext(new Strategy() {
            @Override
            public void getInfo() {
                System.out.println("주먹으로 치자!");
            }
        });

        System.out.println();

        rambo.runContext(new Strategy() {
            @Override
            public void getInfo() {
                System.out.println("칼을 쓰자!");
            }
        });

        System.out.println();

        rambo.runContext(new Strategy() {
            @Override
            public void getInfo() {
                System.out.println("총을 쏘자!");
            }
        });
    }
}
