package com.company;

import java.util.Scanner;

public class PerimeterofEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of the side:- ");
        double side = in.nextDouble();

        double perimeter = 3 * side;
        System.out.println(perimeter);
    }
}
