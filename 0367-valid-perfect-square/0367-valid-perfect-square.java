class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 1;
        int right = 46340;
        int mid = 0;
        while(left <= right)
        {
            mid = (left + right) / 2;
            if(mid * mid < num)
            {
                left = mid + 1;
            } else if(mid * mid > num)
            {
                right = mid - 1;
            } else if(mid * mid == num)
            {
                return true;
            }
        }
        return false;
    }
}