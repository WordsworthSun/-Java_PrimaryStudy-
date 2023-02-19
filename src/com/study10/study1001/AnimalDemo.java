package com.study10.study1001;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a=new Cat();
        a.setName("汤姆");
        a.setAge(4);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        a=new Cat("加菲",5);
        System.out.println(a.getName()+","+a.getAge());
    }

}
