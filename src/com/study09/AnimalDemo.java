package com.study09;

public class AnimalDemo {
    public static void main(String[] args) {
//        //父类引用指向子类对象
//        Animal a1=new Cat();
//        a1.eat();
//         //多态时访问，成员变量，编译看左，运行看左
//        //成员方法，编译看左，执行看右
//        //成员方法有重写，而成员变量没有
//        System.out.println(a1.age);
//
//        Animal a2=new Animal();
//        a2.eat();
//        AnimalOperator a1=new AnimalOperator();
//        Cat c=new Cat();
//        a1.useAnimal(c);
//
//        Dog d=new Dog();
//        a1.useAnimal(d);
//
//        Pig p=new Pig();
//        a1.useAnimal(p);
/*
向上转型
    从子到父
向下转型
    从父到子
 */
        Animal a=new Cat();
        a.eat();
        // a.playGame();父类中没有对应的方法所以没办法使用
        //向下转型
        Cat c=(Cat)a;
        c.eat();
        c.playGame();
        //向上转型


    }
}
