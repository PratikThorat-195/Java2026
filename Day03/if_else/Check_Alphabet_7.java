//Write a program to check whether a character is alphabet or not
import java.util.Scanner;

public class Check_Alphabet_7
{
    public static void main(String[] args)
    {
        System.out.println("Enter a Character is alphabet or not");
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);
        if(ch >='a' && ch<='z' || ch>='A' && ch<='Z')
            System.out.println("This is a Alphabet");
        else
            System.out.println("This is a NOT Alphabet");
    }
}