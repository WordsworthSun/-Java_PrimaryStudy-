package com.study12;

public class AnimalDemo {
    public static void main(String[] args) {
        AnimalOperator ao=new AnimalOperator();
        Animal a=new Cat();
        ao.useAnimal(a);
        //ao.eat();
        Animal a2= ao.getAnimal();
        a2.eat();

    }
}
