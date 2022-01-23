package com.company;

import java.util.Random;
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for paper, 2 for Scissor");
        int userIn = sc.nextInt();
        Random rand = new Random();
        int compIn = rand.nextInt(3);
        if (userIn == compIn){
            System.out.println("Draw match");
        }
        if (userIn == 0 && compIn ==2 || userIn == 1 && compIn ==0 || userIn == 2 && compIn ==1){
            System.out.println("You won!");
        }
        else{
            System.out.println("Computer won");
        }
        if (compIn == 0){
            System.out.println("Computer choice : Rock");
        }
                else if (compIn ==1 ){
            System.out.println("Computer choice : Paper");
        }
        else {
            System.out.println("Computer choice : Scissor");
        }
    }
}
