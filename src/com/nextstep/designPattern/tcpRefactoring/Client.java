package com.nextstep.designPattern.tcpRefactoring;

public class Client {
    public static void main(String[] args) {
        Soldier rambo = new Soldier();

        rambo.runContext("주먹");

        System.out.println();

        rambo.runContext("검");

        System.out.println();

        rambo.runContext("총");
    }
}
