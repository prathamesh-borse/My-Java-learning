import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number one:- ");
        int num1 = sc.nextInt();
        System.out.println("Enter your Number two:- ");
        int num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println("The " + num1 + " is greater than " + num2);
        }else {
            System.out.println("The " + num2 + " is greater than " + num1);
        }
    }
}
