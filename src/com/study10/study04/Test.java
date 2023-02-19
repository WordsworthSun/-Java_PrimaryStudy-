package com.study10.study04;
/*
测试类
 */
public class Test {
    public static void main(String[] args) {
        //创建对象调用方法
        Jumpping j=new Cat();
        j.jump();
        System.out.println("----------------");
        Animal a=new Cat();
        a.setName("汤姆");
        a.setAge(5);
        System.out.println(a.getName()+""+a.getAge());
        a.eat();
        //a.jump();//animal中没有jump所以没办法调用
        System.out.println("-----------------");
        a=new Cat("加菲",4);
        System.out.println(a.getName()+""+a.getAge());
        a.eat();
        System.out.println("------------------");
        Cat c=new Cat();
        c.setName("杰克");
        c.setAge(6);
        System.out.println(a.getName()+""+a.getAge());
        c.eat();
        c.jump();


    }

}
