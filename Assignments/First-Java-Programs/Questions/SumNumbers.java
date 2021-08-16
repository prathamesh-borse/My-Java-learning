import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.println("Enter your Number:- ");
            int in = sc.nextInt();
            if (in == 0){
                break;
            }
            ans = ans + in;
        }
        System.out.println("The sum of all these Numbers are :- " + ans);
    }
}
