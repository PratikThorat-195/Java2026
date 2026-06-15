import java.util.Scanner;

public class ProductOfDigits 
{
	public static void main(String[] arg)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Digits for Product of all digit : ");
		int digit = scan.nextInt();
		
		int res = productOfAllDigit(digit);
		System.out.println(res);
	}
	
	private static int productOfAllDigit(int digit)
	{
		int product = 1;
		while(digit > 0)
		{
			product = product * (digit % 10);
			digit = digit / 10;
		}
		System.out.println("product is : "+product);
		return product;
	}
}
