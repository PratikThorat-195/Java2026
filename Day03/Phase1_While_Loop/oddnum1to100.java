public class oddnum1to100
{
    public static void main(String agrs[])
    {
        System.out.println("Odd number from 1 to 100");
        int num = 1;
        while(num <= 100)
        {
            if(num % 2 != 0)
            {
                System.out.println(num);
            }
            num++;
        }
    }
} 