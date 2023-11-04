class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j = s.length() - 1;
        
        while(i < j)
        {
            char a = s.charAt(i);
            char b =s.charAt(j);
            
            if(!(Character.isLetter(a) || Character.isDigit(a)))
            {
                i++;
                continue;
            }
            
            if(!(Character.isLetter(b) || Character.isDigit(b)))
            {
                j--;
                continue;
            }
        
            if(Character.toLowerCase(a) != Character.toLowerCase(b))
            {
                return false;
            }
            else
            {
                i++;
                j--;
            }
        }
        
        return true;
    }
}