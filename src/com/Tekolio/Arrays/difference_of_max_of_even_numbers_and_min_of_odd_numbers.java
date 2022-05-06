package com.Tekolio.Arrays;

import java.util.Arrays;

public class difference_of_max_of_even_numbers_and_min_of_odd_numbers {
    public static void main(String[] args) {
        int[] A = {24, 33, 13, 11, 30, 28, 19, 8, 30, 25, 42, 6, 30, 49, 3, 49, 24, 13, 3, 50 };
        int n = A.length;
        Arrays.sort(A);
        int max = 0;
        int min = 0;
        System.out.println(Arrays.toString(A));
        for(int i=n-1; i>=0; i--) {
            int max1 = A[i];
            if(max1%2 == 0) {
                max = max1;
                break;
            }
        }

        for(int i=0; i<n; i++) {
            int min1 = A[i];
               if(min1%2 == 1) {
                   min = min1;
                   break;
               }
           }
        System.out.println(max);
        System.out.println(min);
        System.out.println(max - min);
    }
}
