package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Practice_Functions {
//    public static int gcd(int a, int b) {
//        int gcd = 0;
//        for (int i = 1; i<=a; i++) {
//            if(a%i == 0 && b%i == 0) {
//                gcd = i;
//            }
//        }
//        return gcd;
//    }
//
//    public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int hcf = gcd(a,b);
//        System.out.println(hcf);
//	}
//public static int solve(int A) {
//    double pi = Math.PI;
//    double area = (4*pi*A*A*A/3);
//    System.out.println(Math.round(Math.ceil(area)));
//    return (int) area;
//}
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int A = sc.nextInt();
//        solve(A);
//    }

//    public static int solve(int A) {
//        int sum = 0;
//        int i = 2;
//        while (i<=A) {
//            sum = sum+i;
//            i = i+2;
//        }
//        return sum;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int A = sc.nextInt();
//        int s = solve(A);
//        System.out.println(s);
//    }

    //    public static int vovel(char c) {
//        if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
//            System.out.println("1");
//            return 1;
//        } else {
//            System.out.println("0");
//            return 0;
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        char c = sc.next().charAt(0);
//        vovel(c);
//    }
//    public static int[] square(int[] A) {
//        int[] B =new int[A.length];
//        for (int i=0; i<A.length; i++) {
//            B[i] = A[i]*A[i];
//            System.out.print(B[i] + " ");
//        }
//        return B;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] A = new int[n];
//        square(A);
//        for (int i=0; i<A.length; i++) {
//            A[i] = sc.nextInt();
//      }
//    }
//    }
    // square of array
//    public static long[] solve(int[] A) {
//        long[] B = new long[A.length];
//       for(int i=1; i<=A.length; i++) {
//           B[i] =(long) A[i]*A[i];
//           }
//        System.out.print(Arrays.toString(B) + " ");
//        return  B;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] A = new int[n+1];
//        for (int i=1; i<n+1; i++) {
//            A[i] = sc.nextInt();
//        }
//        solve(A);
//    }
//    public static int solve(int[] A) {
//        int res = A[0];
//        for (int i=1; i<A.length;i++) {
//            res = res ^ A[i];
//        }
//        System.out.print(res);
//        return res;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] A = new int[n];
//        for (int i=0;i<n;i++) {
//            A[i] = sc.nextInt();
//        }
//        solve(A);
//    }
//    public static int solve(int A, int[] B) {
//        int count = 0;
//        Arrays.sort(B);
//        System.out.print(Arrays.toString(B));
//        System.out.println();
//        for (int i=0; i<B.length; i++) {
//            for (int j=i+1; j<B.length; j++) {
//                if (B[i] + B[j] == A) {
//                    count = 1;
//                }
//            }
//        }
//        System.out.println(count);
//        return count;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int A = sc.nextInt();
//        int[] B = new int[n];
//        for (int i=0; i<n; i++) {
//            B[i] = sc.nextInt();
//        }
//        solve(A, B);
//    }
    // reverse of an array
//    public static int[] solve(int[] A) {
//        int[] B = new int[A.length];
//        for (int i=0; i<A.length; i++) {
//            B[i] = A[i];
//            System.out.print(B[i]);
//            A[i] = A[A.length-i-1];
//            A[A.length-i-1] = B[i];
//        }
//        System.out.print(Arrays.toString(B));
//        return B;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] A = new int[n];
//        for (int i = 0; i < n; i++) {
//            A[i] = sc.nextInt();
//        }
//        solve(A);
//    }
    //removing all non alphanumeric characters from start and end of the string
//    public static String solve(String A) {
//        String B="";
//        int i=0;
//        for (i=0; i<A.length()-1; i++) {
//            if (A.charAt(i) != '"') {
//                if (A.charAt(i) != '*') {
//                    break;
//                }
//            }
//        }
//        B = A.substring(i);
//        for (i=B.length()-1; i>0; i--) {
//            if (B.charAt(i) != '"' && A.charAt(i) != '*') {
//                break;
//            }
//            A = B.substring(0, i);
//        }
//        System.out.println(A);
//        return A;
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String A = sc.next();
//        solve(A);
//    }
    // is the given string pallendrom
//    public static int solve(String A) {
//        String rev="";
//        int count=0;
//        for(int j=A.length()-1; j>=0; j--) {
//            rev = rev + A.charAt(j);
//        }
//        System.out.print(rev);
//        if (A.equals(rev)) {
//            count = 1;
//        }
//        System.out.println(count);
//        return count;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String A = sc.next();
//        solve(A);
//    }
    // checking for vowels and constants
//     public static int[] solve(String A) {
//         int even=0;
//         int odd=0;
//         for(int i=0; i<A.length(); i++) {
//             if(A.charAt(i) == 'a' || A.charAt(i) == 'e' || A.charAt(i) == 'i' || A.charAt(i) == 'o' || A.charAt(i) == 'u') {
//                 even = even + 1;
//             }else {
//                 odd = odd +1;
//             }
//         }
//         int[] arr = {even, odd};
//         System.out.println(Arrays.toString(arr));
//         return arr;
//     }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String A = sc.next();
//        solve(A);
//    }
    ///test
//    public static int[] solve(int[] A) {
//        int[] B = new int[A.length];
//        int[] C = new int[A.length];
//        int max = 0;
//        int min = A[0];
//        for (int i=1; i<A.length; i++) {
//            if (A[i]%2 == 0) {
//                B[i] = A[i];
//            }
//            if (B[i] > max) {
//                max = B[i];
//            }
//        }
//        for (int i=1; i<A.length; i++) {
//            if (A[i]%2 !=0) {
//                C[i] = A[i];
//            }
//            if (C[i] < min) {
//                min = C[i];
//            }
//        }
//        System.out.println(min);
//        System.out.println(max);
//        System.out.println(max-min);
//        return new int[]{max, min};
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] A = new int[n];
//        for (int i=0; i<n; i++) {
//            A[i] = sc.nextInt();
//        }
//        solve(A);
//    }
    // ponny
//    public static int solve(int[] A, int B) {
//        int count =0;
//        int val=-1;
//        Arrays.sort(A);
//        System.out.print(Arrays.toString(A));
//        System.out.println();
//        for (int i=0; i<A.length; i++) {
//            if(A[i] != B) {
//               break;
//            }
//            if (A[i] == B) {
//                count++;
//            }
//            System.out.print(count);
//        }
//        return count;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] A = new int[n];
//        for (int i=0; i<n; i++) {
//            A[i] = sc.nextInt();
//        }
//        int B = sc.nextInt();
//        solve(A,B);
//    }
    public static String solve(String A) {
        int a = 0;
        String ans = "";
        for (int i=0; i<A.length(); i++) {
            if (A.charAt(i) == 'a' && A.charAt(i) == 'b') {
                a =1;
            }
        }
        System.out.print(a);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        solve(A);
    }
}
