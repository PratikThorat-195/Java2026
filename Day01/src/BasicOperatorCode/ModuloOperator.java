package BasicOperatorCode;

public class ModuloOperator
{
  public static void main(String[] args)
  {
	  int a =10;
	  int b= 20;
	  int c = a % b;
	  int res = 10 % 3;
	  System.out.println("Modulus of a % b "+c);
	  System.out.println("Modulus of res = "+res);
  }
}

/*
 How Modulus operator '%' works?
 The operation a % b (read as "a modulo b") finds the remainder r in the equation: 
 a = q * b + r
 	a is the dividend (the number being divided).
	b is the divisor (the number you are dividing by, which must be non-zero).
	q is the quotient (the whole number result of the division).
	r is the remainder (the result of the modulo operation). 
	
	The modulus operator yields r, the remainder, when a is divided by b.

	Properties of Modulus operator:
  1)Range of Results:
	The result of a % b will always be in the range [0, b-1].
	If a is positive and b is positive, the result will be positive.
	If a is negative or b is negative, the sign of the result depends on the programming language's convention.
 
  2)Division by Zero:
	Division by zero is undefined in mathematics. Similarly, the modulus operator by zero is usually 
	undefined or throws an error in programming languages.
  
  3)Equality to Dividend:
	If a is less than b, a % b will be equal to a.
*/

