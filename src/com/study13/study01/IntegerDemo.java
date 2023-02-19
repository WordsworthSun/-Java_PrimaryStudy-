package com.study13.study01;

public class IntegerDemo {
    public static void main(String[] args) {

        Integer i=Integer.valueOf(1001); //装箱
        Integer i1=1001;//自动装箱

        i=i.intValue()+100;//拆箱
        i=i+100;//自动拆箱、
        System.out.println();

    }

}
