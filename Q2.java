package com.company;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("Enter the marks obtained");
        Scanner in = new Scanner(System.in);
        double marks = in.nextDouble();
        if (marks >= 40)
        {
            System.out.println("Congratulation! You have passed the exam");
        }
        else
        {
            System.out.println("Sorry! You have failed");
        }
    }
}
