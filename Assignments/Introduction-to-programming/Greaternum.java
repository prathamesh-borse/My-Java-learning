import java.util.Scanner;
public class Greaternum{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your num1 :- ");
int num1 = sc.nextInt();
System.out.println("Enter your num2 :- ");
int num2 = sc.nextInt();
if(num1 > num2){
System.out.println(num1 + " is Greater. ");
}else if(num1 < num2){
System.out.println(num2 + " is Greater. ");
}
}
}