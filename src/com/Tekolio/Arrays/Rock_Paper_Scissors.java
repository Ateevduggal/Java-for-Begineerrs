package com.Tekolio.Arrays;

import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name ");
        String name = sc.next();
        System.out.println("Welcome \n Chose a number between 0 & 2");
        System.out.println("0 for rock, 1 for paper & 2 for scissors");
        int computer;
        int cc=0;
        int cm=0;
        Random rand = new Random();
        for (int i=1; i<=5; i++) {
            int me = sc.nextInt();
            computer = rand.nextInt(3);
            System.out.println("Compuetr chose " + computer);
            if(me > 2) {
                System.out.println("Chose a number between 0, 1 & 2");
            }else{
                if(computer == me) {
                    System.out.println("TIE");
                }else if(computer == 0 && me == 1) {
                    System.out.println(name + " Wins");
                    cm++;
                }else if(computer == 1 && me == 0) {
                    System.out.println("Computer Wins");
                    cc++;
                }else if(computer == 1 && me == 2) {
                    System.out.println(name + " Wins");
                    cm++;
                }else if(computer == 2 && me == 1) {
                    System.out.println("Computer Wins");
                    cc++;
                }else if(computer == 2 && me == 0) {
                    System.out.println(name + " Wins");
                    cm++;
                }else if(computer == 0 && me == 2) {
                    System.out.println("Computer Wins");
                    cc++;
                }
            }
            if(i==5) {
                break;
            }
        }
        System.out.println();
        System.out.println("Final Score \n Compuetr : " + cc + "\n " + name +" : " + cm );
    }
}
