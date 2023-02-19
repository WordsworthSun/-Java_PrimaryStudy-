package com.study12.study04;

public class JumppinDemo {
    public static void main(String[] args) {
        JumppingOperator jo=new JumppingOperator();
        Jumpping j=new Cat();
        Jumpping j1=new Dog();
        jo.method(j1);
        jo.method(j);
        System.out.println("----------------");
        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("可以跳高");
            }
        });//匿名内部类


    }
}
