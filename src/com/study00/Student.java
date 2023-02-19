package com.study00;

public class Student {
    private String name;
    private int age;
//get/set方法//////////////////////
    /*
    this关键字用于指代成员变量
    1.方法的形参如果与成员变量名同名，不带this修饰的变量指的是形参，而不是成员变量
    2.方法的形参没有与成员变量同名，不带this修饰的变量指的是成员变量
     */
    /*
    封装（继承，多态）
    1.将类的信息隐藏在类内部，不允许外部程序直接访问，
    而是通过该类提供的方法来实现对隐藏信息的操作和访问
    成员变量private，提供get/set方法
    2.如果没有定义构造方法，系统就会默认一个无参数构造方法
    3.如果定义了构造方法，系统将不再提供默认的构造方法
    4.如果自定义了带参数的构造方法，还要使用无参数的构造方法必须再写一个无参数构造方法
    5.要求：无论是否使用都写出无参数构造方法
    6.无参数构造使用set赋值
    7.使用带参方法直接创建带有属性值的对象
     */
     public Student(){
         /*
         无参构造方法，主要是完成对象数据初始化
          */
         System.out.println("无参数构造方法");
     }
     public Student(String name){
         /*
         有参数的构造方法
          */
         this.name=name;

     }
     public Student(int age){
         /*
         有参数的构造方法2
          */
         this.age=age;

     }
     public Student(String name,int age){
         this.age=age;
         this.name=name;

     }













    public String getName() {
        return name;//name指的是形参，this.name指的是实参
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void show(){
        System.out.println(name+","+age);
    }

}
