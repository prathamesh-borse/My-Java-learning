package com.company;

import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double side = in.nextDouble();

        double Perimeter = 4 * (side);
        System.out.println(Perimeter);
    }
}

