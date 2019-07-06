package com.design.pattern.代理模式.动态代理;

public class RealSubject implements Subject {
    //业务操作
    public void doSomething(String str) {
        System.out.println("do something!---->" + str);
    }

    @Override
    public void doOtherthing(String str) {
        System.out.println("do otherthing!---->" + str);
    }
}
