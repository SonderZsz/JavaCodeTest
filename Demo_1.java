package com.bilibili.a;

public class Demo_1 {
//    break 在循环中的作用是 跳出一个循环或者结束一个循环
//    看到continue立即结束本次循环，继续执行下一次循环 
    public static void main(String[] args) {
//        for (int i = 1; i <= 9; i++) {
//            for (int k = 1; k <= i; k++) {
//                System.out.print(i + "*" + k + "=" + i*k +"  ");
//            }
//            System.out.println();
//        }

        for(int i=2;i<=1000 ;i++) {
            int j=2;
            while(i%j != 0 ) {
                j++;
            }
            if(j==i) {
                System.out.println("质数：i= "+i);
            }

        }
    }
}
