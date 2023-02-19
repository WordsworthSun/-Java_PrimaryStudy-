package com.study12.study06;

public class ObjectDemo {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("美羊羊");
        s1.setAge(6);
        Student s2=new Student();
        s2.setName("美羊羊");
        s2.setAge(6);
        System.out.println(s1);
        System.out.println(s1.toString());
        System.out.println(s1==s2);//s1和s2代表的是地址值
        System.out.println(s1.equals(s2));
        /*
        public boolean equals(Object obj) {
            return (this == obj);
        }
         */

    }
}
