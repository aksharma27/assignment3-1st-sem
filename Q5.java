package com.company;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        System.out.println("Enter the values of a, b and c  of a quadratic equation");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        double d =  Math.pow(b,2)- 4*a*c;
        System.out.println("discriminant is :"+d);
        if (c >0){
            System.out.println("The equation has two roots");
        }
        if (d ==0)
        {
            System.out.println("The equation hasexactly one root");
        }
        if (d < 0) {

            System.out.println("The equation has no real roots");
        }
    }
}
