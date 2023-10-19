class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> a = new Stack<>();
        
        for(char ch:s.toCharArray())
        {
            if(ch == '#')
            {
                if(!a.isEmpty())
                a.pop();
            }
            else
            {
                a.push(ch);
            }
        }
        
        Stack<Character> b = new Stack<>();
        
        for(char ch:t.toCharArray())
        {
            if(ch == '#')
            {
                if(!b.isEmpty())
                b.pop();
            }
            else
            {
                b.push(ch);
            }
        }
        
        if(a.size() != b.size())
        {
            return false;
        }
        
        while(a.empty() == false)
        {
            if(a.peek() == b.peek())
            {
                a.pop();
                b.pop();
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}