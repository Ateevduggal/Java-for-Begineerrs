package com.Tekolio;

import java.util.Arrays;
import java.util.Scanner;

public class kth_Smallest_largest {
    public static int[] kthSmallest(int[] arr, int k) {
        int a=0;
        int b=0;
        Arrays.sort(arr);
        int i=0;
        while(i<arr.length) {
            if(i == k-1) {
                a = arr[i];
            }
            i++;
        }
        int t = 0;
        for (int j=0; j<arr.length/2; j++) {
            t = arr[j];
            arr[j] = arr[arr.length-1-j];
            arr[arr.length-1-j] = t;
        }
        for(int j=0; j<arr.length; j++) {
            if(j == k-1) {
                b = arr[j];
            }
        }
        return new int[]{a,b};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] small = kthSmallest(arr, k);
        System.out.println(Arrays.toString(small));
    }
}
