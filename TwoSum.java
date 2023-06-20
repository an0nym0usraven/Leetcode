// Aakanksha is pro coder 🔥

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum
{
    static int[] twoSum(int[] arr, int t)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if (arr[i] + arr[j] == t)
                return (new int[] {arr[i],arr[j]});
            }
        }
        return (new int[]{});
    }

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter length of array: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        for(int i = 0; i<n; i++)
        {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter target number: ");
        int target = sc.nextInt();

        System.out.println(Arrays.toString(twoSum(array, target)));
    }
}