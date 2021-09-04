package com.nextstep.solid.isp;

public class Man implements BoyFriend, Employee, Son{
    public void goToWork() {
        System.out.println("일하러!");
    }

    public void hug() {
        System.out.println("안아주기!");
    }

    public void giveMassage() {
        System.out.println("안마!");
    }
}
