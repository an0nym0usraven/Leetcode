class Solution {
    public char findTheDifference(String s, String t) {
        int res = 0;

        for(char ch: s.toCharArray())
        {
            res = res ^ ch;
        }
        
        for(char ch: t.toCharArray())
        {
            res = res ^ ch;
        }
        
        return  (char) res;
    }
}