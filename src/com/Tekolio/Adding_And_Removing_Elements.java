package com.Tekolio;

import java.util.Arrays;
import java.util.Scanner;

public class Adding_And_Removing_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i=0; i<n; i++) {
            A[i] = sc.nextInt();
        }
        int[] B = new int[n+1];
        int[] C = new int[n-1];
        int p = sc.nextInt();
        int x=0;
        for(int i=0; i<n; i++) {
            if(i < p) {
                C[i] = A[i];
            }else {
                C[i-1] = A[i];
            }
        }
        System.out.print(Arrays.toString(C));
        System.out.println();
        for(int i=0; i<n+1; i++) {
            if(i<p) {
                B[i] = A[i];
            }else if(i == p) {
                B[i] = x;
            }else{
                B[i] = A[i-1];
            }
        }
        System.out.print(Arrays.toString(B));
    }
}
