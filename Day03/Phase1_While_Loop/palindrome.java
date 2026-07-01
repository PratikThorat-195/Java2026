// Check whether the number is palindrome or not
import java.util.Scanner;

public class palindrome
{
    public static void main(String[] args) 
    {
        int number;
        System.out.println("Enter a number to check Palindrome : ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int org_number = number;
        int answer = 0;
        
        while(number > 0)
        {
            int lastdigit = number % 10;

            answer = answer * 10 + lastdigit;

            number = number / 10; 
        }
        System.out.println("Given number = "+org_number+" and reverse number is = "+ answer);
        if(answer == org_number)
            System.out.println("Number is Palindrome");
        else 
            System.out.println("Number is not Palindrome");
    }
}