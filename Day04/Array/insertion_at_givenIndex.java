// Insert at given index
import java.util.Arrays;
import java.util.Scanner;

public class insertion_at_givenIndex
{
    public static void main(String[] args) {
        System.out.println("Enter a size of array : ");
        Scanner sc = new Scanner(System.in);
        int sizeOfArr = sc.nextInt();
        int[] arr = new int[sizeOfArr];
        System.out.println("Enter the elements :");
        for (int idx = 0; idx < arr.length; idx++) {
                arr[idx] = sc.nextInt();
        }

        System.out.println("Enter the index value where you want to place your element :");
        int index_Val = sc.nextInt();

        System.out.println("Enter the element :");
        int element = sc.nextInt();

        int[] newArr = new int[arr.length + 1];

        // insert at given index 
        newArr[index_Val] = element;
        for(int i = 0; i < index_Val; i++)
        {
            newArr[i] = arr[i];
        }
        for(int j = index_Val + 1; j < newArr.length; j++)
        {
            newArr[j] = arr[j-1];
        }

        // MOST Optimize
        
        // Copy and insert in one loop   
        // for (int i = 0; i < newArr.length; i++) {

        //     if (i < index_Val) {
        //         newArr[i] = arr[i];
        //     }
        //     else if (i == index_Val) {
        //         newArr[i] = element;
        //     }
        //     else {
        //         newArr[i] = arr[i - 1];
        //     }
        // }
        System.out.println("Given Array  : "+ Arrays.toString(arr));
        System.out.println("Update Array : "+ Arrays.toString(newArr));
    }
}