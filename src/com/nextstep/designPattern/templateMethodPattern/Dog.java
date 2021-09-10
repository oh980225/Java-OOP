package com.nextstep.designPattern.templateMethodPattern;

public class Dog extends Animal {
    @Override
    public void eatFood() {
        System.out.println("Eat Meat!");
    }

    @Override
    public void sleep() {
        System.out.println("Dogs sleep..Zzz...");
    }
}
