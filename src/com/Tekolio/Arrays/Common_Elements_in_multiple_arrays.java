package com.Tekolio.Arrays;

import java.util.Scanner;

public class Common_Elements_in_multiple_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i=0; i<n; i++) {
            A[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] B = new int[m];
        for(int i=0; i<m; i++) {
            B[i] = sc.nextInt();
        }

        int o = sc.nextInt();
        int[] C = new int[o];
        for(int i=0; i<o; i++) {
            C[i] = sc.nextInt();
        }
        int i=0; int j=0; int k=0;

        while (i<A.length && j< B.length && k< C.length) {
            if(A[i] == B[j] && B[j] == C[k]) {
                System.out.print( A[i] +" ");
                i++; j++; k++;
            }else if(A[i]>B[j]) {
                j++;
            }else if(B[j]>C[k]) {
                k++;
            }else{
                i++;
            }
        }
    }
}
