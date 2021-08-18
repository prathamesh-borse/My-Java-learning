// Area Of Rectangle Program
package com.company;

import java.util.Scanner;

public class AreaofRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of rectangle:- ");
        float length = in.nextFloat();
        System.out.println("Enter the width of rectangle:- ");
        float width = in.nextFloat();

        float area = length * width;
        System.out.println("The area of rectangle is " + area);
    }
}
