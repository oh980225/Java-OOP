package com.nextstep.designPattern.singletonPattern;

public class Singleton {
    private static Singleton singletonObj;

    private Singleton() {}

    public static Singleton getInstance() {
        if(singletonObj == null) {
            singletonObj = new Singleton();
        }
        return singletonObj;
    }
}
