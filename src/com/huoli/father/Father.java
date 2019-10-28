package com.huoli.father;

public class Father {

    static {
        System.out.println("father!");
    }

    public Father() {
        System.out.println("father构造器!");
    }

    {
        System.out.println("father!!");
    }
}
