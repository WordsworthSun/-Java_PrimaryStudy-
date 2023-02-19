package com.study09;

public class Student01 {
    //静态成员变量
    private String name="林青霞";
    //非静态成员变量
    private static String university="商丘工学院";
    //非静态成员方法
    public void show1(){

    }
    //非静态成员方法，可以访问静态和非静态
    public void show2(){
//        System.out.println(name);
//        System.out.println(university);
//        show1();
//        show3();
    }
    //静态成员方法
    public static void show3(){

    }
    public static void show4(){
        //System.out.println(name);
        System.out.println(university);
        //show1();//静态只能访问静态的方法和变量
        show3();

    }

}
