package com.algo;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args) {
        int[]a={2,7,11,15};
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入目标值");
        int target= sc.nextInt();
        int[]b=new int[2];
        b=twoSum(a,target);
        //b=twoSum01(a,target);
        System.out.print("[");
        for(int i=0;i<b.length;i++){
            if(i==b.length-1){
                System.out.print(b[i]);
            }else{
                System.out.print(b[i]+",");
            }
        }
        System.out.println("]");
    }


//使用哈希表解决
    public  static int[] twoSum(int[]nums,int target ){
        Map<Integer,Integer>map=new HashMap<>();
        for (int i=0;i< nums.length;i++){
            if(map.containsKey(target-nums[i])){
                //containsKey() 方法，检查 hashMap 中是否存在指定的 key 对应的映射关系
                //int []arr=new int[] {map.get(target-nums[i]),i};
                return  new  int[]{ map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);//map.put(key,value)
        }
        throw new IllegalArgumentException("No two sum soluton");
    }

//2.使用双指针法解决
        public static int[] twoSum01(int[] a,int target) {
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;++j){

                if(a[i]+a[j]==target){

                    return new int[]{i,j};
                }
            }
        }
        return new int [ 0];

}




}
