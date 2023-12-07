class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] aux = new int[k];
        int n = nums.length;
        
        for(int i=0; i<k; i++)
        {
            aux[i] = nums[n-k+i];
        }
        
        for(int i=n-k-1; i>=0; i--)
        {
            nums[i+k] = nums[i];
        }
        
        for(int i=0; i<k; i++)
        {
            nums[i] = aux[i];
        }
    }
}