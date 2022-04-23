package com.bilibili.a;

public class Person {
    private String name;
    private int age;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //    public void setName(String name){
//        this.name = name;
//    }
//    public void setAge(int age){
//        if (age < 0){
//            age = 0;
//        }else{
//            this.age = age;
//        }
//    }
//
//    public int getAge() {
//        return this.age;
//    }
//
//    public String getName() {
//        return this.name;
//    }

    public void chi(){
        System.out.println(this.name+"is eating.");
    }

}
