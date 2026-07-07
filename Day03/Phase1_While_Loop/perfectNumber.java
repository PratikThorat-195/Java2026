
import java.util.Scanner;

// Check whether number is Perfect number or not
// Input: n = 15
// Output: false
// Explanation: Divisors of 15 are 1, 3 and 5. Sum of divisors is 9 which is not equal to 15.
// --------------------------------------------------------------------------------------------
// Input: n = 6
// Output: true
// Explanation: Divisors of 6 are 1, 2 and 3. Sum of divisors is 6.

public class perfectNumber
{
    public static void main(String[] args) 
    {
        int number;
        System.out.println("Check Wether given number is Perfect number or not : ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int i = 1;
        int sum = 0;
        
        while (i <= number / 2) 
        {  
            if(number % i == 0)
            {
                sum += i;
            }
          i++;      
        }
    
        if(number == sum && number > 0)
            System.out.println("Given Number "+number+" is Perfect Number");
        else
            System.out.println("Given Number "+number+" is Not Perfect Number");

        sc.close();
    }
}
