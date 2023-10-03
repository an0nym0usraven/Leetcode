class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] countArr = new int[100];
        for(int i: nums)
        {
            countArr[i-1]++;
        }
        
        int pair = 0;
        for(int i: countArr)
        {
            if(i >= 2)
            {
                pair = pair + (i * (i-1)/2);
            }
        }
        return pair;
    }
}