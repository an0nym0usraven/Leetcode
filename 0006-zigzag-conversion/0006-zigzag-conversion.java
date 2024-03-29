class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1)
            return s;
        int j,inc = 2*numRows-2,mid=0,i=0,stlen = s.length();
        StringBuilder builder = new StringBuilder(stlen);
        for(i=0;i<numRows;i++){
            j = i;
            while(j < stlen){
                builder.append(s.charAt(j));
                j += inc;
                mid = j-(2*i);
                if(i > 0 && i < numRows-1 && mid < stlen)
                    builder.append(s.charAt(mid));
            }
        }
        return builder.toString();
    }
}