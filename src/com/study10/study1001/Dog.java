package com.study10.study1001;

public class Dog extends Animal{
    public Dog(String  name, int age) {
        super(name, age);
    }

    public Dog() {
    }
    @Override
    public void eat() {
        System.out.println("小狗吃骨头");
    }

}
