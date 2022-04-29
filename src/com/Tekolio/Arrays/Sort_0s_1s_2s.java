package com.Tekolio.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_0s_1s_2s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
        for(int i=0; i<n; i++) {
            if(a[i] == 0) {
                c0++;
            }
            if(a[i] == 1) {
                c1++;
            }
            if(a[i] == 2) {
                c2++;
            }
        }
        for(int i=0; i<c0; i++) {
            a[i] = 0;
        }
        for(int i=c0; i<c1+c0; i++) {
            a[i] = 1;
        }
        for(int i=c1+c0; i<n; i++) {
            a[i] = 2;
        }
        System.out.print(Arrays.toString(a));
    }
}
