package com.study09;

public class Student {
    public String name;
    public int age;
    public static String university;//static被所有成员变量共享,可以直接通过类名访问
    public void show(){
        System.out.println(name+","+age+","+university);
    }

}
