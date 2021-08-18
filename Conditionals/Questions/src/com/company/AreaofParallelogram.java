package com.company;

import java.util.Scanner;

public class AreaofParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base value of Parallelogram:- ");
        float base = in.nextFloat();
        System.out.println("Enter the height of Parallelogram:- ");
        float height = in.nextFloat();

        float area = height * base;
        System.out.println("The area of Parallelogram is:- " + area);
    }
}
