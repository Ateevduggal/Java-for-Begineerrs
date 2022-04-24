package com.Tekolio;

import java.util.Scanner;

public class Missing_Number_in_Array {
    public static void main(String[] args) {
        /*
        * there are three conditions for this case to be true
        * array should not have two digits numbers
        * digits of the array should have a pattern to predict
        * it is not compulsory for the array to be in sorted order
        * Suppose A = {1,2,4,5}, no 3 is missing from it. It was obviuos as we know the pattern
        * and thats ehy we have to find the pattern in given array
        */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n-1];
        int[] B = new int[n];
        for(int i=0; i<n-1; i++) {
            A[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++) {
            B[i] = sc.nextInt();
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int s=0; s<A.length; s++) {
            sum1 = sum1+A[s];
        }
        for (int g=0; g<B.length; g++) {
            sum2 = sum2+B[g];
        }
        System.out.println(sum2 - sum1);
    }
}
