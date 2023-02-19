package com.study02;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = sb.append("hello");
        System.out.println("sb：" + sb + "    sb.length()：" + sb.length());
        System.out.println("sb1：" + sb1 + "    sb1.length()：" + sb1.length());
        System.out.println(sb==sb1);
        sb.append(001).append(002).append(789).length();//链式编程
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

    }


}
