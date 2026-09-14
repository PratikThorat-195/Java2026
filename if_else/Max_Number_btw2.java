// 1. Write a program to find maximum between two numbers
import java.util.Scanner;

public class Max_Number_btw2
{
    public static void main(String[] args)
    {
        System.out.println("Enter Two Digit to check maximum number between them : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Digit 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Digit 2: ");
        int num2 = sc.nextInt();
        if(num1 > num2)
            System.out.println("Digit 1 is maximum : "+ num1);
        else if(num1 < num2)
            System.out.println("Digit 2 is maximum : "+ num2);
        else 
            System.out.println("Both are Equal : Digit 1 : "+num1+", Digit 2 : "+num2);
        
    }
}