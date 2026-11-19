/*  #  Definition 
    -> An array is a collection of elements of the same data type stored in contiguous memory locations. 
    -> It allows multiple values to be stored under a single name and accessed using an index.
    -> Arrays can hold both primitive types (like int, char, boolean, etc.) and objects (like String, Integer, etc.)
    -> When we use arrays of primitive types, the elements are stored in contiguous locations. For non primitive types, 
       references to items are stored at contiguous locations.
    -> After creating an array, its size is fixed; we can not change it.
*/
public class Array_info
{
    public static void main(String[] args) 
    {
        // primitive data type
        int[] arr = {10,20,30,40,50};
        int n = arr.length;

        System.out.print("Primitive Array ->");
        for(int i=0; i< n; i++)
        {
            System.err.print(arr[i] +" ");
        } 

        System.out.println("");

        String arrName[] = {"pp","tt","qq"}; 
        int nn = arrName.length;

        System.out.print("Reference Array ->");
        for(int i=0; i < nn; i++)
        {
            System.out.print(arrName[i] +" ");
        }

    }
}

//  Output
/*
    Primitive Array ->10 20 30 40 50 
    Reference Array ->pp tt qq 
 */