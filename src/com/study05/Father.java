package com.study05;

public class Father {
    public int age=40;

    public void show(){
        System.out.println("Father中的show方法被调用");
    }

    public Father(){
        System.out.println("Father中无参构造方法被调用");
    }
    public Father(int age){
        System.out.println("Farther中带参构造方法被调用");
    }
}
