package com.Tekolio;

import java.util.Arrays;
import java.util.Scanner;

public class Subarray_of_the_given_sum {
    public static int[] subarraySum1(int[] arr, int n, int s) {// Brute force - O(n^2)
        int sum = 0;
        int i = 0;
        int j = 0;
        int[] son = {i, j};
        for (i = 0; i < n; i++) {
            sum = arr[i];
            for (j = i + 1; j < n; j++) {
                if (sum < s) {
                    sum += arr[j];
                } else if (sum == s) {
                    son = new int[]{i + 1, j};
                } else {
                    break;
                }
            }
        }
        return son;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] sum1 = subarraySum1(arr, n, s);
        System.out.print(Arrays.toString(sum1));

        int[] sum2 = subarraySum2(arr, n, s);
        System.out.print(Arrays.toString(sum2));
    }

    public static int[] subarraySum2(int[] arr, int n, int s) {//
        int i = 0; int j=0;
        int[] son = {i, j};
        return son;
    }
}