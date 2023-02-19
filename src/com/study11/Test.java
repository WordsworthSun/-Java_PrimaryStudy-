package com.study11;
/*
测试类
 */
public class Test {
    public static void main(String[] args) {
        //创建对象
        TableTennisPlayer ttt=new TableTennisPlayer();
        ttt.setName("李林");
        ttt.setAge(26);
        System.out.println(ttt.getAge()+","+ttt.getName());
        ttt.eat();
        ttt.study();
        ttt.spreskEnglish();
        ttt=new TableTennisPlayer("汤家凤",21);
        System.out.println(ttt.getAge()+","+ttt.getName());
        ttt.eat();
        ttt.study();
        ttt.spreskEnglish();

    }
}
