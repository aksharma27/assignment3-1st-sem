package com.company;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("Enter any character");
        Scanner in = new Scanner(System.in);
        char c = in.next().charAt(0);
        if (c >= 'A' || c <='Z')
        {
            System.out.println("Capital Letters");
        }
        if (c >= 'a' || c <= 'z')
        {
            System.out.println("Small Case");
        }
        if (c >=0 || c <= 9)
        {
            System.out.println("Digit entered");
        }
        else {
            System.out.println("Special Symbol");
        }
    }
}
