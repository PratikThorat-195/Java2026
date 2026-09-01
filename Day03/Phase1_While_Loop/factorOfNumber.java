// 24. Print all factors of the given number
import java.util.Scanner;

public class factorOfNumber
{
    public static void main(String args[])
    {
        System.out.println("Enter a number to get their Factors: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        while(i<=num)
        {
            if(num % i == 0)
                System.out.print(i +" ");
            i++;
        }

    }
}