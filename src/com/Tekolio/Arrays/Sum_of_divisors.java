package com.Tekolio.Arrays;

import java.util.Scanner;

public class Sum_of_divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0; t<T; t++) {
            int n = sc.nextInt();
            int sum = 0;
            for(int i=1; i<n; i++) {
                if(n%i == 0) {
                    sum = sum + i;
                }
            }
            if(sum == n) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            System.out.print(sum + " ");
        }
    }
}
