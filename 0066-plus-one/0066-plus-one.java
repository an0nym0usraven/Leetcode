class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int lastDigit = digits[n-1];
        
        if(lastDigit < 9)
        {
            digits[n-1] = lastDigit + 1;
            return digits;
        }
        else
        {
            digits[n-1] = 0;
            for(int i=n-2; i>=0; i--)
            {
                if(digits[i] < 9)
                {
                    digits[i] = digits[i] + 1;
                    return digits;
                }
                else
                {
                    digits[i] = 0;
                }
            }
        }
        
        digits = new int[n+1];
        digits[0] = 1;
        return digits;
    }
}