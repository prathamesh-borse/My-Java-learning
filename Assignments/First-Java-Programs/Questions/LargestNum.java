import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number:- ");
        int a = sc.nextInt();
        System.out.println("Enter second Number:- ");
        int b = sc.nextInt();
        System.out.println("Enter third Number:- ");
        int c = sc.nextInt();

        int max = a;
        if (b > max){
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("The largest Number is " + max);
    }
}
