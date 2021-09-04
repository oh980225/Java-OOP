package com.nextstep.finalVariable;

public class Cat {
    final static int stf1 = 1;
    final static int stf2;
    final int st1 = 1;
    final int st2;

    static {
        stf2 = 2;
        System.out.println("static!");
    }

//    public static void init() { 이건 불가! -> 정적 생성자나 static 블록 내부에서만 가능! -> 확정적으로 초기화 되어야 하기 때문!
//        stf2 = 2;
//    }

    {
        System.out.println("instance!");
    }

    Cat() {
        st2 = 2;
        final int v1 = 1;
        final int v2;
        v2= 3;
        System.out.println("new!");
    }
}
