package com.company;

import java.util.Scanner;

public class AreaofIsosceles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base of Isosceles Triangle:- ");
        float base = in.nextFloat();
        System.out.println("Enter the height of Isosceles Triangle:- ");
        float height = in.nextFloat();

        float area = base * height / 2;
        System.out.println("The area of Isosceles Triangle:- " + area);
    }
}
