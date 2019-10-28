package com.huoli.son;

import com.huoli.father.Father;

public class Son extends Father {

    static {
        System.out.println("son!");
    }
    public Son() {
        System.out.println("son构造器!");
    }

    {
        System.out.println("son!!");
    }


}
