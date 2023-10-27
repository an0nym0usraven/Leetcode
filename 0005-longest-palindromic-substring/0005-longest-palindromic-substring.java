class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String res = "";
        for(int i=0;i<n-1;i++){
            String t = check(s,i,i,n);
            if(t.length()>res.length()){
                res = t;
            }

            t = check(s,i,i+1,n);
            if(t.length()>res.length()){
                res = t;
            }
        }
        
        String t = check(s,n-1,n-1,n);
        if(t.length()>res.length()){
            res = t;
        }
        return res;
    }
    public String check(String s, int p1, int p2, int n){
        while(p1>=0 && p2<n && s.charAt(p1)==s.charAt(p2)){
            p1--; 
            p2++; 
        }
        return s.substring(p1+1,p2); 
    }
}