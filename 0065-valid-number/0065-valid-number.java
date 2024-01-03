class Solution {
    public boolean isNumber(String s) {
        boolean numberFound = false;
        boolean decimalFound = false;
        
        int i = 0;
        if ((s.charAt(i) == '+') || (s.charAt(i) == '-'))
        {
            i += 1;
        }

        while (i < s.length())
        {
            char c =  s.charAt(i);
            if ((((int)c >= 97) && ((int)c <= 122)) || (((int)c >= 65) && ((int)c <= 90)))
            {
                if ((c == 'e') || (c == 'E')) 
                {
                    return numberFound && isValidInteger(s.substring(i+1));
                } 
                else 
                {
                    return false;
                }
            }
            else if (c == '.') 
            {
                if (decimalFound)
                    return false;
                else
                    decimalFound = true;
            }
            else if ((c == '+') || (c == '-')) 
            {
                return false;
            }
            else 
            {
                numberFound = true;        
            } 
            i = i + 1;
        }
        return numberFound;
    }

    private boolean isValidInteger(String sSubPart) 
    {
        if (sSubPart.isEmpty())
        {
            return false;
        }
        
        boolean numberFound = false;
        int i = 0;
        if ((sSubPart.charAt(i) == '+') || (sSubPart.charAt(i) == '-'))
        { 
            i += 1;
        }
        
        while (i < sSubPart.length()) 
        {
            char c = sSubPart.charAt(i);
            if ((((int)c >= 48) && ((int)c <= 57))) 
            {
                numberFound = true;
            }
            else 
            {
                return false;
            }
            i = i + 1;
        }
        
        return numberFound;
    }
    
}