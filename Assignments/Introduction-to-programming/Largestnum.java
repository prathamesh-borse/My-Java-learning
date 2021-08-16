import java.util.Scanner;
public class Largestnum{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int max=0;
boolean a = true;
while(a){
System.out.println("Enter your Number:- ");
int in = sc.nextInt();
if(in == 0){
a = false;
}
if(in>max){
max = in;
}
}
System.out.println("Largest Number from your Entered Number is:- " + max);
}
}