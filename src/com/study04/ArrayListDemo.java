package com.study04;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
//        ArrayList<String>array=new ArrayList<>();
//        Scanner sc=new Scanner(System.in);
//        System.out.println("请输入集合大小：");
//        int i=sc.nextInt();
//        System.out.println("请输入集合中数值：");
//        String s=" ";
//        for(int j=0;j<i;++j){
//          s=sc.nextLine();
//            array.add(s);
//        }
//        System.out.println(array);
//        ArrayList<Student> array=new ArrayList<>();
//        Student s1=new Student("喜羊羊",16);
//        Student s2=new Student("沸羊羊",16);
//        Student s3=new Student("美羊羊",15);
//        array.add(s1);
//        array.add(s2);
//        array.add(s3);
//        for(int i=0;i<array.size();i++){
//            //Student s=array.get(i);
//            //System.out.println(s.getName()+""+s.getAge());
//            System.out.println(array.get(i).getName()+","+array.get(i).getAge());
//
//        }
//        System.out.println("array:"+array);
//
        ArrayList<Student>array=new ArrayList<>();
        System.out.println("请输入学生个数：");
        Scanner sc=new Scanner(System.in);//输入数字型
        Scanner cs=new Scanner(System.in);//输入字符串型
        int i=sc.nextInt();
        for(int j=1;j<=i;j++){
            Student s1=new Student();
            System.out.println("请输入第"+j+"位学生的年龄：");
            int age=sc.nextInt();
            s1.setAge(age);
            System.out.println("请输入第"+j+"位学生的姓名：");
            String name=cs.nextLine();
            s1.setName(name);
            array.add(s1);
        }
        System.out.println("您输入的学生为：");
        for(int a=0;a<array.size();a++) {
            Student s = array.get(a);
            System.out.println(s.getName() + "，" + s.getAge());
        }

    }
}
