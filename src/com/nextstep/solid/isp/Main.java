package com.nextstep.solid.isp;

public class Main {
    public static void main(String[] args) {
        BoyFriend theBoyFriend = new Man();
        Employee theEmployee = new Man();
        Son theSon = new Man();

        theBoyFriend.hug();
        theEmployee.goToWork();
        theSon.giveMassage();
    }
}
