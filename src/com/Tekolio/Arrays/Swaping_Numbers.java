package com.Tekolio.Arrays;

import java.util.Scanner;

public class Swaping_Numbers {
    private static boolean aBoolean;

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       // with taking an additon number
       int c = 0;
       c = a;
       a = b;
       b = c;
        System.out.print(a + " " +b);
        // without taking an additional number
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.print(a + " " +b);
    }
}
