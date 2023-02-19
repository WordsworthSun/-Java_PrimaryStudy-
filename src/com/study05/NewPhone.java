package com.study05;

public class NewPhone extends Phone {
    @Override//方法重写
    public void call(String name){
        System.out.println("开启视频");
        //System.out.println("给"+name+"打电话");
        super.call(name);//将值传递给父类，使用父类的call方法
    }



}
