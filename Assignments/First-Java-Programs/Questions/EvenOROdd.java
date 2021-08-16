import java.util.Scanner;
public class EvenOROdd {
    static int evenorodd(int n1)
    {
        if(n1%2 == 0){
            System.out.println("The Number is Even");
        }else {
            System.out.println("The Number is Odd");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        evenorodd(n1);
    }
}
