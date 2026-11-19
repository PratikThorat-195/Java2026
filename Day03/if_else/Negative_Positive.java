// 3. Write a program to check whether a number is negative, positive or zero
import java.util.Scanner;

public class Negative_Positive
{
    public static void main(String[] args) {
        System.out.println("Enter a number to check whether the number is Positive and Negative");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        if(num > 0)
        System.out.println(num+" is a positive number");
        else if(num < 0)
        System.out.println(num+" is a negative number");
        else if(num == 0)
        System.out.println(num+" is zero");
    }
}