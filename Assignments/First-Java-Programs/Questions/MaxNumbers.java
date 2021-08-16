import java.util.Scanner;

public class MaxNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;

        while (true){
            System.out.println("Enter your Number:- ");
            int in = sc.nextInt();
            if (in == 0){
                break;
            }
            if(in > max){
                max = in;
            }
        }
        System.out.println("The maximum from all of these Numbers are :- " + max);
    }
}
