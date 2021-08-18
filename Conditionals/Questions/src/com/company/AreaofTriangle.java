// Area Of Triangle Program
package com.company;

import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base value of triangle:- ");
        float base = sc.nextFloat();
        System.out.println("Enter the height value of triangle:- ");
        float height = sc.nextFloat();

        float area = base * height / 2;
        System.out.println("The area of an triangle is:- " + area);
    }
}
