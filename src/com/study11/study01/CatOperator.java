package com.study11.study01;

public class CatOperator {
    public void useCat(Cat c){//Cat c=new Cat()
        System.out.println("使用Cat作为方法形参");
        c.eat();
    }
    public Cat getCat(){
        Cat c=new Cat();
        return c;
    }
}
