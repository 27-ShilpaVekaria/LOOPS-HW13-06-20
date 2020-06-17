import java.util.Scanner;

public class Q2_Odd_Even
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter No.");
        int v1 = scanner.nextInt();
        int odd = 0;
        int even = 0;
        int count = 0;

        if (v1 >= 10000 && v1 < 100000) {
            while (v1 > 0) {
                count = v1 % 10;
                if (v1 % 2 == 0) {
                    even = even + count;
                } else {
                    odd = odd + count;
                }
                v1 = v1 / 10;
            }
        System.out.println("sum of odd= " + odd);
        System.out.println("Sum of even= " + even);
        }else
            { System.out.println("Please enter 5 digits only");}

    }
}
