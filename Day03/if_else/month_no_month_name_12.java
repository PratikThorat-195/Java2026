
import java.util.Scanner;

// 12. Write a program to input month number and print month Name
public class month_no_month_name_12
{
    public static void main(String[] args) {
        System.out.println("Enter Month number to get month name");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num == 1)
            System.out.println("January");
        else if(num == 2)
            System.out.println("February");
        else if(num == 3)
            System.out.println("March");
        else if(num == 4)
            System.out.println("April");
        else if(num == 5)
            System.out.println("May");
        else if(num == 6)
            System.out.println("June");
        else if(num == 7)
            System.out.println("July");
        else if(num == 8)
            System.out.println("August");
        else if(num == 9)
            System.out.println("September");
        else if(num == 10)
            System.out.println("Octmber");
        else if(num == 11)
            System.out.println("November");
        else if(num == 12)
            System.out.println("December");
        else 
            System.out.println("Enter a number between 1 to 12");
    }
}