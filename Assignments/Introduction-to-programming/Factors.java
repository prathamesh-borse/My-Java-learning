import java.util.Scanner;
public class Factors{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your Number:- ");
int number = sc.nextInt();
for(int i=1;i<=number;i++){
if(number%i==0){
System.out.println("The Factors of a " + number + " is " +  i);
}
}
}
}