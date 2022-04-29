package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        float Math = sc.nextFloat();
//        float Sci = sc.nextFloat();
//        float Sst = sc.nextFloat();
//        float Eng = sc.nextFloat();
//        float Hin = sc.nextFloat();
//        float Percentage =((Math + Sci + Sst + Eng + Hin)/500)*100;
//        System.out.printf("the percentage of the boy is " + "%.2f\n ", Percentage);

//        System.out.println(sc.hasNextInt());
        // HCF or GCD of two numbers
//        int gcd = 0;
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        for (int i = 1; i<=a/2 && i<=b/2; i++) {
//            if(a%i == 0 && b%i == 0) {
//                gcd = i;
//            }
//        }
//        System.out.println(gcd);
        //is it perfect
//        int n = sc.nextInt();
//        int count = 0;
//            for (int i = 1; i<=n/2; i++) {
//                if (n%i == 0) {
//                    count++;
//                }
//            }
//        System.out.println(count);
        //is the number prime
//        int n = sc.nextInt();
//        int i=0;
//        int prime = 0;
//        for (i = 2; i <= n - 1; i++) {//prime number will always have two divisors
//            if (n % i == 0) {
//                prime = prime+1;
////                break;
//            }
//        }
////        if (i==n) {
//        if (prime == 0){
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
        // first n prime numbers
//        int n = sc.nextInt();
//        int i =0;
//        int cnt =0;
//        for (i=0; i<=n; i++) {
//            int prime = 0;
//            for (cnt=2; cnt<=i; cnt++) {
//                if (n%cnt==0) {
//                    prime = prime + 1;
//                }
//            }
//            if(prime == 2) {
//                System.out.println(i);
//            }
//        }
        // pattern
        // * staicase
//          int n = sc.nextInt();
//        for (int i=1; i<=n; i++) {
//            for (int count = 1; count<=i; count++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //Numeric staircase pattern
//                int n = sc.nextInt();
//        for (int i=1; i<=n; i++) {
//            for (int count = 1; count<=i; count++) {
//                if (count == i) {
//                    System.out.print(count);
//                } else {
//                    System.out.print(count + " ");
//                }
//            }
//            System.out.println();
//        }
        // character staircase
//        int n = sc.nextInt();
//        char a = 'A';
//        for (int i=1; i<=n; i++) {
//            for (int count = 1; count<=i; count ++) {
//                if (count==i) {
//                    System.out.print(a);
//                } else {
//                    System.out.print(a + " ");
//                }
//            }
//            System.out.println();
//            a++;
//        }
        // reverse pyramid pattern
//         int n = sc.nextInt();
//        for (int i=n; i>0; i--) {
//            for (int count = 1; count<=i; count++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        // Matrix Pattern
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        for (int i=1; i<=n; i++) {
//            for (int count = 1; count<=m; count++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        // inverted numeric pyramid
//        int n = sc.nextInt();
//        for (int i=n; i>0; i--) {
//            for (int count=1; count<=i; count++) {
//                if (count==i) {
//                    System.out.print(count);
//                } else {
//                    System.out.print(count + " ");
//                }
//            }
//            System.out.println();
//        }
        // find the last, first and sum of the digits
//        int n = sc.nextInt();
//        int l = n%10;
//        int f = 0;
//        int sum = 0;
//        while (n>0) {
//            f = n%10;
//            sum = sum + f;
//            n = n/10;
//        }
//        System.out.println(l + " " + f + " " + n + " "+ sum);
        // increasing number pattern
//        int n = sc.nextInt();
//        int i = 0;
//        int val = 1;
//        for (i=0; i<=n; i++) {
//            for (int j=0; j<=i; j++) {
//                System.out.print(val);
//                val=val+1;
//            }
//            System.out.println();
//        }
        // Two line star pattern
//        int n = sc.nextInt();
//        for( int i=1; i<=n; i++) {
//            for (int j=1; j<=n; j++) {
//               if (j==1 || j==n) {
//                   System.out.print("*");
//               } else {
//                   System.out.print(" ");
//               }
//            }
//            System.out.println();
//        }
        // photo frame
//        for (int i=1; i<=n; i++) {
//            System.out.print("*");
//        }
//        System.out.println();
//        for( int i=1; i<=n-2; i++) {
//            for (int j = 1; j <= n; j++) {
//                if (j == 1 || j == n) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        for (int i=1; i<=n; i++) {
//            System.out.print("*");
//        }
        //

        // double right angle triangle
//        for (int i=1; i<=n; i++) {
//            for (int j=1; j<=i; j++) {
//                System.out.print("*");
//            }
//            for (int sp=n-i; sp>0; sp--) {
//                System.out.print(" ");
//            }
//            for (int sp=n-i; sp>0; sp--) {
//                System.out.print(" ");
//            }
//            for (int j=1; j<=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        // Skip even numbers pyramid
//        for (int i=1; i<=n; i++) {
//            for (int j=1; j<=i; j++) {
//               if (j%2 == 0) {
//                   System.out.print("_");
//               }else {
//                   System.out.print("*");
//               }
//            }
//            System.out.println();
//        }
        // Number Pattern
//        int val = 1;
//        for (int i=1; i<=n; i++) {
//            for (int j=1; j<=i; j++) {
//                System.out.print("val");
//                    val = val + 1;
//            }
//            System.out.println();
//        }
        // Hollow inverted right triangle
//        for (int i=1; i<=n; i++) {
//                System.out.print("*");
//        }
//        System.out.println();
//        for (int j=1; j<=n-1; j++) {
//            for (int k=n-j; k>0; k--) {
//                if (k == 1 || k == n-j) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
        // numeric pyramid
//        int val=1;
//        int m=0;
//        for ( int i=1; i<=n; i++) {
//            for (int sp=n-i; sp>0; sp--) {
//                System.out.print("0 ");
//            }
//            for (int j=1; j<=val; j++) {
//                    if (j<=i) {
//                        m=m+1;
//                    } else {
//                        m=m-1;
//                    }
//                System.out.print(m + " ");
//            }
//            for (int sp=n-i; sp>0; sp--) {
//               if (sp==1) {
//                   System.out.print("0");
//               } else {
//                   System.out.print("0 ");
//               }
//            }
//            System.out.println();
//            val=val+2;
//        }
        // Binary to Decimal
//        long n = sc.nextLong();
//        long i =0;
//        long D = 0;
//        long N = 0;
//        while (n!=0) {
//            N=n%10;
//            n = n/10;
//            D += N*Math.pow(2,i);
//            i++;
//        }
//        System.out.println(D);

        // gcd and hcf - recursive approach
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c=0, d=0;
//        for (int i=1; i<=a; i++) {
//            if(a!=0) {
//                c = b%a;
//                d=a;
//            }
//            a=c;
//            b=d;
//        }
//        System.out.println(b);

        // LCM

        // binary to decimal
//        int n = sc.nextInt();
//        int i = 0;
//        int r = 0;
//        int sum = 0;
//        for ( i=0; i<=n; ) {
//            if (n!=0) {
//                r = n%10;
//                n = n/10;
//                i++;
//            }
//            System.out.println((2^i)*r);
        // Reverse a each letter of a word without disturbing the sequence of words
//        String a = sc.nextLine();
//        String[] arr = a.split(" ");
//        String revS = "";
//        for( String w:arr) {
//            String revW = "";
//            for (int i=w.length()-1; i>=0; i--) {
//                revW = (String)  revW + w.charAt(i);
//            }
//            revS = (String) revS +  revW + " ";
//        }
//        System.out.print(revS);
        // find the index of the given substring in the string
//        String a = sc.next();
//        String b = sc.next();
//        int i=0;
//        int j=0;
//        int count=0;
//        for (i=0; i<a.length(); i++) {
//            if (a.charAt(i+j) == b.charAt(j)) {
//                count = a.indexOf(b);
//            }
//        }
//        if(count>=0) {
//            System.out.println(count+1);
//        } else {
//            System.out.println(-1);
//        }
        // Program to find out the length of each word
//        int t = sc.nextInt();
//        for (int i=1; i<=t; i++) {
//            String s = sc.next();
//            System.out.println(s.length());
//        // youtube questions practice
//        float income = sc.nextFloat();
//        float tax = 0;
//        if(income <= 2.5) {
//            tax = 0;
//        }else if(income > 2.5 && income <=5.0) {
//            tax = (float) (0.05*(income-2.5));
//        }else if(income > 5.0 && income <=10.0) {
//            tax = (float) ((0.05*(income-2.5)) + (0.2*(income-5)));
//        }else {
//            tax = (float) ((0.05*(income-2.5)) + (0.2*(income-5)) + 0.3*(income-10));
//        }
//        System.out.println(tax);
//        leap year
//        int year = sc.nextInt();
//        if(year%4 == 0) {
//            System.out.println(year + " is a leap year");
//        }else{
//            System.out.println(year + " is not a leap year");
//        }
        //type of website
//        String str = sc.next();
//        if(str.endsWith(".com")) {
//            System.out.println("this is a commercial site");
//        }else if(str.endsWith(".org")) {
//            System.out.println("This is an organisational site");
//        }else if(str.endsWith(".in")) {
//            System.out.println("This is an Indian site");
//        }else{
//            System.out.println("Faltu Site");
//        }

    }
}