class Solution {
    private class Pair{
        char bracket;
        int idx;
        public Pair(char bracket, int idx) 
        {
            this.bracket = bracket;
            this.idx = idx;
        }
    }

    private void validParentheses(int len, String s, Stack<Pair> st) 
    {
        for(int i=0;i<len;i++) 
        {
            char ch = s.charAt(i);
            if(st.isEmpty() || ch == '(') 
            {
                st.push(new Pair(ch, i));
            } else {
                char top = st.peek().bracket;
                if(top == '(') 
                {
                    st.pop();
                }
                else 
                {
                    st.push(new Pair(ch, i));
                }
            }
        }
    }

    public int longestValidParentheses(String s) 
    {
        int len = s.length();
        Stack<Pair> st = new Stack<>();
        validParentheses(len, s, st);
        
        int longest = 0;

        int prev = -1;

        for(Pair p: st) 
        {
            int idx = p.idx;
            longest = Math.max(longest, idx-prev-1);
            prev = idx;
        }
        
        longest = Math.max(longest, len-prev-1);

        return longest;
    }
}