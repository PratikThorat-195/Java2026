// 6. Calculate and print the factorial of a given number.
import java.util.Scanner;

public class Ques6
{
    public static void main(String[] args) {
        System.out.println("Enter a Number to calculate factorial");
        Scanner sc = new Scanner(System.in);
        int fact = sc.nextInt();
        int og_Fact = fact;
        int result = 1;
        for(int i = 0; fact > 0; i++)
        {
            result = result * fact;
            fact--;
        }
        System.out.println("!"+og_Fact+" = "+result);
    }
}