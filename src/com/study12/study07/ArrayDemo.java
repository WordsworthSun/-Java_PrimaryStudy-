package com.study12.study07;
import java.util.Arrays;
/*
Arrays类包含用于操作数组的各种方法

 */
public class ArrayDemo {
    public static void main(String[] args) {
        long n=System.currentTimeMillis();
        int[] arr={25,15,98,14,100,36};
        System.out.println("排序前："+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序后："+Arrays.toString(arr));
        /*
        int 和String相互转换
         */
        //int————》String
        int num=100;
        String s1=""+num;//1
        System.out.println(s1);
        String s2=String.valueOf(num);//2
        System.out.println(s2);
        //String-------》int
        String s3="100";
        Integer i=Integer.valueOf(s3);
        System.out.println(i);






        long m=System.currentTimeMillis();
        System.out.println("此次运行共用"+(m-n)+"毫秒");
    }
}
