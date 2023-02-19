package com.study05.first;

public class Son extends Father{
//    @Override
    //子类不能重写父类的私有方法
//    private void show(){
//        System.out.println("Son中show方法被调用");
//    }
    //子类访问权限不能低于父类
    @Override
     public void method() {
        System.out.println("Son中method方法被调用");
    }



}
