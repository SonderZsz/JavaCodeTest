package com.bilibili.a;

import java.util.Scanner;

public class Test_05 {
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int positiveNumber = 0;
        int negativeNmuber = 0;

        Scanner scan = new Scanner(System.in);

        while (true){
            int num = scan.nextInt();
            if(num>0){
                positiveNumber++;
            }else if(num<0) {
                negativeNmuber++;
            }else{
                break;
            }
        }

        System.out.println(positiveNumber);
        System.out.println(negativeNmuber);
    }
}
