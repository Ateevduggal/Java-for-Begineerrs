package com.Tekolio.Arrays;

import java.util.Scanner;

public class Count_Even_Odd {
    public static void main(String[] args) {
        /*
        * Taking a number from the user
        * initializing the necessary values as 0
        * checking if the number is > 0
        * to check if the number is even or odd, we have to check for its remainder.
        * If on dividing by 2, the remainder is 0, its even else its odd
        * but in this case, we have to check whether each digit is even or odd
        * for that we have to check the remainder of each digit whether its 0 or not
        * */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem = 0;
        int count_even = 0;
        int count_odd = 0;
       while (n>0) {//as n>0 this case will not for n=0 or for an edge case, if we do n>=0 then, loop will not work
           rem = n%10;
           if (rem%2 == 0) {
               count_even++;
           }else{
               count_odd++;
           }
           n /= 10;
       }
        System.out.print(count_even + " " + count_odd);
        System.out.println();
    /*
    * the other way is to first convert the number into string to get the length of it
    *  for applying for loop
    */
        String A = String.valueOf(n);
        for (int i=0; i<A.length(); i++) {
            if (A.charAt(i) % 2 == 0) {
                count_even++;
            }else {
                count_odd++;
            }
        }
        System.out.print(count_even + " " + count_odd);
    }
}
