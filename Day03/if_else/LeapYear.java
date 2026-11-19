//6 Write a program to check whether a year is leap year or not 
import java.util.Scanner;

public class LeapYear
{

    public static void main(String[] args)
    {
        System.out.println("Enter a year to check whether the year is leap or not :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if((num % 4 == 0 && num % 100 != 0) || (num % 400 == 0) )
            System.out.println(num+" is leap year");
        else 
            System.out.println(num+" is NOT leap year");

        sc.close();
    }
}