package com.nextstep.designPattern.factoryMethodPattern;

public class Main {
    public static void main(String[] args) {
        Animal aDog = new Dog();
        Animal aCat = new Cat();

        AnimalToy aDogToy = aDog.getToy();
        AnimalToy aCatToy = aCat.getToy();

        aDogToy.getInfo();
        aCatToy.getInfo();
    }
}
