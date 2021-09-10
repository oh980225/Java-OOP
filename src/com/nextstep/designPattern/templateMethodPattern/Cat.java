package com.nextstep.designPattern.templateMethodPattern;

public class Cat extends Animal {
    @Override
    public void eatFood() {
        System.out.println("Eat Fish!");
    }

    @Override
    public void sleep() {
        System.out.println("Cats sleep..Zzz...");
    }
}
