package com.company;

import java.util.Scanner;

public class AreaofEquilateral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float side = in.nextFloat();

        double area = (1.73d * side * side) / 4;
        System.out.println(area);
    }
}
