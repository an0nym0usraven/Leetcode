class Solution {
    public int findSum(int n)
    {
        int sum=0;
        while(n != 0)
        {
            sum += (n%10);
            n /= 10;
        }
        return sum;
    }
    public int addDigits(int num) {
        
        while(num > 9)
        {
             num = findSum(num);
        }
        return num;
    }
}