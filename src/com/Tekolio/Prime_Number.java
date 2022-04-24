package com.Tekolio;

import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        /*
        * Prime number is a number which can only be divided by 1 and itself
        * And 1 is not considered as prime. Prime numbers always starts from 2
        * we can loop from 1 as in this case there are no 1 to begin with thus we have considered it as 0 till number
        * This is only when we have to find if the given number is prime or not
        */
        if (n>1) {
            for (int i=1; i<=n; i++) {
                if(n%i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("Number is prime");
            }else {
                System.out.println("Number is not Prime");
            }
        }else{
            System.out.println("Please enter a Number grater than 1");
        }
        System.out.println();
        /*
        * We can just find the number of divisors which are on the lower side
        * On observing we found that we can also iterate till sqrt n, and we are good to go
        * or n = sqrt(n) * sqrt(n), thus we only have to iterate till sqrt(n)
        */
        if (n>1) {
            for (int i=1; i*i<=n; i++) {
                if(n%i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("Number is prime");
            }else {
                System.out.println("Number is not Prime");
            }
        }else{
            System.out.println("Please enter a Number grater than 1");
        }
        /*
        * Ifg we have to print all prime numbers up to a certain limit
        * for this we will use two loops system
        * two loops are required to check whether the number is prime or not by finding the modulo of the number
        * i represents the actual number while j is just finding the modulo
        */
        for (int i = 2; i <= n; i++) {
            int c = 0;
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    c++;
                }
            }

            if (c == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
