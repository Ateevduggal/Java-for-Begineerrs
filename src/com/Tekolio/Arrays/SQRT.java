package com.Tekolio;

import java.util.Scanner;

public class SQRT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        for(int i=1; i*i<=A; i++) {
            if(A/i == i) {
                System.out.println(i);
            }else{
                System.out.println("-1");
            }
        }
    }
}
