// Area Of Circle Program
package com.company;

import java.util.Scanner;

public class AreaofCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle:- ");
        int r = sc.nextInt();
        float pi = (float) 3.14;

        float area = pi * r * r;
        System.out.println(area);

    }
}
