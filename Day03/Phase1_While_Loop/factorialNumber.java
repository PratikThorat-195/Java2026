import java.util.Scanner;

public class factorialNumber
{
    public static void main(String agrs[])
    {
        System.out.println("Enter a number for calculatig N factorial, N = ");
        Scanner scan = new Scanner(System.in);
        int Fact = scan.nextInt();
        int result = 1;
        while(Fact > 0)
        {
            result = result * Fact;
            Fact--;
        }
        System.out.println("Factorial is : "+result);
    }
}