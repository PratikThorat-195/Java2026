// Calculate Sum of all digit of a given number
import java.util.Scanner;

public class sumOfDigit
{
    public static void main(String[] args) 
    {
        System.out.println("Enter a number to get the sum of all digit");
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int sum = 0;
        while(num > 0)
        {
            int lastdigit = num % 10;

            sum = sum + lastdigit;

            num = num /10;    
        }

        System.out.println("Sum of all digits : "+sum);
    }
}