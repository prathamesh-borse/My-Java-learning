// Area Of Rectangle Program
package com.company;

import java.util.Scanner;

public class AreaofRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of rectangle:- ");
        int length = in.nextInt();
        System.out.println("Enter the width of rectangle:- ");
        int width = in.nextInt();

        int area = length * width;
        System.out.println("The area of rectangle is " + area);
    }
}
