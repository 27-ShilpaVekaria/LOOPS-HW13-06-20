import java.util.Scanner;

public class Q5_ArmstrongNo
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter No.");
        int c = scanner.nextInt();
        int a = scanner.nextInt();
        int n=scanner.nextInt();
        int temp = n;
        while (n > 0)
        {
         a=n%10;
         n=n/10;
         c=c+(a*a*a);
        }
        if(temp==c){
            System.out.println("Armstrong No. ");}
        else{
            System.out.println("Not Armstrong No. ");
        }
    }
}
