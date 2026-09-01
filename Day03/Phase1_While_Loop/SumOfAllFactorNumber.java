
import java.util.Scanner;

// Find and print the sum of all factors of the given number
public class SumOfAllFactorNumber
{
    public static void main(String[] args) 
    {
        System.out.println("Enter a number to get the sum of all factor : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(num>=i)
        {
            if(num % i == 0)  
                sum = sum +i;
            i++;
        }    
        System.out.println("Sum of all factor number: "+sum);
    }
}