// Insert a new value in an array
// array -> {10, 20, 30, 40, 50}
// insert value = 90 at 2nd position
import java.util.Arrays;

public class insertion_Array
{
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40 ,50};
        int position = 2;
        int value = 90;

        int newArr[] = new int[arr.length+1];

        for(int i=0; i<position;i++)
        {
            newArr[i]=arr[i];
        }

        newArr[position] = value;

        for(int i = position; i < arr.length; i++)
        {
            newArr[i+1] = arr[i];
        }

        System.out.print("Previous Array "+Arrays.toString(arr));
        System.out.println("");
        System.out.print("New next Array "+Arrays.toString(newArr));
    }
}