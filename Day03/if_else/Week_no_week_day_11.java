// 11. Write a program to input week number and print week day
import java.util.Scanner;

public class Week_no_week_day_11
{
    public static void main(String[] args)
    {
        System.out.println("enter a week number we will show you the week day: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num == 1)
            System.out.println("This is Sunday");
        else if(num == 2)
            System.out.println("This is Monday");
        else if(num == 3)
            System.out.println("This is Thursday");
        else if(num == 4)
            System.out.println("This is Wednesday");
        else if(num == 5)
            System.out.println("This is Thursday");
        else if(num == 6)
            System.out.println("This is Friday");
        else if(num == 7)
            System.out.println("This is Saturday");
        else
            System.out.println("Enter number between 1 to 7");
    }
}