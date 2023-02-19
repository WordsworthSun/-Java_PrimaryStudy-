package com.study13.study03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalendarDemo {
    public static void main(String[] args) {
//        Calendar c= Calendar.getInstance();

//        int year=c.get(Calendar.YEAR);
//        int month=c.get(Calendar.MONTH)+1;
//        int day=c.get(Calendar.DATE);
//        System.out.println(year+"年"+month+"月"+day+"日");
        Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat();
        String sd= sdf.format(d);
        System.out.println(sd);

        Scanner sc=new Scanner(System.in);
//        System.out.println("请输入某年前");
//        int s=sc.nextInt();
//        c.add(Calendar.YEAR,-s);
//        int year=c.get(Calendar.YEAR);
//        int month=c.get(Calendar.MONTH)+1;
//        int day=c.get(Calendar.DATE);
//        System.out.println(year+"年"+month+"月"+day+"日");
        System.out.println("请输入年份：");
        int y=sc.nextInt();
        Calendar c=Calendar.getInstance();
        c.set(y,2,1);//month+1=现在的月




    }
}
