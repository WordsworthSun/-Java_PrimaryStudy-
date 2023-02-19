package com.study12.study05;

import java.sql.SQLOutput;

public class MathDemo {
    public static void main(String[] args) {
        System.out.println(Math.abs(-100));
        System.out.println("---------------");
        System.out.println(Math.ceil(13.57));
        System.out.println(Math.ceil(13.07));
        System.currentTimeMillis();
        System.out.println(System.currentTimeMillis()*1.0/1000/60/60/24/365);
        System.out.println("开始");
        //System.exit(0);//中止Java虚拟机
        System.out.println("结束");
        long m=System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            System.out.println(i);
        }
        long n=System.currentTimeMillis();
        System.out.println(n-m);


    }
}
