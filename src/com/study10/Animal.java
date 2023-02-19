package com.study10;
/*
抽象类
 */
public abstract class Animal {
    private int age=20;
    private final String city="信阳";

    public void show(){
        age=50;
        System.out.println(age);
        System.out.println(city);
    }
    public abstract void eat();//抽象方法
    public void sleep(){
        System.out.println("睡觉");
    }
}
