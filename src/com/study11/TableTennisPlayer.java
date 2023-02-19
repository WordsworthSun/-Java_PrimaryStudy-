package com.study11;

public class TableTennisPlayer extends Athlete  implements English{

    public TableTennisPlayer() {
    }

    public TableTennisPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void spreskEnglish() {
        System.out.println("乒乓球运动员要说英语");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习如何打乒乓球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃运动员吃的");
    }
}
