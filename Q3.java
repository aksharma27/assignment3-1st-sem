package com.company;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n%2==0){
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }
    }
}
