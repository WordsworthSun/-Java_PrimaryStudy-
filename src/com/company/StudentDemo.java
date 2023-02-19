package com.company;
//学生测试类
public class StudentDemo {
    public static void main(String[] args) {
//        System.out.println(s.name+","+s.ago);
//        System.out.println("--------------检查对象s1-----------");
//        Student s1=new Student();
//        System.out.println("对象s1的地址："+s1);
//        System.out.println(s1.name+","+s1.ago);
//        s1.name="张曼玉";
//        s1.ago=21;
//        System.out.println("输出对象s1的值："+s1.name+","+"输出对象s1的值："+s1.ago);
//        System.out.println("---------------检查对象s2--------------");
//        Student s2=s1;
//        System.out.println("对象s2的地址："+s2);
//        System.out.println("输出对象s2的值："+s2.name+","+"输出对象s1的值："+s1.ago);
//        System.out.println("输出show（）");
//        s1.ago=18;
//        s1.show();
        Student s=new Student();
        System.out.println("对象s的地址"+s);
       // System.out.println(s.name+","+s.ago);
        s.name="林青霞";
        //s.setAge(-16);
        s.setAge(160);
        s.setAge(16);//若set方法里没有this.age=age返回0
        //s.ago=-23;
        s.show();

    }
}