// 4. Write a program to check whether a number is divisible by 5 and 11 or not
import java.util.Scanner;

public class DivisibleNum5AND11
{
    public static void main(String[] args)
    {
        System.out.println("Enter a digit to check wether the number is divisble by 5 and 11");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 5 == 0 && num % 11 == 0)
            System.out.println("Number is divisible by 5 & 11");
        else 
            System.out.println("Number is NOT divisible by 5 & 11");
        sc.close();
    }
}