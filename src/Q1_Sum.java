import java.util.Scanner;

public class Q1_Sum
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter No.");
        int X= scanner.nextInt();
        int a;
        int b=0;
        while(X>=10000 && X<100000){
            a= X%10;
            b= a+b;
            System.out.println(a);
            System.out.println(b);

        }
    }
}
