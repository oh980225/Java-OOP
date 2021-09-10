package com.nextstep.designPattern.templateMethodPattern;

public class Main {
    public static void main(String[] args) {
        Animal aCat = new Cat();
        Animal aDog = new Dog();

        aCat.liveLife();
        System.out.println();
        aDog.liveLife();
    }
}
