package com.algo;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args) {
        /*
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数组大小：");
        int i=sc.nextInt();
        String s[]=new String[i];
        Scanner scs=new Scanner(System.in);
        System.out.println("请输入数组元素：");
        for(int j=0;j<s.length;j++){
            String st=scs.nextLine();
            s[j]=st;
        }
        System.out.println("您输入的数组为");
        System.out.print("{");
        for (int k=0;k<s.length;k++){
            if(k==s.length-1){
                System.out.print(s[k]);
            }else{
                System.out.print(s[k]+",");
            }
        }
        System.out.println("}");
        for (int x=0;x<s.length;x++){
            for(int y=x+1;y<s.length;y++){
                if(s[x]==s[y]){
                    System.out.println("false");
                }
            }

        }
        int arr=

         */
        /*
        int[] arr={12,15,16,12};
        for (int x=0;x<arr.length;x++){
            for(int y=x+1;y<arr.length;y++){
                if(arr[x]==arr[y]){
                    System.out.println("false");
                }
            }

         */
        int[] arr = {12, 15, 1, 3, 2};
        /*
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println("false");
            }
        }

         */
        for(int i=0;i< arr.length;i++){
            for( int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("true");
                }

            }

        }
        System.out.println("false");


    }
}









