package com.design.pattern.抽象工厂模式;

public class MaleYellowHuman extends AbstractYellowHuman {

    @Override
    public void getSex() {
        System.out.println("黄人男性");
    }
}
