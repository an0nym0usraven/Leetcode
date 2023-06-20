import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while(temp>0)
        {
            int last = temp%10;
            sum = sum + factorial(last);
            temp /= 10;
        }

        if(sum == num)
        {
            System.out.println("The given number is a strong number.");
        }
        else{
            System.out.println("The given number is not a strong number.");
        }
    }

    static int factorial(int n)
    {
        if(n==0)
            return 1;
        else
            return n*factorial(n-1);
    }
}
