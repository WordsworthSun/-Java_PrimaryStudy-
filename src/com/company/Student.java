package com.company;

import java.security.cert.CertPathValidatorSpi;

public class Student {
    /*
    private是权限修饰符
    可以修饰成员（成员变量和成员方法）
    作用是保护成员不被别的类使用，被private修饰后只能在本类中才能被访问
    对于被private修饰的成员变量，如果需要被其他类使用需要提供相应的操作
    1.get方法获取成员变量值，方法用public修饰
    2.set方法用于设置成员变量值，用public修饰
    比如age用private更适合因为年龄值不能为负

     */

    String name;//成员变量，类中方法外的变量，存放在堆内存，随对象的存在而存在
    //int ago;//有默认的初始化值
    private int age;//此时StudentDemo已不能使用age
    //别的类需要使用get/set方法来访问age


    public void setAge(int age) {
        //set设置值，传递一个值为a
        //age=a;
        if(age<0){
            System.out.println("年龄不可为负值");
        }else if(age>120){
            System.out.println("年龄超出最大值");
        }else{
            this.age=age;
        }
    }

    public int getAge(){
        //返回一个值

        return age;

    }

    public void study() {
        int i=0;//局部变量，方法内或者方法声明上，存放在栈内存，随方法的存在而存在
        System.out.println("好好学习，天天向上");
    }

    public void doHomework() {
        System.out.println("键盘敲烂，月薪过万");
        int j=0;//必须先定义
    }
////////////封装
    public void show() {
        System.out.println(name+","+age);
    }
}
