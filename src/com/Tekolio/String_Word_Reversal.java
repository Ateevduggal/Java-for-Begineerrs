package com.Tekolio;

import java.util.Scanner;

public class String_Word_Reversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String res = "";
        // Split the String based on space into multiple words and store it inside an array of characters
        String[] words = A.split(" ");
        // using the loop get each character from the array
        for (String i:words) {// For each loop for reading characters of the word
            String rew = ""; // to store the reversed word
            for (int j=i.length()-1; j>=0; j--) { // for loop for reversing the characters  of the word
                rew = (String)  rew + i.charAt(j);
            }
            res = (String) res + rew + " ";
        }
        System.out.print(res);
        System.out.println();

        // Using the String Builder
        for (String s: words) {
            StringBuilder sb = new StringBuilder(s);
            res = (String) res + sb.reverse() + " ";
        }
        System.out.print("A" + res);
        System.out.println();
    }
}
