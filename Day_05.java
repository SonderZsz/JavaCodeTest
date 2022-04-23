package com.bilibili.a;
/*
循环
1.初始化条件
2.循环条件
3.循环体
4.迭代条件
*/
public class Day_05 {
    public static void main(String[] args) {
//        1；
//        while(2) {
//            3；
//            4；
//        }
//
        int i = 1;
        while( i <= 100){
            if( i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }

        for (int j = 1; j <= 100 ; j++) {
            if(j % 2 == 0){
                System.out.println(j);
            }
        }

        int k =1;
        do {
            if(k%2 == 0){
                System.out.println(k);
            }
            k++;
        }while (k <= 100);

        }
}
