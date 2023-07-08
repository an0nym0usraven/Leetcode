class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i: nums)
        {
            if(!hm.containsKey(i))
            {
                hm.put(i, 1);
            }
            else
            {
                hm.put(i, hm.get(i) + 1);
            }
        }

        for(int j: nums)
        {
            if(hm.get(j) > nums.length/2)
            {
                return j;
            }
        }
        
        return 0;
    }
}
