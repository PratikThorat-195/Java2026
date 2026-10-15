// 14. Write a program to input angles of a triangle and check whether triangle is valid or not
import java.util.Scanner;

public class Check_Triangle_14
{
    public static void main(String[] args) {
        System.out.println("Enter a sides of whether it is Triangle or not. ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a = ");
        int a = input.nextInt();
        System.out.println("Enter b = ");
        int b = input.nextInt();       
        System.out.println("Enter c = ");
        int c = input.nextInt();
        int total = 180;
        int tri = a + b + c;
        if(tri == total)
            System.out.println("According to given side it is TRIANGLE");
        else
            System.out.println("NOT a TRIANGLE");
    }
}