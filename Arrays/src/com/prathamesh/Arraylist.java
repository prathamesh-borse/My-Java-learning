package com.prathamesh;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
//        list.add(56);
//        list.add(60);
//        list.add(26);
//        list.add(36);
//        list.add(46);

//        System.out.println(list.contains(56));
//        System.out.println(list.contains(46));
//        System.out.println(list);
//        list.set(0, 99); // this will modify the value at 0th index from the arraylist.

//        list.remove(2); // this will remove the element from 2nd index of the arraylist.

        // input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i) + " "); // pass index here, list[index] syntax will not work here
        }
        System.out.println(list);

    }
}
