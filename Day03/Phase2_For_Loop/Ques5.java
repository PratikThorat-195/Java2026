// 5. Print the multiplication table of a given number.
import java.util.Scanner;

public class Ques5
{
    public static void main(String[] args) {
        System.out.println("Enter any number to get table :");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int num = 1;
        for(int i = 0; num <= 10 ;i++)
        {
            System.out.println(input+" * "+num+" = "+input*num);
            num++;
        }
    }
}