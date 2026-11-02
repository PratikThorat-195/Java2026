// 11. Find and print the sum of the Fibonacci series.
import java.util.Scanner;

public class Ques11
{
    public static void main(String[] args) {
        System.out.println("Enter a number to find and print the sum of the Fibonacci series.");
        Scanner sc = new Scanner(System.in);
        int no_of_loop = sc.nextInt();
        int first = 0;
        int second = 1;
        int next;
        int sum= 0;
        for (int i = 1; i <= no_of_loop; i++) {
            sum = sum + first;  
            next = first + second;

            first = second;
            second = next;
            
        }
        System.out.println("Sum  = "+sum);
    }

}