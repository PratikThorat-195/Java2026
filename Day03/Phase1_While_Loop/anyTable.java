import java.util.Scanner;

public class anyTable
{
    public static void main(String agrs[])
    {
        System.out.println("Enter any number for getting a table :");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int i = 1;
        while(i <= 10)
        {
            System.out.println(num +" x "+ i +" = " + num*i);
            i++;
        }
        // for (int i=1; i<=10 ; i++)
        // {
        //     System.out.println(num +" x "+ i +" = " + num*i);
        // }
    }
}