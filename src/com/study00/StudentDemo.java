package com.study00;

public class StudentDemo {
    public static void main(String[] args) {
        //创建对象
        Student s1=new Student();
        s1.show();
        Student s2=new Student("煞笔");
        s2.show();
        Student s3=new Student(16);
        s3.show();
        Student s4=new Student("shabi",19);
        s4.show();






//        s.setName("坤哥");
//        s.setAge(26);
//        s.show();
//        System.out.println(s.getName()+"——"+s.getAge());
    }
}
