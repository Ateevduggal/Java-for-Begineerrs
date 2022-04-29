package com.Tekolio;

import java.util.Arrays;
import java.util.Scanner;

public class Seperate_positive_and_negative_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // negative at beginning and positive at the end
        int j=0;
        for(int i=0; i<n; i++) {
           if(arr[i]<0) {
               if(i !=j) {
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }
               j++;
           }
        }
        System.out.println(Arrays.toString(arr));
        // +ve first and -ve last
        int[] A = new int[n];
        int k =0;
        for(int i=0; i<n; i++) {
            if (arr[i] > 0) {
                A[k] = arr[i];
                k++;
            }
        }

        for(int i=0; i<n; i++) {
            if (arr[i] < 0) {
                A[k] = arr[i];
                k++;
            }
        }
        System.out.print(Arrays.toString(A));
    }
}
