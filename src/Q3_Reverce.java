import java.util.Scanner;

public class Q3_Reverce
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter No. ");
        int a = scanner.nextInt();
        int b=0;

        while (a!=0)
        {
            int c= a%10;
            b= b*10+c;
            a /=10;//did not understand this equation
        }
        System.out.println("Reversed No. is "
        +b);
    }
}
