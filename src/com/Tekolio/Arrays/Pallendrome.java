package com.Tekolio;

import java.util.Scanner;

public class Pallendrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String A = "";
        String B = "";
        for (int i=0; i<word.length(); i++) {
            A = String.valueOf(word.charAt(i));
        }
        for (int i=word.length()-1; i>=0; i--) {
            B = String.valueOf(word.charAt(i));
        }
        if (A.equals(B)) {
            System.out.println("Word in pallendrome");
        }else{
            System.out.println("Word is not Pallendrome");
        }
    }
}
