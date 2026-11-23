
import java.util.Scanner;

// minmum element in the array
public class minElement_array
{
    public static void main(String[] args) {
        System.out.println("Enter the size of array : ");
        Scanner sc = new Scanner(System.in);
        int sizeOfArr = sc.nextInt();
        int[] arr = new int[sizeOfArr];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        } 
        int min = arr[0];
        for(int idx = 1; idx < arr.length; idx++)
        {
            if(arr[idx]< min)
            {
                min = arr[idx];
            }
        }

        System.out.println("Minimum element : "+ min);
    }
}