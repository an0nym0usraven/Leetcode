class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i: nums)
        {
            if(hm.containsKey(i))
            {
                int v = hm.get(i);
                hm.put(i,v+1);
            }
            else
            {
                hm.put(i,1);
            }
        }
        
        int j = 0 ;
        for(int i:hm.keySet())
        {
            if(hm.get(i)>=2)
            {
                nums[j] = i;
                j++;
                nums[j] = i;
                j++;

            }
            else if(hm.get(i)==1)
            {
                nums[j] = i;
                j++;
            }
        }

        int nums1[] = new int[j];
        for(int i=0;i<j;i++)
        {
            nums1[i] = nums[i];
        }
        Arrays.sort(nums1);
        for(int i=0;i<j;i++)
        {
            nums[i]=nums1[i];
        }
        return j;
    }
}