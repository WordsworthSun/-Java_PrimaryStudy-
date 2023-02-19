package com.study11;

public class BasketballPlayer extends Athlete {
    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃运动员吃的");
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学习打篮球");
    }
}
