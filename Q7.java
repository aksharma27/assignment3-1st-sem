package com.company;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        System.out.println("Enter the values of x and y");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        if (x >= 0 && y >= 0) {

            System.out.println(x+" "+y+" are in quadrant I");
        }
        if (x < 0 && y >= 0) {
            System.out.println(x +" "+ y+" are in quadrant II");
        }
        if (x < 0 && y < 0){
            System.out.println(x +" "+y + " are in quadrant III");
        }
        if (x >= 0 && y < 0) {
            System.out.println(x +" "+ y + " are in quadrant IV");
        }
    }
}
