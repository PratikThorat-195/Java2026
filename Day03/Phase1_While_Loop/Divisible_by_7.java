
import java.util.Scanner;

// Print all a number between a and b tht are divisible by 7

public class Divisible_by_7
{
    public static void main(String[] args) {
        System.out.println("Number Divisible by 7");
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start number : ");
        a = sc.nextInt();
        System.out.println("Enter end number : ");
        b = sc.nextInt();
        
        while(a<=b)
        {
            if(a % 7 == 0)
            System.out.println(a);
            a++;
        }
        sc.close();
    }
}