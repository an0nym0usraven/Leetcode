class Solution {
    public List<List<Integer>> permute(int[] nums) {
        boolean[] isTaken = new boolean[nums.length];
        List<List<Integer>> lol = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        helper(lol,list,isTaken,nums);
        return lol;

    }
    
    public static void helper(List<List<Integer>> lol, ArrayList<Integer> list, boolean[] isTaken, int[] nums){

        boolean isAllTrue = true;
        for(boolean f : isTaken)
        if(f == false)
        isAllTrue = false;
        if(isAllTrue)
        {
            lol.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=0; i<nums.length; i++)
        {
            if(isTaken[i]==false)
            {
                list.add(nums[i]);
                isTaken[i] = true;
                helper(lol,list,isTaken,nums);
                isTaken[i] = false;
                list.remove(list.size()-1);
            }
        }

    }
}