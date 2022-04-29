package com.Tekolio.Arrays;

import java.util.Scanner;

public class Max_and_min_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i=0; i<n; i++) {
            A[i] = sc.nextInt();
        }

        /*
         * Using single loop

         * For maximum element take a number and initialize it as zero
         * Inside the for loop use an if condition to find the max element which updated that number
         * Equal to the max number
         * Follow the same procedure for the min element as well but initialize the number as the
         * number on the 0th index of the array
         */
        int max = 0;
        int min = A[0];
        for(int i=0; i<n; i++) {
            if (max < A[i]) {
                max = A[i];
            }
            if (min > A[i]) {
                min = A[i];
            }
        }
        System.out.println(max + " " + min);
    }
}
