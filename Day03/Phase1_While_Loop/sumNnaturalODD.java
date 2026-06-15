import java.util.Scanner;

public class sumNnaturalODD
{
    public static void main(String agrs[])
    {
        System.out.println("Enter a number for sum of N natuarl Odd number : ");
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int num = 1; 
        int sum = 0;

        while(num <= N)
        {
            if(num % 2 != 0)
            {
                sum = sum + num;
            }
            num++;
        }

        System.out.println("Sum of odd natural number is "+ sum);
    }
}