package com.study09;

public class StaticDemo {
    public static void main(String[] args) {
        Student.university="商丘工学院";
        Student s=new Student();
        s.name="美羊羊";
        s.age=35;
        //s.university="商丘工学院";
        s.show();
        Student s1=new Student();
        s1.name="喜羊羊";
        s1.age=33;
        //s1.university="商丘工学院";

        s1.show();

    }
}
