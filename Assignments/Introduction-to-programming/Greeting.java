import java.util.Scanner;
public class Greeting{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your Name:-");
String name = sc.next();
sc.close();
System.out.println("Good Morning, " + name);
}
}