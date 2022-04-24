package com.company;

import java.util.Scanner;

public class Practice_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // adding a new element in the array
//        // size of the original array
//        int n = sc.nextInt();
//        // original array
//        int[] arr = new int[n];
//        for (int i=0; i<arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        // position at which the new element will be inserted
//        int p = sc.nextInt();
//        // new element
//        int x = sc.nextInt();
//        // new array after the insertion of the new element
//        int[] new_arr = new int[n+1];
//
//        for (int i=0; i<new_arr.length; i++) {
//            if(i< p-1) {
//                new_arr[i] = arr[i];
//            } else if(i == p-1) {
//                new_arr[i] = x;
//            } else {
//                new_arr[i] = arr[i-1];
//            }
//            System.out.print(new_arr[i] + " ");
//        }
        // Removing an element from a specified position
    /*
        int n = sc.nextInt();
        // original array
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // position at which the new element will be inserted
        int p = sc.nextInt();
        // new array after the insertion of the new element
        int[] new_arr = new int[n-1];

        for (int i=0; i<new_arr.length; i++) {
            if(i< p-1) {
                new_arr[i] = arr[i];
            } else {
                new_arr[i] = arr[i+1];
            }
            System.out.print(new_arr[i] + " ");
        }
    */
        // max and min elements in an array
//         int n = sc.nextInt();
//         int[] a = new int[n];
//         int max = 0;
//         for (int i=0; i<a.length; i++) {
//             a[i] = sc.nextInt();
//         }
//         int min = a[0];
//         for (int i=1; i<a.length; i++) {
//             if (a[i] > max) {
//                 max = a[i];
//             }
//         }
//         for (int i=1; i<a.length; i++) {
//             if (a[i] < min) {
//                 min = a[i];
//             }
//         }
//        System.out.print(max + ", " + min);
        // sum of arrays
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        int sum = 0;
//        for (int i=0; i<a.length; i++) {
//            a[i] = sc.nextInt();
//        }
//        for (int i=0; i<a.length; i++) {
//            sum = sum+a[i];
//        }
//        System.out.print(sum);
        // copying array
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        for (int i=0; i<a.length; i++) {
//            a[i] = sc.nextInt();
//        }
//        int[] b = a.clone();
//
//        for (int i=0; i<b.length; i++) {
//            System.out.print(b[i] + " ");
//        }

        // printing all negative numbers of an array
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        for ( int i=0; i<n; i++) {
//            a[i] = sc.nextInt();
//        }
//        for (int i=0; i<a.length; i++) {
//            if (a[i]<0) {
//                System.out.print(a[i] + " ");
//            }
//        }
        //finding the difference between even number and odd numbers
//        int T = sc.nextInt();
//        for (int t=0; t<=T; t++){
//            int N = sc.nextInt();
//            int[] A = new int[N];
//            for(int i = 0;i < N; i++){
//                A[i] = sc.nextInt();
//            }
//
//            int cnte = 0;
//            int cnto = 0;
//
//            for (int i = 0; i < N;i++){
//
//                if(A[i] % 2 == 1){
//                    cnto++;
//                }
//                else{
//                    cnte++;
//                }
//            }
//
//            System.out.println(Math.abs(cnte - cnto));
//        }
        // find the given element in the array
//        int T = sc.nextInt();
//        for (int t=0; t<T; t++) {
//            int N = sc.nextInt();
//            int[] A = new int[N];
//            for (int i = 0; i < N; i++) {
//                A[i] = sc.nextInt();
//            }
//            int B = sc.nextInt();
//            int ans = 0;
//            for (int i=0; i<A.length; i++) {
//                if (A[i] == B) {
//                    ans = 1;
//                       break;
//                    } else {
//                        ans = 0;
//                    }
//                }
//            if (ans == 1) {
//                System.out.println("1");
//            }else {
//                System.out.println("0");
//            }
//        }
        // print ood and even integers of the array separately
//        int T = sc.nextInt();
//        for (int t=1; t<=T; t++) {
//            int N = sc.nextInt();
//            int[] a = new int[N];
//            for (int i = 0; i < a.length; i++) {
//                a[i] = sc.nextInt();
//            }
//            for (int i = 0; i < a.length; i++) {
//                if (a[i] % 2 == 1) {
//                    System.out.print(a[i] + " ");
//                }
//            }
//            System.out.println();
//            for (int i = 0; i < a.length; i++) {
//                if (a[i] % 2 == 0) {
//                    System.out.print(a[i] + " ");
//                }
//            }
//            System.out.println();
//        }
        // square of the array
//        int n = sc.nextInt();
//        int[] A = new int[n];
//        for (int i=0; i<A.length; i++) {
//            A[i] = sc.nextInt();
//        }
//        int[] B =new int[n];
//        for (int i=0; i<A.length; i++) {
//            B[i] = A[i]*A[i];
//            System.out.print(B[i] + " ");
//        }
        //find the unique element
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        for (int i=0;i<n;i++) {
//            a[i] = sc.nextInt();
//        }
//        int res = a[0];
//        for (int i=1; i<n;i++) {
//            res = res ^ a[i];
//        }
//        System.out.print(res);
        // find the given sum from the element given in the array
//        int n = sc.nextInt();
//        int A = sc.nextInt();
//        int[] B = new int[n];
//        for (int i=0; i<n; i++) {
//            B[i] = sc.nextInt();
//        }
//        int count = 0;
//        for (int i=0; i<n; i++) {
//            for (int j=i+1; j<n; j++) {
//                if (B[i] + B[j] == A) {
//                    count=1;
//                }
//            }
//        }
//        System.out.println(count);
    }
}