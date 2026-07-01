import java.util.Scanner;

public class ReverseNumber
{
    public static void main(String[] args) 
    {
        System.out.println("Get Number in reverse order: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int answer = 0;

        while(num > 0) 
        { 
            int lastdigit = num % 10;
            
            answer = answer * 10 + lastdigit;

            num = num / 10;
        }
        System.out.println("reverse number is : "+ answer);
    }
}