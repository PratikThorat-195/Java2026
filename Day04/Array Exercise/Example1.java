// NOT Completed solve it.....
import java.util.Arrays;
import java.util.Scanner;
// 1. Write a program to Sort Numeric Array In Ascending Order
//  Sample Output
// Array = {23, 5, 67, 20, 3, 30, 79, 3, 70, 2}
// Ascending Order = {2, 3, 3, 5, 20, 23, 30, 67, 70, 79}

public class Example1
{
    public static void main(String[] args)
    {
        System.out.println("Enter a array to sort the numeric array");
        System.out.println("Enter the size of array : ");
    
        Scanner sc = new Scanner(System.in);    

        int sizeOfArr = sc.nextInt();

        int[] arr = new int[sizeOfArr];

        System.out.println("Enter the values one by one :");
        for(int i = 0; i < sizeOfArr; i++ )
        {
                arr[i] = sc.nextInt();
        }
        

        System.out.println("Given Array: "+Arrays.toString(arr));
    }
}