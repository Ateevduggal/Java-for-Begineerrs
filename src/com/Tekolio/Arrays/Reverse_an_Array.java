package com.Tekolio;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_an_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i=0; i<n; i++) {
            A[i] = sc.nextInt();
        }
        // simple without any other array
//        for (int j=n-1; j>=0; j--) {
//            System.out.print("B " + A[j] + " ");
//        }
        System.out.println();
        //using another array to store values
//        int[] a = new int[n];
//        int k = n-1;
//        for (int j=0; j<n; j++) {
//            a[j] = A[k-j];
//        }
//        System.out.print("A" + Arrays.toString(a));
//        System.out.println();
        //swapping method
        int i, k, t;
        for (i = 0; i < n / 2; i++) {
            t = A[i];
            A[i] = A[n - i - 1];
            A[n - i - 1] = t;
        }
        System.out.print(Arrays.toString(A));
        // printing the reversed array
       //Using String Builder
//        int[] Arr = new int[n];
//        for (int i=0; i<n; i++) {
//            Arr[i] = sc.nextInt();
//        }
//        StringBuilder sb = new StringBuilder(Arrays.toString(Arr));
//        StringBuilder B = sb.reverse();
//        System.out.print(B);
    }
}
