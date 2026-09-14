// 2. Write a program to find maximum between three numbers
import java.util.Scanner;

public class Max_Number_btw3
{
    public static void main(String[] args) {
        System.out.println("Enter Three digits and check which is max.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2 : ");
        int num2 = sc.nextInt();
        System.out.println("Enter Number 3 : ");
        int num3 = sc.nextInt();
        if(num1>num2 && num1>num3)
            System.out.println("Max Number is 1 : "+num1);
        else if(num2 > num3)
            System.out.println("Max Number is 2 : "+num2);
        else if(num3 > num2)
            System.out.println("Max Number is 3 : "+num3);
        else
            System.out.println("All numbers are equal   ");
    }
}