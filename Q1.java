package com.company;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter your height in feets");
        Scanner in = new Scanner(System.in);
        double h = in.nextDouble();
        if (h>= 6)
        {
            System.out.println("The person is tall");
        }

    }
}
