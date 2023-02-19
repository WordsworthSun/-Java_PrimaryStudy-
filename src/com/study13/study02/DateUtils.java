package com.study13.study02;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
工具类
构造方法私有
成员方法静态
*静态方法只能访问静态变量或者静态方法，不能访问成员属性或者成员方法
 */
public class DateUtils {
    private DateUtils(){}
    public static String dateToString (Date date, String format){
        SimpleDateFormat sdf=new SimpleDateFormat(format);
        String s=sdf.format(date);
        return s;
    }



}
