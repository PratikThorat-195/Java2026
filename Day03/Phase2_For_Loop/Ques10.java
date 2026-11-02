// Print the Fibonacci series up to the required number of terms.
import java.util.Scanner;

public class Ques10
{
    public static void main(String[] args) {
        System.out.println("Enter a number to print the Fibonacci series up to the required number of terms.");
        Scanner sc = new Scanner(System.in);
        int fib = sc.nextInt();
        int first = 0;
        int next;
        int second = 1;
        for(int i = 1; i<= fib; i++)
        {
            System.out.println(first);

            next = first + second;
            
            first = second;
            second = next;
        }
    }
}