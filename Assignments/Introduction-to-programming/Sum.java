import java.util.Scanner;
public class Sum{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your Number:- ");
int num = sc.nextInt();
int sum = 0;
while(num!=0){
sum+=num;
num = sc.nextInt();
}
System.out.println("Your Sum is:- " + sum);
}
}