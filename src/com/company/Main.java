package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        多行注释你应该知道
         */
//        System.out.println("pathlitic");//输出
//        int a=10;
//        System.out.println(a);
//        a=20;
//        System.out.println(a );
//        char b='a';
//
//
//        int k=(int)88.88;
//        System.out.println(k);
//        int c=5;
//        System.out.println(a-c);
//        System.out.println(c-a);
//        System.out.println(b+a);//b代表的是‘a而a的ASC11码是97
//        System.out.println("傻逼"+"我是");
//        System.out.println(+66+6);
//        System.out.println("傻逼"+"我是"+66+6);
//        System.out.println(+66+6+"傻逼"+"我是");
       /*
        两个条件都为真时才为真
        &
        &&：如果左为真则右边执行，如果左为假则右边不执行直接返回结果
         */

//        System.out.println(false&false);//逻辑与,两边都为真才为真
//        System.out.println(true&true);//逻辑与,两边都为真才为真
//        System.out.println(true&false);//逻辑与,两边都为真才为真
//        System.out.println(true&&false);//逻辑与,两边都为真才为真,从左往右遇见假即为假
//        System.out.println("-----------------------------------------------------");

        /*
        有一个条件为真则为真，否则为假
        |：无论左边真假右边都要执行
        两边都为false结果为false，有一方为true结果为true，
        而且对两边都进行计算

        ||：短路或，如果左为假，右边执行，如果左为真，右边不执行

         */
//        System.out.println(false|false);//逻辑或,两边都为真才为真
//        System.out.println(true|true);//逻辑与,两边都为真才为真
//        System.out.println(true|false);//逻辑或,两边都为真才为真
//        System.out.println(true||false);//逻辑与,两边都为真才为真,从左往右遇见假即为假
//        System.out.println(false||false);//逻辑与,两边都为真才为真,从左往右遇见假即为假
//        System.out.println("-------------三元运算符-------------------------");
//        int a1=10;
//        int b1=20;
//        int c1=a1>b1?a1:b1;
//        System.out.println("c1="+c1);
//        int weight1=100;
//        int weight2=150;
//        boolean weight=(weight1==weight2)?true:false;
//        System.out.println((weight1==weight2)?true:false);
//        System.out.println(weight);
//        System.out.println("请输入t的值");
        //int t=sc.nextInt();
       // System.out.println(t);
//        System.out.println("请输入身高的值");
//        int height1=sc.nextInt();
//        int height2=sc.nextInt();
//        int height3=sc.nextInt();
//        int heightMax1=(height1>height2)?height1:height2;
//        int heightMax2=(heightMax1>height3)?heightMax1:height3;
//        System.out.println("输出最大"+heightMax2);
//        System.out.println("请输入一个整数");
//        int i=sc.nextInt();
//
//        if(i%2==0){
//            System.out.println("i为偶数"+i);
//        }else{
//            System.out.println("i为奇数"+i);
//        }
//        System.out.println("请输入1——7的一个整数：");
//        int week=sc.nextInt();
//        if (week == 1) {
//            System.out.println("周一");
//        }else if(week==2){
//            System.out.println("周二");
//        }else if(week==3){
//            System.out.println("周三");
//        }
//        System.out.println("-------------switch-------------------------");
//        switch (week){
//            case    1:
//                System.out.println("周一");
//                break;
//            case    2:
//                System.out.println("周二");
//                break;
//            case    3:
//                System.out.println("周三");
//                break;
//            case    4:
//                System.out.println("周四");
//                break;
//            case    5:
//                System.out.println("周五");
//                break;
//            default:
//                System.out.println("大于5");
//                break;
//        }
//        for(int f=0;f<=5;f++){
//            System.out.println("输出"+f);
//        }
//        int sum = 0;
//        for (int r=0;r<=10;r++){
//            sum+=r;
//        }
//        System.out.println(sum);
//           for(int i=1;i<=10;i++){
//               if(i%5==0){
//                   continue;
//                  // break;
//               }
//               System.out.println("输出i的值"+i);
//           }
//        Random ra=new Random();
//        int t= ra.nextInt(100);
//        System.out.println("输出一个随机数"+t);
      /*  System.out.println();*///ctrl+shift+/
