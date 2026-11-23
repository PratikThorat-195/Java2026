
import java.util.Arrays;
import java.util.Scanner;
// Max element in the array
public class maxElement_Array
{
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int sizeOfArr = sc.nextInt();

        int[] arr = new int[sizeOfArr];
        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = sc.nextInt();
        }
        System.out.println("Given Array : "+Arrays.toString(arr));

        int max = arr[0];
        for(int i = 1 ; i< arr.length; i++)
        {
            if(arr[i]> max)
            {   
                max = arr[i];
            }
        }
        System.out.println("Maximum Element is : "+max);

        sc.close();
    }
}