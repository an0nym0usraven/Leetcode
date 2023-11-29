class Solution {
    public boolean isHappy(int n) {
        if (n < 1) 
        {
            return false;
        }

        int sum = 0;
        int count = 0;

        do {
            sum = 0; 
            while (n > 0) 
            {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }

            n = sum; 
            count++;

            if (n == 1) 
            {
                return true;
            }
        } 
        while (count <= 10);

        return false;
    }
}