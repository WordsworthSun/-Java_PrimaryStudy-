package com.study05;

public class Son extends Father{
    public int height=175;
    public int age=20;//成员变量

    public void method(){
        int age=30;
        System.out.println("Son中的method方法被调用");
//        System.out.println("访问方法内的变量"+age);
//        System.out.println("访问本类的成员变量"+this.age);//表示访问本类的成员变量
//        System.out.println("父类的成员变量"+super.age);//访问父类的成员变量
//        System.out.println(height);
    }
    public void show(){
        System.out.println("Son中的show方法被调用");
    }
    public Son(){
        super();
        System.out.println("son中无参数构造方法被调用");
    }
    public Son(int age){
        super();
        System.out.println("son中带参构造方法被调用");
    }


}
