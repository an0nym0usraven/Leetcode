class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return 0;

        int step = 1;
        int maxIdx = Math.min(nums[0], n-1);
        int currIdx = 1;
        while (currIdx < n) 
        {
            if (maxIdx >= n - 1)
                return step;
            int nextMaxIdx = -1;
            for (int i = currIdx; i <= maxIdx; i++) 
            {
                nextMaxIdx = Math.max(nextMaxIdx, i + nums[i]);
            }
            
            currIdx = maxIdx + 1;
            maxIdx = Math.min(nextMaxIdx, n-1);
            step++;
        }
        return 0;
    }
}