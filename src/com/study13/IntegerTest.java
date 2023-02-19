package com.study13;

import java.util.Arrays;

public class IntegerTest {
    public static void main(String[] args) {
        String s="91026089056041";
        String []strArray=s.split("0");
        for(int i=0;i< strArray.length;i++){
            System.out.println(strArray[i]);
        }
        int[] arr=new int[strArray.length];
        for(int i=0;i< arr.length;i++){
            arr[i]=Integer.parseInt(strArray[i]);
        }
        System.out.println("排序前:");
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("排序后：");
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i< arr.length;i++){

        }





    }
}
