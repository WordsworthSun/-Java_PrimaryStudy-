package com.study10.study04;

public class Cat extends Animal implements Jumpping {

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void jump() {
        System.out.println("猫咪可以跳高");
    }

    @Override
    public void eat() {
        System.out.println("猫咪爱吃鱼");
    }
}
