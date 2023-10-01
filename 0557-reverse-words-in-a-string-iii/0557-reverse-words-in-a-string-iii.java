class Solution {
    public String reverseWords(String s) {
        String[] s_arr = s.split(" ");
        String res = "";
        for(String str: s_arr)
        {
            for(int i=str.length()-1; i>=0; i--)
            {
                res += str.charAt(i);
            }
            res += " ";
        }
        return res.trim();
    }
}