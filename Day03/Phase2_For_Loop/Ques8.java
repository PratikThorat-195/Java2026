// 8. Print all prime numbers between 1 and 100.
public class Ques8
{
    public static void main(String[] args) {
        
        for(int i=1; i<=100; i++)
        {
            int count = 0;

            for(int j = 1; j<=i; j++)
            {
                if(i % j == 0)
                count++;
            }
            if(count == 2)
            System.out.println(i);
        }
    }
}

// output
/*
2
3
5
7
11
13
17
19
23
29
31
37
41
43
47
53
59
61
67
71
73
79
83
89
97  
 */