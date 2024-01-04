class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        
        for(int num : nums)
        {
            count.put(num, count.getOrDefault(num,0) + 1);
        }
        
        int res = 0;
        
        for(int i: count.values())
        {
            if(i == 1)
            {
                return -1;
            }
            res += Math.ceil((double) i/3);
        }
        return res;
    }
}