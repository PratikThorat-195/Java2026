import java.util.Scanner;

public class sumNnaturaleven
{
    public static void main(String arg[])
    {
        System.out.println("Enter a number for sum of N natuarl even number : ");
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int num = 1;
        int sum = 0;    
        
        while(num <= N)
        {
            if(num % 2 == 0)
            {
                sum = sum + num;  
            }
            num++; 
        }    
        System.out.println("Sum of even numbers from 1 to N "+sum);
    }
}