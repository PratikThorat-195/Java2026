// 10. Write a program to check whether a character is uppercase or lowercase alphabet
import java.util.Scanner;

public class Uppercase_lowercase_10
{
    public static void main(String[] args) {
        System.out.println("Enter a character to check wher the character is Uppercase or lowercase");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch >= 'A' && ch <= 'Z')
            System.out.println(ch+" is Uppercase");
        else if(ch >= 'a' && ch <= 'z')
            System.out.println(ch+" is Lowercase");
        else 
            System.out.println(ch+" is not a charcter");
    }
}