import java.util.Scanner;
public class simpleInterest{
public static void main(String[] args){
int p,r,t;
Scanner sc = new Scanner(System.in);
p = sc.nextInt();
r = sc.nextInt();
t = sc.nextInt();
int si = p*r*t/100;
System.out.println("The Simple Interest is:- " + si);
}
}