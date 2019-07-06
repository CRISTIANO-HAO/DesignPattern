package com.design.pattern.代理模式.动态代理;

public class BeforeAdvice implements IAdvice {
    public void exec(){
        System.out.println("我是前置通知，我被执行了！");
    }
}
