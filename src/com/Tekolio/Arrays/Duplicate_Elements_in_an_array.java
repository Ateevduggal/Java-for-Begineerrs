package com.Tekolio.Arrays;

import java.util.Scanner;

public class Duplicate_Elements_in_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i=0; i<n; i++) A[i] = sc.nextInt();
        // method 1 - nested loop
        for(int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if (A[i] == A[j]) {
                    System.out.println(A[i]);
                }
            }
        }
    }
}
