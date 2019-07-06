package com.design.pattern.抽象工厂模式;

public class MaleBlackHuman extends AbstractBlackHuman {

    @Override
    public void getSex() {
        System.out.println("黑人男性");
    }
}
