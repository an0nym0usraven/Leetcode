class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> ans = new ArrayList<>();
        int j = 0;
        int i = 0;
        while(j < words.length)
        {
            StringBuilder sb = new StringBuilder();
            boolean bool= true;
            int len = 0;
            while(bool && j < words.length)
            {
                if((len + words[j].length()) <= maxWidth)
                {
                    len += words[j].length()+1;
                    j++;
                }
                else
                {
                    bool = false;
                }
            }
            
            
            len--;
            int jump = j-i;
            jump--;
            int space = 0;
            
                int rest = 0;
                int def = maxWidth - (len);
                if( j !=words.length)
                {
                    rest = (jump >0 )?def % (jump):0;
                    space = (jump >0)?def / (jump):def;
                }
            
                while(i <j-1)
                {
                   sb.append(words[i]);
                   if(rest > 0)
                   {
                       addSpace(sb,space+2);
                       rest--;
                   }
                   else 
                   {
                       addSpace(sb, space+1);
                   }
                   i++;

                }
                sb.append(words[i++]);
                addSpace(sb, maxWidth -sb.length());
            ans.add(sb.toString());

        }

        return ans;
    }
    
     public void addSpace(StringBuilder sb, int space){
        int i = space;
        while(i>0)
        {
            sb.append(' ');
            i--;
        }
    }
}