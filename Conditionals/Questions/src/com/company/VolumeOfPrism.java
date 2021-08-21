package com.company;

import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the height of Prism:- ");
        int height = in.nextInt();
        System.out.println("Enter the length of Prism:- ");
        int length = in.nextInt();
        System.out.println("Enter the width of Prism:- ");
        int width = in.nextInt();

        int area = length * width;
        int volume = area * height;
        System.out.println("The Volume of Prism is:- " + volume);
    }
}
