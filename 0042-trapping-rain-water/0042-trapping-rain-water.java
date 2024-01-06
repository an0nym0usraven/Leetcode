class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1, lmax = Integer.MIN_VALUE, rmax = Integer.MIN_VALUE, ans = 0;
        
        while (left < right) 
        {
            lmax = Math.max(lmax, height[left]);
            rmax = Math.max(rmax, height[right]);
            ans += (lmax < rmax) ? lmax - height[left++] : rmax - height[right--];
        }
        
        return ans;
    }
}