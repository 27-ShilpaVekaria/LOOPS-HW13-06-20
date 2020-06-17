import java.util.Scanner;

public class Q6_Palindrome
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter No.");
        int r = scanner.nextInt();
        int sum = 0;
        int temp;
        int n = scanner.nextInt();
        temp =n;
        while(n>0)
        {
            r=n%10;//getting remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        if (temp==sum)
        {
            System.out.println("Palindrome No. ");
        }
        else
        {
                System.out.println("not Palindrome No. ");
        }

    }
}
