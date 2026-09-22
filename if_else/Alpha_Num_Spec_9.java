// 9. Write a program to input any character and check whether it is alphabet, digit or special character
import java.util.Scanner;

public class Alpha_Num_Spec_9
{
    public static void main(String[] args)
    {
        System.out.println("Enter a Character: ");
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);
        if((ch <= 'a' && ch >= 'z') || (ch <= 'A' && ch >= 'Z'))
            System.out.println(ch+" is alphabet");
        else if(ch >= '0' && ch <= '9')
            System.out.println(ch+" is number");
        else 
            System.out.println(" it's a special character");
    }
}