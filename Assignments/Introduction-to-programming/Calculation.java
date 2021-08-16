import java.util.Scanner;
public class Calculation{
public static void main(String[] args){
int num1,num2;
Scanner sc = new Scanner(System.in);
System.out.println("Enter your Num1:- ");
num1 = sc.nextInt();
System.out.println("Enter your Num2:- ");
num2 = sc.nextInt();
System.out.println("Enter your Operator:- ");
char op = sc.next().charAt(0);
if(op=='+'){
int result = num1 + num2;
System.out.println("The addition of " + num1 + " and " + num2 + " is " + result);
}else if(op == '-'){
int result2 = num1 - num2;
System.out.println("The substraction of " + num1 + " and " + num2 + " is " + result2);
}else if(op == '*'){
int result3 = num1 * num2;
System.out.println("The multiplication of " + num1 + " and " + num2 + " is " + result3);
}else if(op == '/'){
int result4 = num1 / num2;
System.out.println("The division of " + num1 + " and " + num2 + " is " + result4);
}
}
}