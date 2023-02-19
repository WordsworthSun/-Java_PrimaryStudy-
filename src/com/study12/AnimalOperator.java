package com.study12;

public class AnimalOperator {
    public void useAnimal(Animal a){//Animal a=new Cat()
        a.eat();
    }
    public Animal getAnimal(){
        Animal a=new Cat();
        return a;
    }
}
