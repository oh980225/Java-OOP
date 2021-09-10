package com.nextstep.designPattern.templateMethodPattern;

public abstract class Animal {
    public void liveLife() {
        System.out.println("Wake up!");
        eatFood();
        sleep();
    }

    abstract void eatFood();

    void sleep() {
        System.out.println("Zzz...");
    }
}
