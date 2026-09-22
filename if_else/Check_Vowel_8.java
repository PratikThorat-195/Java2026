//8. Write a program to input any alphabet and check whether it is vowel or consonant 
import java.util.Scanner;

public class Check_Vowel_8{
    public static void main(String[] args)
    {
        System.out.println("Enter a character to check a vowel: ");
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            System.out.println(ch +" is vowel");
        else
            System.out.println(ch +" is not vowel");
    }
}