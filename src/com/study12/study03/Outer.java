package com.study12.study03;
/*
    前提：存在一个类或者接口
         可以是具体的类也可以是抽象类
    格式：
        new 类名或者接口名（）{
              重写方法；
        }
    本质：继承了该类或者实现了该接口的子类匿名对象
 */
public class Outer {
    public void method(){
        /*
        new Inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };//创建了一个对象
         */
        /*
        new Inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();
         */

        Inter i=new Inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };

        for(int j=5;j>0;j--){
            i.show();
        }

    }
}
