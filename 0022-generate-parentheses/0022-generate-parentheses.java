class Solution {
     public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(ans,0,0,new StringBuilder(),n);
        return ans;
    }

    public static void helper(List<String> ans , int i, int j, StringBuilder s , int n )
    {
        if(i==n && j == n)
        {
            ans.add(s.toString());
        }
        if(i < n)
        {
            helper(ans, i+1, j, s.append('('), n );
            s.deleteCharAt(s.length() - 1);
        }
        if(j < n && i>j)
        {
            helper(ans, i, j+1, s.append(')'), n );
            s.deleteCharAt(s.length() - 1);
        }
    }
}