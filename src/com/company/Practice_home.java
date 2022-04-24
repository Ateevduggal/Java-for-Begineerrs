package com.company;
import java.util.Scanner;
public class Practice_home {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                                            //*
                                            //* *
                                            //* * *
                                            //* * * *
                                            //* * *
                                            //* *
                                            //*
//        int n = sc.nextInt();
//        for (int i=1; i<=n; i++) {
//            for (int j=1; j<=i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i=n-1; i>0; i--) {
//            for (int j=i; j>0; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
                                            //   *
                                            //  **
                                            // ***
                                            //****
                                            // ***
                                            //  **
                                            //   *
//        int n = sc.nextInt();
//        for (int i=1; i<=n; i++) {
//            for (int sp=n-i; sp>0; sp--) {
//                System.out.print(" ");
//            }
//            for (int j=1; j<=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int in=1; in<=n-1; in++) {
//            int sp = 0;
//            for (sp=0; sp<in; sp++) {
//                System.out.print(" ");
//            }
//            for (int j=n-sp; j>0; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
                //*****
                //A****
                //AA***
                //AAA**
                //AAAA*

//        int n = sc.nextInt();
//        int sp =0;
//        for (int i=1; i<=n; i++) {
//            for (sp=0; sp<=i-2; sp++) {
//                System.out.print("A");
//            }
//            for (int j=n-sp; j>0; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // EQ Triangle without space
//        int n = sc.nextInt();
//        for (int i=1; i<=n; i++) {
//            for (int sp=n-i; sp>0; sp--) {
//                System.out.print(" ");
//            }
//            for (int j=1; j<=i; j++) {
//                System.out.print("*");
//            }
//            for (int j=0; j<=i-2; j++) {
//                System.out.print("*");
//            }
//            for (int sp=n-i; sp>0; sp--) {
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
                // inverted EQ Triangle without space
//        int n = sc.nextInt();
//        int sp=0;
//        for (int i=1; i<=n; i++) {
//            for (sp = 0; sp <= i - 2; sp++) {
//                System.out.print("A");
//            }
//            for (int j = n - sp; j > 0; j--) {
//                System.out.print("*");
//            }
//            for (int j = n - sp - 1; j > 0; j--) {
//                System.out.print("*");
//            }
//            for (sp = 0; sp <= i - 2; sp++) {
//                System.out.print("A");
//            }
//            System.out.println();
//        }
        // Pyramid
//        int n=sc.nextInt();
//        for (int i=1; i<=n; i++) {
//            for (int sp=n-i; sp>0; sp--) {
//                System.out.print(" ");
//            }
//            for (int j=1; j<=i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        //Reverse Pyramid
//        int n = sc.nextInt();
//        int sp =0;
//        for (int i=1; i<=n; i++) {
//            for (sp=0; sp<=i-2; sp++) {
//                System.out.print(" ");
//            }
//            for (int j=n-sp; j>0; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
                // Hour Glass
//        int n = sc.nextInt();
//        int sp =0;
//        for (int i=1; i<=n; i++) {
//            for (sp=0; sp<=i-2; sp++) {
//                System.out.print(" ");
//            }
//            for (int j=n-sp; j>0; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i=1; i<=n; i++) {
//            for (sp=n-i-1; sp>0; sp--) {
//                System.out.print(" ");
//            }
//            for (int j=1; j<=i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        int n = sc.nextInt();
        int A = sc.nextInt();
        int[] B = new int[n];
        for (int i=0; i<n; i++) {
            B[i] = sc.nextInt();
        }
        int count = 0;
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if (B[i] + B[j] == A) {
                    count = 1;
                } else {
                    count = 0;
                }
            }
        }
        System.out.println(count);

    }
}