package com.prathamesh.hackerrank;

public class Main {

    public static void main(String[] args) {
//	    Q: Why do we use arrays?
//      -> When we want to store the details of 10000 students
//         of same datatype then it becomes difficult to declare and initialise all the 10000 student details.
//         Because of this above situation and to avoid these situation we use arrays data structure and also to
//         effectively use of the computer memory.

//      Q: What is array?
//      -> An array is a data structure which can be used to store the data of same collection of data types.

//      Syntax for array declaration & initialisation
//      datatype[] variable_name = new datatype[size];
        int[] rollnos = new int[5]; // declaration + initialisation // The above statement will create an integer array of size 5
//      int[] rollnos2 = {10, 20, 30, 40, 50}; // we can also declare and initialise array like this.
        // every array starts with index of 0 and ends with (total_array_size) - 1
        rollnos[0] = 11; // here we are assigning value at index 0 of an integer array size of 5
        rollnos[1] = 20; // here we are assigning value at index 0 of an integer array size of 5
        // so on....
        rollnos[2] = 30;
        rollnos[3] = 50;
        rollnos[4] = 60;

//      System.out.println(rollnos[0]); // here we are printing the index value of 0 of an integer array

        // we can also print the values of an array using for loop the implementation is as follows
//        for (int i = 0; i < rollnos.length; i++) {
//            System.out.println(rollnos[i] + " ");
//        }

        // this is the enhanced version of the above for loop
        for (int rollno : rollnos) {
            System.out.println(rollno + " ");
        }
    }
}

