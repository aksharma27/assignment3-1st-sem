package com.company;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
//        Cramer's rul: ax + by =e
//            cx +dy =f
//                    x= ed-bf/ad-bc
//                    y=af-ec/ad-bc
        System.out.println("Enter the values of a, b, c, d and e.");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();
        int f = in.nextInt();
        double x = (double)((e*d) -(b*f))/((a*d)-(b*c));
        double y = (double)((a*f) -(e*c))/((a*d)-(b*c));
        if ((a*d)-(b*c)==0){
            System.out.println("The equation has no solution");
        }
        else {
            System.out.println("X: " + x + " \n" + " Y: " + y);
        }
    }
}
