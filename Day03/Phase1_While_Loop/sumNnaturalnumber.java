import java.util.Scanner;

public class sumNnaturalnumber
{
    public static void main(String args[])
    {
        System.out.println("Enter a natural number to find the Sum of N natural number: ");
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int num = 1;
        int sum = 0;

        while (num <= N)
        {
            sum = sum + num;
            num++;    
        }
        System.out.println("Sum of given natural number is : "+sum);
    }
}