package com.study10.study1003;

public class InterfaceDemo {
    public static void main(String[] args) {
        Inter i=new InterImpl();
        //i.num1
        System.out.println(i.num1);
        System.out.println(Inter.num2);
    }
}
