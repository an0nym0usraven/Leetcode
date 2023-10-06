class Solution {
    public int integerBreak(int n) {
        if(n <= 3)
        {
            return n-1;
        }
        int q = n/3, r = n%3;
        
        int res = 0;
        
        if (r == 0)
        {
            res = (int) Math.pow(3, q);
        }
        else if(r == 1)
        {
            res = (int) Math.pow(3, q-1)*4;
        }
        else
        {
            res = (int) Math.pow(3, q)*2;
        }
        
        return res;
    }
}