class Solution {
      public int longestSemiRepetitiveSubstring(String s) {
      int ans = 0, c = 0;
      Stack<Character> st = new Stack<>();
          
      for(int i = 0; i < s.length(); i++) 
      {
        if(st.size() == 0) 
        {
            st.push(s.charAt(i));
        }
        else
        {
            if(st.peek() == s.charAt(i)) 
            {  
                if(c == 1) 
                {      
                     ans = Math.max(ans,  st.size());
                     int remove = st.remove(0);
                     while(st.get(0) != remove) 
                     {  
                          remove = st.remove(0);     
                     }
                         st.push(s.charAt(i));
                }
                else if(c == 0) 
                { 
                   c = 1;
                   st.push(s.charAt(i));
                   ans = Math.max(ans, st.size());
                }
            }
            else
            {  
                st.push(s.charAt(i));
                ans = Math.max(ans, st.size());     
            }    
        }
    }
          
    ans = Math.max(ans,  st.size());
    return ans;
 }
}