import java.util.Scanner;

public class CurrencytoDollar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your Price in Rupees:- ");
        double currency = sc.nextDouble();

        double dollar = currency / 61.06;
        System.out.println((float) (dollar));
    }
}
