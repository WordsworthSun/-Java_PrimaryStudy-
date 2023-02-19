package com.study12.study01;

public class JumppingDemo {
    public static void main(String[] args) {
        JumppingOperator jo=new JumppingOperator();
        Jumpping j=new Cat();//使用了多态的形式创建了对象
        jo.useJumpping(j);
        Jumpping jo2=jo.getJumopping();
        jo2.jump();

    }
}
