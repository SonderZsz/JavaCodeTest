package com.bilibili.a;

public abstract class Hero {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int k = 1; k <= 6 - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

//*****
//****
//***
//**
//*
        for (int i = 1; i < 6; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

//*
//**
//***
//****
//*****
        for (int i = 1; i < 6; i++) {
            for (int k = 1; k <= 4; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
//****
//****
//****
//****
//****
        for (float y = (float) 1.5; y > -1.5; y -= 0.1) {
            for (float x = (float) -1.5; x < 1.5; x += 0.05) {
                float a = x * x + y * y - 1;
                if ((a * a * a - x * x * y * y * y) <= 0.0) {
                    System.out.print("^");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}