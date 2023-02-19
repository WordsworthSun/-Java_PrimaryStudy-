package com.study13.study01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        /*
        Date d=new Date();
        System.out.println(d);
        System.out.println("距1970年已有"+d.getTime()*1.0/1000/60/60/24/365+"年");
        Date d1=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat();
        String s=sdf.format(d);
        System.out.println(s);
         */
        Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年mm月dd日 hh：mm：ss");
        String s=sdf.format(d);
        System.out.println(s);
////////从String 到Date
        String ss="2048-08-09 11：22：33";
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd HH：mm：ss");
        Date  dd=sdf2.parse(ss);
        System.out.println(dd);




    }
}
