import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number One:- ");
        int num1 = sc.nextInt();
        System.out.println("Enter your Number Two:- ");
        int num2 = sc.nextInt();
        System.out.println("Enter your Operator:- ");
        char op = sc.next().charAt(0);

        if(op == '+'){
            int result = num1 + num2;
            System.out.println("The addition of " + num1 + " and " + num2 + " is " + result);
        }else if(op == '-'){
            int subtraction = num1 - num2;
            System.out.println("The subtraction of " + num1 + " and " + num2 + " is " + subtraction);
        }else if(op == '*'){
            int multiplication = num1 * num2;
            System.out.println("The multiplication of " + num1 + " and " + num2 + " is " + multiplication);
        }else if(op == '/'){
            int division = num1 / num2;
            System.out.println("The division of " + num1 + " and " + num2 + " is " + division);
        }else{
            System.out.println("You have entered wrong Operator, Please enter correct Operator");
        }

    }
}
