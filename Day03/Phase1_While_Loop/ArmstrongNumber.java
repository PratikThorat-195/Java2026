// Check whether given number is Armstrong or not 
import java.util.Scanner;

public class ArmstrongNumber
{
 public static void main(String[] args) 
 {
    int num;
    System.out.println("Enter a number to check whether the number is Armstrong number or not");
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();
    int ogNum = num;
    int count = 0;
    while(num > 0)
    {  
        count++;
        num = num / 10;
    }
    System.out.println("Count = "+count);
    int total = armstrongNumber(ogNum, count);
    System.out.println("Total = "+total);

    if(ogNum == total)
        System.out.println("Given Number is Armstrong Number");
    else
        System.out.println("Given Number is NOT Armstrong Number");
 } 

    public static int armstrongNumber(int ogNum,int count)
    {   
        int sum = 0;
        while(ogNum > 0)
        {
            int singlenumber = ogNum % 10;
            int res = (int) Math.pow(singlenumber, count);
            sum = sum + res;
            ogNum = ogNum / 10;
        }
        
        return sum;
    }
}