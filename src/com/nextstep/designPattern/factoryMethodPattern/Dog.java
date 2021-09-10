package com.nextstep.designPattern.factoryMethodPattern;

public class Dog extends Animal {
    @Override
    public AnimalToy getToy() {
        return new DogToy();
    }
}
