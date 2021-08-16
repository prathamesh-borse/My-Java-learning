// Program to print factorial of a number

import java.util.Scanner;
public class Factorials {
    static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
System.out.println(factorial(num));
}
}