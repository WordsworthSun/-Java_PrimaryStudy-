package com.study10.study04;

public class Dog extends Animal implements Jumpping {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("小狗吃骨头");
    }

    @Override
    public void jump() {
        System.out.println("小狗可以跳");
    }
}
