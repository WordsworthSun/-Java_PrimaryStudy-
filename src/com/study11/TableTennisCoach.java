package com.study11;

public class TableTennisCoach extends Coach implements English {
    @Override
    public void teach() {
        System.out.println("指导学习乒乓球技巧");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃的和运动员差不多");
    }

    @Override
    public void spreskEnglish() {
        System.out.println("说英语");
    }
}
