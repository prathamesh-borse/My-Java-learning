package com.company;

import java.util.Scanner;

public class AreaofRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first length of diagonal:- ");
        float d1 = in.nextFloat();
        System.out.println("Enter the second length of diagonal:- ");
        float d2 = in.nextFloat();

        float area = (d1 * d2) / 2;
        System.out.println("The area of Rhombus is:- " + area);
    }
}
