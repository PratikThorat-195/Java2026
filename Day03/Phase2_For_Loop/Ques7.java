
import java.util.Scanner;

// 7. Calculate and print the factorial of every number from 1 to n.
public class Ques7
{
    public static void main(String[] args) {
        System.out.println("Enter a number to Calculate the factorial of every number from 1 to given number");
       Scanner sc = new Scanner(System.in);
        int Fact = sc.nextInt();
    
       for(int i = 1; i <= Fact; i++)
       {
        int result = 1;
            for (int j = 1; j <= i  ; j++) {
                result = result * j;
            }

            System.out.println("!"+i+" = "+result);
       }
    }
}