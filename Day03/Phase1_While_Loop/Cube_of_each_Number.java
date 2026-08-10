//  Print the square of each number from 1 to n.
import java.util.Scanner;

public class Cube_of_each_Number
{
    public static void main(String[] args) 
    {
        System.out.println("Enter a Number to get cube of each number till the given number is ...");
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int i = 1;
        int val;
        while (i <= num) 
        { 
           val = (i * i * i);
           System.out.println("Cube of "+i+" is : "+val);
           i++;    
        }
        sc.close();
    }
}