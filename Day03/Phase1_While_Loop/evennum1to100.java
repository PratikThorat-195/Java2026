public class evennum1to100
{
    public static void main(String args[])
    {
        System.out.println("This is the even numbers from 1 to 100");
        int num = 1;
        while (num <= 100)
        {
            if(num % 2 == 0)
            {
                System.out.println(num);
            }
             num++;
        }
    }
}