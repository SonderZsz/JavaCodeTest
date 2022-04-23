package com.bilibili.a;

public class MengYan extends Hero{
    String name = "my";

    public void chi(){
//        super 继承父类中的
//        System.out.println(super.name + " is eating.");
//        先找自己类，再找父类
        System.out.println(this.name + " is eating.");
    }
    public static void main(String[] args) {
        MengYan my = new MengYan();
        my.chi();
    }
}
