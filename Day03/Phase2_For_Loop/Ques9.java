// 9. Check whether the given number is a prime number.
import java.util.Scanner;
public class Ques9
{
    public static void main(String[] args) 
    {
        System.out.println("Enter a number to check whether the number is prime or not ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        
            int count = 0;
            for(int j = 1;j<=num; j++)
            {
                if(num % j == 0)
                count++;
            }
            if(count == 2)
            System.out.println(num+" is Prime number");
            else 
            System.out.println(num+" is NOT Prime number");
    }
}