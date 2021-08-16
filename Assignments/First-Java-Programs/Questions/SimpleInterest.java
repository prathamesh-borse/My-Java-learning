import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Principle:- ");
        int pi = sc.nextInt();
        System.out.println("Enter your Rate:- ");
        int rate = sc.nextInt();
        System.out.println("Enter the Time Period:- ");
        int time = sc.nextInt();

        int si = (pi * rate * time) / 100;
        System.out.println("The Simple Interest is " + si);
    }
}
