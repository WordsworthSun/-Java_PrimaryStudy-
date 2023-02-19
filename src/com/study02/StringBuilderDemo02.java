package com.study02;

public class StringBuilderDemo02 {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9};
        arrToString(arr);

    }
    public static void arrToString(int[] arr){
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                sb.append(arr[i]);

            }else{
                sb.append(arr[i]);
                sb.append(" ,");
            }
        }
        sb.append("]");
        System.out.println(sb);
    }
}
