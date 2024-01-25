class Solution 
{
    public boolean isUgly(int num) 
    {
        if (num == 0) return false;
        for (int i = 2; i <= 5; i += i-1) 
            while (num % i == 0)
                num /= i;
        return num == 1;
    }
}