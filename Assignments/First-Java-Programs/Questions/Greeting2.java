import java.util.Scanner;

public class Greeting2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Name:- ");
        String name = in.next();
        in.close();
        System.out.println("Hello " + name + " Good Morning!");
    }
}
