package com.company;

import java.util.Scanner;

public class PerimeterofCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float rc = in.nextFloat();

        double Perimeter = 2 * Math.PI * rc;
        System.out.println((float) (Perimeter));
    }
}
