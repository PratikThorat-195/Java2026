import java.util.Scanner;

public class Addition 
{
    public static void main(String[] agrs)
    {
        System.out.println("Give any data type number (like -> int, float, long, double) for addition"); 

        Scanner scan = new Scanner(System.in);

        System.out.print("First number : ");
        String value1 = scan.nextLine();

        System.out.print("Second number : ");
        String value2 = scan.nextLine();

        try{
            int n1 = Integer.parseInt(value1);
            int n2 = Integer.parseInt(value2);
            addition(n1, n2);
        } catch (Exception e){
            try{
                float fn1 = Float.parseFloat(value1);
                float fn2 = Float.parseFloat(value2);
                addition(fn1, fn2);
            } catch (Exception ex){
                double dn1 = Double.parseDouble(value1);
                double dn2 = Double.parseDouble(value2);
                addition(dn1, dn2);
            }
        }
       

    }
         // Logic
        public static void addition(int n1, int n2)
        {
            int sum = n1 + n2;
            System.out.println(" Integer number addition is : "+ sum);
        }

        public static void addition(float fn1,float fn2)
        {
            float fsum = fn1 + fn2;
            System.out.println(" Float number addition is : "+ fsum);
        }

        public static void addition(double dn1,double dn2)
        {
            double dsum = dn1 + dn2;
            System.out.println(" Double number addition is : "+ dsum);
        }

}
        
        