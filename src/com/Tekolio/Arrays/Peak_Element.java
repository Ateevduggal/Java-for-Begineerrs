package com.Tekolio;

import java.util.Arrays;
import java.util.Scanner;

public class Peak_Element {
    /*
    * An element is called a peak element if its value is not smaller than the value of its adjacent elements
    * The generated output will always be 1 if the index that you return is correct. Otherwise output will be 0.
    * What if we face an array with the max number at the beginning or at the end and
    * the second largest in the middle with number smaller to it on either side, which will be taken as the
    * peak element
    * There can be multiple approaches like using Binary Search, sorting and printing the last element of the array
    * or printing the element with the maximum value of the array
    */
    public static int peakElementNa(int[] arr, int n) {// Na stands for Naive approach
        int index = 1;
       if(n == 1) {
           index = 0;
       }else{
           if(arr[0] > arr[1]) {
               index = 0;
           }
           for(int i=1; i<n-1; i++) {
               if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
                   index = i;
               }
           }
           if(arr[n-1]>arr[n-2]) {
               index = n-1;
           }
       }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int peak1 = peakElementNa(arr, n);
        System.out.println(peak1);

        int peak2 = peakElementBS(arr, n);
        System.out.println(peak2);

        int peak3 = peakElementMax(arr, n);
        System.out.println(peak3);
    }

    public static int peakElementBS(int[] arr, int n) { //BS stands for binary Search
        int b=0; int l = 0; int h = n-1;
       while(l<=h) {
           int m = (l+h)/2;
           // without m while loop will run infinitely as it will become the iterator of the while loop
           // m==0, m==n-1 & m>0 are all written so that we don't get out of bound error from the compiler
           if((m==0 || arr[m-1] <= arr[m]) && (m==n-1 || arr[m] >= arr[m+1])) {
               return m;
           }else if(m>0 && arr[m-1] > arr[m]) {
               h = m-1;
           }else{
               l=m+1;
           }
       }
       return -1;
    }

    public static int peakElementMax(int[] arr, int n) {
        int max = 0;
        for(int i=0; i<n; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        for(int i=0; i<n; i++) {
            if(max == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
