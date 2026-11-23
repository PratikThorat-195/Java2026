
import java.util.Scanner;

// Search an element
public class search_element
{
    public static void main(String[] args) {
        System.out.println("Enter the Size of array: ");
        Scanner sc =new Scanner(System.in);
        int sizeOfArr = sc.nextInt();
        int[] arr = new int[sizeOfArr];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to search");
        int search_element = sc.nextInt();

        for(int idx = 0; idx < arr.length; idx++)
        {
                if(arr[idx] == search_element)
                {
                    System.out.println("Yes given Element: "+arr[idx]+" is at index : "+ idx );
                    break;
                }
                else {
                    if(idx == arr.length-1)
                    {
                        System.out.println("Element not exist");
                    }
                }
                
        }        
    }
}