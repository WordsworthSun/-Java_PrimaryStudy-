package com.study12.study02;

public class Outer {
    private int num=10;

    /*
    public class Inner{//成员内部类
        public void show(){
            System.out.println(num);
        }

    }

    */
    /*
   private class Inner{//成员内部类
        public void show(){
            System.out.println(num);
        }
    }
     */

    public void method(){
        class Inner{
            public void show(){
                System.out.println(num);
            }
        }
        Inner i=new Inner();
        i.show();
        //show()//error必须创建对象
    }


}
