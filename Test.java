package com.bilibili.a;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Scanner的实例化
        Scanner scan = new Scanner(System.in);
        // 调用相关方法
//        System.out.println("请输入成绩：");
//        int num = scan.nextInt();
        int value = (int)(Math.random() * 90 + 10 );
//    随机数公式      [a,b]  (int)(Math.random()*(b-a+1)+a)
//        System.out.println(value);
        int count = 0;
        for (int i = 1; i <= 100; i++){
            if(i%2 == 0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
