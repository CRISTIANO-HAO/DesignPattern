package com.design.pattern.单例模式;

public class Emperor {
    // 饿汉式单例
    private static final Emperor emperor = new Emperor();

    private Emperor () {}

    public static Emperor getInstance () {
        return emperor;
    }

    //皇帝发话了
    public static void say(){
        System.out.println("我就是皇帝某某某....");
    }
}
