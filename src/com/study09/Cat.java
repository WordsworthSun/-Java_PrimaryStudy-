package com.study09;

public class Cat extends Animal{
    public int age=5;
    public int weight=10;
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void playGame(){
        System.out.println("猫喜欢抓迷藏");

    }
}
