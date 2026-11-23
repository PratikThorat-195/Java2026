import java.util.Arrays;
import java.util.Scanner;


public class insertion_at_start
{
    public static void main(String[] args)
    {
        System.out.println("Enter the size of array :");
        Scanner sc = new Scanner(System.in);
        int sizeOfArr = sc.nextInt();
        int[] arr = new int[sizeOfArr];
        System.out.println("Enter the elements : ");
        for(int i = 0; i < sizeOfArr;i++)
        {
                arr[i]= sc.nextInt();
        }
        System.out.println("Enter one element you want at start at array : ");
        int startElement = sc.nextInt();
        
        int[] newArr = new int[arr.length+1];

        newArr[0] = startElement; 
        for(int idx = 1; idx < newArr.length; idx++)
        {
            newArr[idx] = arr[idx-1];
        }

        System.out.println("given Array : "+Arrays.toString(arr));
        System.out.println("new array   : "+Arrays.toString(newArr));
    }
}