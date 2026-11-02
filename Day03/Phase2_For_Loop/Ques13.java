// 13. Find and print the sum of all factors of the given number.
import java.util.Scanner;

public class Ques13
{
    public static void main(String[] args) {
        System.out.println("Enter a number to get all factor of the given number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=num; i++ )
        {
            if(num % i == 0)
            {
                System.out.println(i);
                sum = sum + i;
            }    
            
        }
        System.out.println("Sum = "+sum);
    }
}