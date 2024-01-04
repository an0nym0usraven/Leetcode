class Solution {
    public int lengthOfLongestSubstring(String s) {
        int r=0;
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        
        for(int i=0;i<arr.length;i++){
            int place=i+1;
            int max=0;
            boolean b=false;
            
            while(place<arr.length){
                
                for(int j=i;j<place;j++){
                    if(arr[place]==arr[j]){
                       
                        j=place;
                        b=true;
                    }
                }
                if(b){
                    max++;
                    b=false;
                    break;
                }
                
                place++;
                
                
                if(place==arr.length){
                    max+=2;
                }else{
                     max++;
                }
               
            }
            
            if(r<max){
                r=max;
            }
            
        }
        if(arr.length==1){
            r=1;
        }
        
        
        return r;
    }
}