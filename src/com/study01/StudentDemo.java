package com.study01;

import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        //使用无参数构造方法创建对象后使用set赋值
//        Student s1=new Student();
//        s1.setName("二黑");
//        s1.setAge(19);
//        s1.show();
//        Student s2=new Student("二哈",18);
//        s2.show();
//        Scanner sc=new Scanner(System.in);
        //String line=sc.nextLine();
//        String s = sc.nextLine();//ctrl+alt+v
//        System.out.println("您输入的字符为："+s);
//        char[] ch={'a','b','c'};
//        String s2=new String(ch);
//        System.out.println("输出s2："+s2);
        byte[] by={97,98,99};
        String s3=new String(by);
        System.out.println("输出s3："+s3);
        char[] chs={'l','o','v','e'};
        String s1=new String(chs);
        String s2=new String(chs);
        System.out.println("使用String s=new String(chs)创建字符串判断地址");
        System.out.println("输出s1："+s1);
        System.out.println("输出s2："+s2);
        System.out.print("判断s1和s2地址是否相同：");
        System.out.println(s1==s2 );
        System.out.println("使用String s=\"love\"创建字符串判断地址");
        String s4="love";
        String s5="love";
        System.out.println("输出s4："+s4);
        System.out.println("输出s5："+s5);
        System.out.print("判断s4和s5地址是否相同：");
        System.out.println(s4==s5);



    }
}
