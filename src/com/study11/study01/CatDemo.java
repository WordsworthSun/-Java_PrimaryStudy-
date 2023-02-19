package com.study11.study01;

public class CatDemo {
    public static void main(String[] args) {
        CatOperator co=new CatOperator();
        Cat c=new Cat();
        co.useCat(c);
        Cat c2= co.getCat();//相当于new Cat()
        c2.eat();

    }
}
