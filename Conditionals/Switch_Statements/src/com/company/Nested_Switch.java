package com.company;

import java.util.Scanner;

public class Nested_Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int empID = in.nextInt();
        String department = in.next();

//        switch (empID) {
//            case 1:
//                System.out.println("Emp ID is 1");
//                break;
//            case 2:
//                System.out.println("Emp ID is 2");
//                break;
//            case 3:
//                System.out.println("Emp ID is 3");
//                switch (department) {
//                    case "IT":
//                        System.out.println("Information Technology");
//                        break;
//                    case "Management":
//                        System.out.println("Management");
//                        break;
//                    case "CT":
//                        System.out.println("Computer Technology");
//                        break;
//                    default:
//                        System.out.println("Please enter correct information");
//                }
//                break;
//            default:
//                System.out.println("Please enter correct choice");
//        }


            switch (empID) {
                case 1 -> System.out.println("Emp ID is 1");
                case 2 -> System.out.println("Emp ID is 2");
                case 3 -> {
                    System.out.println("Emp ID is 3");
                    switch (department) {
                        case "IT" -> System.out.println("Information Technology");
                        case "Management" -> System.out.println("Management");
                        case "CT" -> System.out.println("Computer Technology");
                        default -> System.out.println("Please enter correct information");
                    }
                }
                default -> System.out.println("Please enter correct choice");
            }
    }
}
