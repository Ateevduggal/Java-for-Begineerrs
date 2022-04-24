package com.Tekolio;

import java.util.Scanner;

public class Sum_of_divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Optimised way
        int sum = 0;
        for(int i=1; i*i<=n; i++) {
            if(n%i == 0) {
                if(i*i == n) {
                    sum += i;
                }else{
                    sum += i + (n/i);
                }
            }
        }
        System.out.print(sum + " ");
    }
}
