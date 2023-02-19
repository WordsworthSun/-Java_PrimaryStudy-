package com.study02;

import java.util.Scanner;

public class StringDemo {
    /*
    字符串的比较方式
    1.==
    比较的是数据值是否相同
    比较的是地址值是否相同
    2.字符串是对象比较内容是否相同时使用equals（）

     */
    public static void main(String[] args) {
        String s="abcd";
        char[] chs1={'l','o','v','e'};
        char[] chs2={'e','v','o','l'};

        String s1=new String(chs1);
        String s2=new String(chs2);
        System.out.println("使用String s=new String(chs)创建字符串判断地址");
        System.out.println("输出s1："+s1);
        System.out.println("输出s2："+s2);
        System.out.print("判断s1和s2地址是否相同：");
        System.out.println(s1==s2 );
        System.out.print("判断s1和s2内容是否相同：");
        System.out.println(s1.equals(s2));
        System.out.println("使用String s=\"love\"创建字符串判断地址");
        String s4="love";
        String s5="love";
        System.out.println("输出s4："+s4);
        System.out.println("输出s5："+s5);
        System.out.print("判断s4和s5地址是否相同：");
        System.out.println(s4==s5);
        System.out.println("-------------------------------------------");

//        String username="2268106643";
//        String passward="Syu101202303";
//        Scanner sc=new Scanner(System.in);
//
//        for(int i=3;i>0;i--){
//
//            System.out.print("请输入用户名：");
//            String name=sc.nextLine();
//            System.out.print("请输入密码：");
//            String pwd=sc.nextLine();
//            if (name.equals(username)){
//
//                if (pwd.equals(passward)){
//                    System.out.println("登录成功!");
//                    break;
//
//                }else{
//                    System.out.println("密码输入有误");
//                }
//
//            }else {
//                System.out.println("用户名输入错误");
//            }
//            if(i-1==0){
//                System.out.println("您的账户被锁定，请与管理员联系！");
//            }else{
//                System.out.println("登录失败，你还有"+(i-1)+"次机会");
//            }

//}
//        Scanner sc=new Scanner(System.in);
//        System.out.println("请输入一个字符串：");
//        String line=sc.nextLine();
//        for(int i=0;i<line.length();i++){
//            System.out.println("您输入的字符串为："+line.charAt(i));
//
//        }
//        Scanner sc=new Scanner(System.in);
//        System.out.println("请输入一个字符串：   ");
//        String line = sc.nextLine();
//        int bigCount=0;
//        int smallCount=0;
//        int numberCount=0;
//        for(int i=0;i<line.length();i++){
//            char ch=line.charAt(i);
//            if(ch>='A'&&ch<='Z'){
//                bigCount++;
//            }else if(ch>='a'&&ch<='z'){
//                smallCount++;
//            }else if(ch>='0'&&ch<='9'){
//                numberCount++;
//            }
//
//        }
//        System.out.println("您输入的字符串中,"+"大写字母为"+bigCount+"小写字母为："+smallCount+"数字为："+numberCount);
//
        int [] arr={1,3,5,7};
        arrToString(arr);

    }

    public static void arrToString(int [] arr) {
        String s=" ";
        s+="[";
        for (int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                s+=arr[i];

            }else{
                s+=arr[i];
                s+=", ";

            }

        }
        s+="]";
        System.out.println(s);
    }







}
