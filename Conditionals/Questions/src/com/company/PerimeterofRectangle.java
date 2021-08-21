package com.company;

import java.util.Scanner;

public class PerimeterofRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double length = in.nextDouble();
        double width = in.nextDouble();

        double Perimeter = 2 * (length + width);
        System.out.println(Perimeter);
    }
}
