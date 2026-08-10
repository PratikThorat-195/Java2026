//  Print the square of each number from 1 to n.
import java.util.Scanner;

public class Square_Of_Each_Number
{
    public static void main(String[] args) 
    {
        System.out.println("Enter a Number to get square of each number till the given number is ...");
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int i = 1;
        int val;
        while (i <= num) 
        { 
           val = (i * i);
           System.out.println("Squre of "+i+" is : "+val);
           i++;    
        }
        sc.close();
    }
}