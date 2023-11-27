class Solution {
   public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hm = new HashMap<>();
    
        String strList[] = s.split(" ");
       
        if(pattern.length() != strList.length){
            return false;
        }
               
        for(int i=0;i<pattern.length();i++){
            if(hm.containsKey(pattern.charAt(i))){
                if(!hm.get(pattern.charAt(i)).equals(strList[i])){
                    return false;
                }
            }
            
            else{
                if(hm.containsValue(strList[i])){
                    return false;
                }
                hm.put(pattern.charAt(i), strList[i]);
            }
        }
        
        return true;
    }
}