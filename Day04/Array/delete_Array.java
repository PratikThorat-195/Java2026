import java.util.Arrays;

public class delete_Array
{
    public static void main(String[] args)
    {
        int arr[] = {10, 20, 30, 40, 50};

        int position = 2;

        int newArr[] = new int[arr.length-1];

        for(int i = 0; i< position; i++)
        {
            newArr[i] = arr[i];
        }    

        for(int i= position + 1; i < arr.length; i++)
        {
            newArr[i-1] = arr[i];
        }
        System.out.print("Previous Array "+ Arrays.toString(arr));
        System.out.println("");
        System.out.print("delete value Array "+Arrays.toString(newArr));
    }
}