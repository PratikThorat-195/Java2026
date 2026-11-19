
import java.util.Arrays;
import java.util.Scanner;
// 2) Insert Operations
// ● Insert at end
// ● Insert at beginning
// ● Insert at a given index

public class insertion_operation
{
    public static void main(String[] args) {
        System.out.println("Enter the size of arrray : ");
        Scanner sc = new Scanner(System.in);
        
        int sizeOfArr = sc.nextInt();
        
        int[] arr = new int[sizeOfArr];
        for(int idx = 0; idx < sizeOfArr ;idx++)
        {
                arr[idx] = sc.nextInt(); 
        }

        System.out.println("Given Arrray : "+Arrays.toString(arr));

        System.out.println("Insert a value at end :");
        int endVal = sc.nextInt();

       
        int[] newArr = new int[arr.length+1];

        for(int i = 0; i < newArr.length-1; i++)
        {
            newArr[i] = arr[i];
        }
        
         // insert at end 
        newArr[newArr.length-1] = endVal;
       
        

        System.out.print("arr : "+Arrays.toString(arr));
        
        System.out.println("");

        System.out.print("new array: "+Arrays.toString(newArr));
    }

    
}