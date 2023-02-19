package com.company;
//定义一个手机类，一类对象的行为和状态
//就像女孩是一个类，它包含了各种各样的女孩，但是她们有共同的属性，具体的某个女孩为这个类的对象

public class Phone {
    String brand;//手机的品牌
    int price;//手机的价格

    public void call() {
        System.out.println("打电话");
    }

    public void sendMessage() {
        System.out.println("发短信");
    }

}
