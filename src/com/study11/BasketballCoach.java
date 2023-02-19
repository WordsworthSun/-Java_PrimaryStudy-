package com.study11;

public class BasketballCoach extends Coach{
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("教练吃的和运动员差不多");
    }

    @Override
    public void teach() {
        System.out.println("指导如何打篮球");
    }
}
