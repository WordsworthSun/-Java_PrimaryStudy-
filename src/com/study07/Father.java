package com.study07;

public class Father {
    private void show1(){
        System.out.println("private");
    }//只能在本类中被访问
    void show2(){
        System.out.println("默认");
    }//在同一包内可见，不使用任何修饰符。使用对象：类、接口、变量、方法。
    protected void show3(){
        System.out.println("protected");
    }//对同一包内的类和所有子类可见。使用对象：变量、方法。 注意：不能修饰类（外部类）。
    public void show4(){
        System.out.println("public");
    }//对所有类可见。使用对象：类、接口、变量、方法

    public static void main(String[] args) {
        Father f=new Father();
        f.show1();
        f.show2();
        f.show3();
        f.show4();
        Son s=new Son();
        s.show2();
        s.show3();
        s.show4();

    }


}
