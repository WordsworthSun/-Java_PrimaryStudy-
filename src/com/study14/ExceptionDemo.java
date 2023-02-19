package com.study14;

import java.io.File;

public class ExceptionDemo {
    public static void main(String[] args) {
        method();
    }
    public static void method(){

        int [] arr={1,3,5,7};
        System.out.println(arr[4]);//ArrayIndexOutOfBoundsException
//        for( int a:arr){
//
//            System.out.print(a);
//            System.out.print(",");
//        }


    }
}
