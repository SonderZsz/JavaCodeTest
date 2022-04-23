package com.bilibili.a;

public class Car {
    // 成员变量
    String color;
    String brand;
    int speed;
    int seat;
    // 属性👆

    // 动作：成员方法，不写static就是成员方法
    // 成员方法
    public void run(){
        System.out.println("com.bilibili.a.Car runs.");
    }

    public void stop(){
        System.out.println("com.bilibili.a.Car stops!");
        System.out.println("This car's color is " + this.color + ".");
    }

    // 构造方法，在创建对象的时候给对象设置属性信息👇
    // java默认给每一个类一个无参数的构造方法，但如果自己写了构造方法就不送了
    public Car(String color,int speed){
    // 设置属性信息，👇没有输出的值变null
        this.color = color;
        this .speed = speed;
    }
    // 构造方法的重载，参数个数不同
    public Car(String color,int speed,String brand){
        this(color,speed);// this还可以调用当前类其他的构造方法
        this.brand = brand;
    }
    public static void main(String[] args) {
    // int a = 10；写在方法里的变量，局部变量
    // 创建对象
    // int a = 10
        Car c1 = new Car("red",160);
        Car c2 = new Car("green",170);
        c1.stop();
        c2.stop();
    }
}
