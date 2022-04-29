package com.Tekolio.Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Second_Smallest_number_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i=0; i<n; i++) {
            A[i] = sc.nextInt();
        }
        //Method 1
        // Sort the array and print the number on the first index
        Arrays.sort(A);
        System.out.println(A[1]);

        //Method 2
        //loop
        int min = A[0];
        int sec_min = A[1];
        for(int i=0; i<n; i++) {
            if(min > A[i]) {
                min = A[i];
            }
        }
        for(int i=0; i<n; i++) {
            if(A[i]>min && A[i]<sec_min) {
               sec_min = A[i];
           }
        }
        System.out.print(sec_min);
    }
}
