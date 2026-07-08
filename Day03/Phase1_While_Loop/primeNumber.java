
import java.util.Scanner;

// Check whether number is prime number or not

public class primeNumber
{
    public static void main(String[] args) 
    {
        int num;
        System.out.println("Enter a numberr to check Number is Prime or not...");
        Scanner sc = new Scanner(System.in);
        num =sc.nextInt();
        boolean res = isPrime(num);
        if(res == true)
        {
            System.out.println("Given Number is Prime Number");
        }
        else
        {
            System.out.println("Given Number is NOT a Prime Number");
        }
        sc.close();
    }

    public static boolean  isPrime(int number)
    {
        if(number <= 0)
        {
            return false; 
        }
        int divisor = 2;
        boolean isPrimeFlag = true;

        while(divisor * divisor <= number) 
        { 
            if(number % divisor == 0)
            {
                isPrimeFlag = false;
                break;
            }
            divisor++;
        }

        return isPrimeFlag;
    }
}