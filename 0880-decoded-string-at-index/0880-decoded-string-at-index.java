class Solution {
    public String decodeAtIndex(String s, int k) {
        long length = 0;
        
        for(char ch: s.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                length = length * (ch - '0');
            }
            else
            {
                length++;
            }
        }
        
        for(int i = s.length() - 1; i>=0; i--)
        {
            char ch = s.charAt(i);
            if(Character.isDigit(ch))
            {
                length = length / (ch - '0');
                k %= length;
            }
            else
            {
                if(k == 0 || length == k)
                {
                    return "" + s.charAt(i);
                }
                length--;
            }
        }
        
        return "";
    }
}