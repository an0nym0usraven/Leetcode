class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }

        int[] mp = new int[26];

        for(int i=0;i<s.length();i++)
        {
            mp[s.charAt(i)-'a']++;
        }
        for(int j=0;j<t.length();j++)
        {
            mp[t.charAt(j)-'a']--;
        }

        for(int k:mp)
        {
            if(k!=0)
            {
                return false;
            }
        }
        return true;
    }
}