//        System.out.println();//sout+回车
//        int arr[]=new int[5];
//        System.out.println(arr);
//        int arr2[]=new int[]{5,6,8,9};
//        int[] arr3={1,5,9,7,5,3};
//        int a=0;
//        for(int i=0;i<=5;i++){
//
//            System.out.println(arr3[i]);
//        }
//        System.out.println("请输入数组长度：");
//        a=sc.nextInt();
//        int[] arr4=new int[a];
//        System.out.println("请输入数组值：");
//        for (int i=0;i< arr4.length;i++){
//            arr4[i]=sc.nextInt();
//        }
//        System.out.println("您定义的数组为：");
//        System.out.print("[");
//        for(int i=0;i<arr4.length;i++){
//            if(i==arr4.length-1){
//                System.out.print(arr4[i]);
//            }else{
//                System.out.print(arr4[i]+",");
//            }
//        }
//        System.out.println("]");
//        arrMax(arr4);
//        arrSum(arr4);
        Scanner sc=new Scanner(System.in);
        int[]arr6={1,2,3,4};
        int[]arr7={1,2,3,5};
        arrCompare(arr6,arr7);
        arrSearch(arr6);
        arrReverse(arr6);
//       long i=2;
//        while(true){
//
//
//            i=i*i;
//            i++;
//            System.out.println(i);
//        }
        //Phone iphone=new Phone();
        //Solution1 s=new Solution1();


    }
    ///////////////////////////////////////////////////////////////////////////////////////////////

    //数组逆转，空间大小为o(n)
    public static void arrReverse(int[]a) {
        int temp;
        for(int start=0, end=a.length-1;start<=end;start++,end--){
            temp=a[start];
            a[start]=a[end];
            a[end]= temp;
        }
        System.out.println("反转的数组为：");
        System.out.print("[");
        for(int i=0;i<a.length;i++){
            if(i==a.length-1){
               System.out.print(a[i]);
            }else{
                System.out.print(a[i]+",");
            }
        }
        System.out.println("]");
    }



    //查找数组中值
    public static void arrSearch(int[]a) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入查找的数值");
        boolean tag=true;
        int i=sc.nextInt();
        int index=-1;
        for (int j=0;j<a.length;j++){
            if(a[j]==i){
                index=j;
                tag=false;
            }
        }
        if (tag){
            System.out.println("查找的数字不存在");
        }else {
            System.out.println("查找的数字索引为："+index);
        }
    }



    //比较数组是否相同
    public static void arrCompare(int[]a,int[]b) {
        boolean tag=true;
        if(a.length!=b.length){
            tag=false;
            //return false;
        }else{
            for(int i=0;i<a.length;i++){
                    if(a[i]!=b[i]){
                        tag=false;
                        //return false;
                    }
            }
        }
        if(tag){
            System.out.println("数组相同");
        }else {
            System.out.println("数组不相同");
        }
        //return true;
    }




    //数组加和
    public static void arrSum(int []arr) {
        int sum=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2==0&&arr[i]/10%7!=0&&arr[i]%7!=0){
                sum+=arr[i];
            }
            /*if(arr[i]%2==0){
                if(arr[i]/10%7!=0){
                    if(arr[i]%7!=0){
                        sum+=arr[i];
                    }
                }
            }*/
        }
        System.out.println("求和值为："+sum);
    }




    //查找数组中最大值
    public static void arrMax(int[]arr) {
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[0]>arr[i]){
                max=arr[0];
            }else{
                max=arr[i];
            }
        }
        System.out.println("数组中最大值为："+max);
    }



}
