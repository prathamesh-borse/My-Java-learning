// Area Of Circle Program
package com.company;

import java.util.Scanner;

public class AreaofCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle:- ");
        double r = sc.nextDouble();

        double area = Math.PI * r * r;
        System.out.println((float)(area));

    }
}
