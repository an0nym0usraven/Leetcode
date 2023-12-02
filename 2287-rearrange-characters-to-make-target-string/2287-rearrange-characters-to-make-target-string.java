class Solution {
    public int rearrangeCharacters(String s, String target) {
        int [] s_arr=new int[26];
        int [] t_arr=new int[26];
        int res=Integer.MAX_VALUE;
        
        for(int i=0; i<s.length(); i++)
        {
            char ch=s.charAt(i);
            s_arr[ch - 'a']++;
        }
        
        for(int i=0; i<target.length(); i++)
        {
            char ch=target.charAt(i);
            t_arr[ch - 'a']++;
        }
        
        for(int i=0; i<26; i++)
        {
            if(t_arr[i]!=0)
            {
                int y=s_arr[i];
                int x=t_arr[i];
                int min=y/x;
                if(min<=res)
                {
                  res=min;
                }    
            }
        }
        
        return res;
    }
}