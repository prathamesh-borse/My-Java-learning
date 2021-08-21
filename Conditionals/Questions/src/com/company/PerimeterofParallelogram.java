package com.company;

import java.util.Scanner;

public class PerimeterofParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double base = in.nextDouble();
        double side = in.nextDouble();

        double perimeter = 2 * (side + base);
        System.out.println((float)(perimeter));
    }
}
