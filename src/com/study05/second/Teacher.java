package com.study05.second;

public class Teacher extends Human {
    public Teacher(){

    }
    public Teacher(String name ,int age){
        super(name,age);
    }
    public void teach(){
        System.out.println("点燃自我，照亮别人");
    }



}
