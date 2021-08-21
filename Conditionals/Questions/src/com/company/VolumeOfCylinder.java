package com.company;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius of the cylinder:- ");
        int radius = in.nextInt();
        System.out.println("Enter height of the cylinder:- ");
        int height = in.nextInt();
        double PI = 3.14285714286;

        double volume = PI*(radius*radius)*height;
        System.out.println(volume);

    }
}
