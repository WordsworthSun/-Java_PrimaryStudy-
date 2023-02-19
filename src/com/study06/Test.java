package com.study06;
import com.study05.Phone;
public class Test {
    public static void main(String[] args) {
        Cat c1=new Cat();
        c1.setName("加菲猫");
        c1.setAge(5);
        c1.catchMouse();
        System.out.println(c1.getName()+","+c1.getAge());

        Cat c2=new Cat("汤姆",4);
        System.out.println(c2.getName()+","+c2.getAge());
        Phone p1=new Phone();
        p1.call("li");


    }
}
