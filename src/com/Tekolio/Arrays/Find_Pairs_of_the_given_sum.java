package com.Tekolio.Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class Find_Pairs_of_the_given_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i=0; i<n; i++) {
            A[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        // method 1  - twin loop system - O(n^2)
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(A[i]+A[j] == sum) {
                    System.out.print(i +" "+ j);
                    System.out.println();
                }
            }
        }
        System.out.println();
        //Method 2 - Hashing
        HashMap<Integer, Integer> Map = new HashMap<>();
        for(int i=0; i<n; i++) {
            Map.put(A[i], i);
        }
        for(int i=0; i<n; i++) {
            int diff = sum - A[i];
            if (Map.containsKey(diff) && Map.get(diff) != i) {
                System.out.print(i + Map.get(diff) + " ");
            }
        }
    }
}
