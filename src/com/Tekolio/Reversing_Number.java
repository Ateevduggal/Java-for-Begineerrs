package com.Tekolio;

import java.util.Scanner;

public class Reversing_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        //using loop - O(n)
//        for (; n>0 ;) {
//            rev = n%10;
//            System.out.print(rev);
//            n /= 10;
//        }
        // using String Builder by converting it into string - O(1)
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        StringBuilder rsv = sb.reverse();
        System.out.print(rsv);


    }
}
