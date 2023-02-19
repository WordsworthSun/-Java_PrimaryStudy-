package com.study10.study1003;
/*
接口中的成员变量默认被public final修饰
没有构造方法
 */
public interface Inter {
    public int num1=10;
    public final int num2=20;
    //public static final int num3=30;
    int num3=30;
    //public void show();
    public abstract void method();//抽象方法
    void show();


}
