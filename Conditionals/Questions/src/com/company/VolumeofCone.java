package com.company;

import java.util.Scanner;

public class VolumeofCone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        float PI = 3.14f;

        int height = in.nextInt();
        int radius = in.nextInt();
//        float height = 20.10f;
//        float radius = 10.34f;
        double PI = 3.142;

        double volume = PI * ( radius * radius ) * height / 3 ;
        System.out.println(volume);
    }
}
