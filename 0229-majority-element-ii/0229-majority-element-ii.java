class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
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
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i: hm.keySet())
        {
            if(hm.get(i) > n/3)
            {
                arr.add(i);
            }
        }
        return arr;
    }
}