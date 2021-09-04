package com.nextstep.polymorphism01;

public class Penguin extends Animal {
    public String habitat;

    // override
    public void showName() {
        System.out.println("오버라이드 됬어요~");
    }

    // overload
    public void showName(String yourName) {
        System.out.println("yourName = " + yourName);
        System.out.println("name = " + name);
    }

    public void showHabitat() {
        System.out.println("habitat = " + habitat);
    }
}
