package com.design.pattern.抽象工厂模式;

public class MaleWhiteHuman extends AbstractWhiteHuman {

    @Override
    public void getSex() {
        System.out.println("白人男性");
    }
}
