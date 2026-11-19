// Operations on array
public class access_Array
{
    public static void main(String[] args) {
        // Access the elements of the array
        // we can access the element through index
        
        //       arr[] -> | 10 | 20 | 30 | 40 | 50 | 
        // index value ->    0    1    2    3    4
        //                   ^
        //                   |
        //                arr[0]

        // so, array access my index through this syntax:
        // arr[0] here 0 is index place value, so it will print that 0th index value. 

    int arr[] = {10, 20, 30, 40, 50};
    System.out.println("element in 0th index "+arr[0]);
    System.out.println("element in 1st index "+arr[1]);
    System.out.println("element in 2nd index "+arr[2]);
    System.out.println("element in 3rd index "+arr[3]);
    System.out.println("element in 4th index "+arr[4]);
    }
}