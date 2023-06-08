import java.util.Scanner;

class Kaprekar
{
    static boolean check(int n)
    {
        if(n==1)
        {
            return true;
        }
        int sq = n*n;
        int count = 0;

        //count number of digits in number square
        while(sq!=0)
        {
            sq = sq/10;
            count++;
        }

        sq = n*n;

        for(int i=1; i<count; i++)
        {
            int eq = (int) Math.pow(10,i);
            if(eq==n)
            {
                continue;
            }
            else
            {
                int sum = sq/eq + sq%eq;
                if(sum == n)
                {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(num + " : " + check(num));
    }
}
