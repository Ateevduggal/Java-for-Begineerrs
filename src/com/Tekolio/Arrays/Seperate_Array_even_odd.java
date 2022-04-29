package com.Tekolio.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Seperate_Array_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int l = 0;
        int r = n-1;
        int temp = 0;
        while(l<r) {
            if(A[l]%2 != 0) {
                A[l] *= -1;
                Arrays.sort(A);
                l++;
            }
            if(A[r]%2 == 0) {
                r--;
            }
            if(l<r) {
                temp = A[l];
                A[l] = A[r];
                A[r] = temp;
            }
        }
        System.out.print(Arrays.toString(A));
        System.out.println();
        for(int i=0; i<n; i++) {
            if(A[i] % 2 != 0) {
                A[i] *= -1;
            }
        }
        System.out.print(Arrays.toString(A));
    }
}
