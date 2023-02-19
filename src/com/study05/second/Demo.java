package com.study05.second;

public class Demo {
    public static void main(String[] args) {
        Teacher t1=new Teacher();
        t1.setName("美羊羊");
        t1.setAge(19);
        System.out.println(t1.getName()+","+t1.getAge());
        t1.teach();

        Teacher t2=new Teacher("喜羊羊",15);

        System.out.println(t2.getName()+","+t2.getAge());
        t2.teach();

        Student s1=new Student();
        s1.setName("懒洋洋");





    }
}
