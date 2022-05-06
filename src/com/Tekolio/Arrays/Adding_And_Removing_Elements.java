package com.Tekolio.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.System;

public class Adding_And_Removing_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i=0; i<n; i++) {
            A[i] = sc.nextInt();
        }
        int p =2 ;
        int x=90;
        // by creating a new array B and C of n+1 and n-1 sizes
        int[] B = new int[n+1];
        int[] C = new int[n-1];
        for(int i=0; i<n; i++) {
            if(i < p) {
                C[i] = A[i];
            }else {
                C[i-1] = A[i];
            }
        }
        for(int i=0; i<n+1; i++) {
            if(i<p) {
                B[i] = A[i];
            }else if(i == p) {
                B[i] = x;
            }else{
                B[i] = A[i-1];
            }
        }
        System.out.print("Final Array : " + Arrays.toString(B));
        System.out.println();
        System.out.print("Final Array : " + Arrays.toString(C));
        System.out.println();

        // using System.arraycopy
        int[] D = new int[n-1];
        int[] E = new int[n+1];
        System.arraycopy(A, 0, D, 0, p);
        System.arraycopy(A, p+1, D, p, n-p-1);
        System.out.print(Arrays.toString(D));
        System.out.println();

        System.arraycopy(A, 0, E, 0, p);
        System.arraycopy(A, p, E, p+1, n-p);
        E[p] = x;
        System.out.print(Arrays.toString(E));
        System.out.println();
        // Using Arraylist
        //add
        System.out.println("Original Array : " + Arrays.toString(A));
        ArrayList<Integer> F = new ArrayList<>();
        for(int i=0; i<n; i++) {
            F.add(A[i]);
        }
        F.add(p, x);
        System.out.println();
        int[] G = F.stream().mapToInt(i->i).toArray();
        System.out.print("Final Array : " + Arrays.toString(G));

        //remove
        ArrayList<Integer> H = new ArrayList<>();
        for(int i:A) {
            H.add(i);
        }
        H.remove(p);
        System.out.println();
        int[] I = H.stream().mapToInt(i->i).toArray();
        System.out.print("Final Array : " + Arrays.toString(I));
        // remove

    }
}
