// You can update array element using array index
import java.util.Arrays;
import java.util.Scanner;

public class update_Array
{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of array ");
        num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter "+ num +" integer:");
        for(int i = 0; i < num ;i++ )
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Your given array: "+Arrays.toString(arr));

//     First element of array
        arr[0] = 90;

//     Last element of array
        arr[arr.length-1] = 10;

        System.out.println("Updated array: "+Arrays.toString(arr));
        sc.close();
    }
}
