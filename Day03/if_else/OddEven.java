// 5. Write a program to check whether a number is even or odd
import java.util.Scanner;

public class OddEven
{
    public static void main(String[] args)
    {
        System.out.println("Enter a digit to check wether the number is Odd or Even");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 2 == 0)
            System.out.println(num+" is Even");
        else 
            System.out.println(num+" is Odd");
    }
}