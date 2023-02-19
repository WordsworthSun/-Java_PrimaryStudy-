package com.study07;

public class Son extends Father {
    public static void main(String[] args) {
        Father f1=new Father();
        f1.show2();
        f1.show3();
        f1.show4();
        Son s=new Son();
        s.show2();
        s.show3();
        s.show4();
        //不可访问show1--private


    }
}
