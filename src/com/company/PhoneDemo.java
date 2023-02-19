package com.company;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone p=new Phone();
        p.sendMessage();
        p.call();
        System.out.println(p.price);
        System.out.println(p.brand);
        p.brand="苹果";
        p.price=6999;
        System.out.println(p.brand);
        System.out.println(p.price);
        p.call();

    }
}
