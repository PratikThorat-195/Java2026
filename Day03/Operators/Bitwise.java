// Bitwise operator
public class Bitwise
{
    public static void main(String[] agrs)
    {
        int a=12, b=10;
        System.out.println("a&b : "+(a&b)); // a&b : 8
        System.out.println("a|b : "+(a|b)); // a|b : 14
        System.out.println("a^b : "+(a^b)); // a^b : 6
        System.out.println("a~b : "+(~a));  // a~b : -13 
    } 
}

/*
Bitwise AND Operator - &
1 & 1 = 1
1 & 0 = 0
0 & 1 = 0 
0 & 0 = 1

Bitwise OR Operator - |
1 | 1 = 1
1 | 0 = 1
0 | 1 = 1
0 | 0 = 0

Bitwise XOR Operator - ^
1 ^ 1 = 0
1 ^ 0 = 1
0 ^ 1 = 1
0 ^ 0 = 0

Different bits → 1
Same bits → 0

*/