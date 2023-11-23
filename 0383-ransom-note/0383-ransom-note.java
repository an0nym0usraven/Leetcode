class Solution {
    public boolean canConstruct(String ransomNote, String magazine) 
    {
            int n1 = ransomNote.length();
            int n2 = magazine.length();
    
            Map<Character, Integer> map1 = new HashMap<>();
            Map<Character, Integer> map2 = new HashMap<>();
    
            for(int i=0; i < n1; i++)
            {
                char ch1 = ransomNote.charAt(i);
                map1.put(ch1, map1.getOrDefault(ch1,0) + 1);
            }
    
            for(int j=0; j < n2; j++)
            {
                char ch2 = magazine.charAt(j);
                map2.put(ch2, map2.getOrDefault(ch2,0) + 1);
            }
    
            for(int i=0; i<n1 ; i++){
                char ch1 = ransomNote.charAt(i);
                if(!map2.containsKey(ch1) || (map1.get(ch1)> map2.get(ch1))) return false;
            }
            return true;
    }
}