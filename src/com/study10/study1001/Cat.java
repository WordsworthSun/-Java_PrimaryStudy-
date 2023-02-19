package com.study10.study1001;

public class Cat extends Animal{



    public Cat(String  name, int age) {
        super(name, age);
    }
    public Cat() {
    }

    @Override
    public void eat() {
        System.out.println("小猫吃鱼");
    }
}
