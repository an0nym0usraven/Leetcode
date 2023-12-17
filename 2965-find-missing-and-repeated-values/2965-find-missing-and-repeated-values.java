class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        
        int[] freq = new int[n*n+1];
        for(int[] arr:grid){
            for(int a:arr){
                freq[a]++;
            }
        }
        int[] ans = new int[2];
        for(int i=0; i<freq.length; i++){
            if(freq[i]==2){
                ans[0]=i;
            }
            if(freq[i]==0){
                ans[1]=i;
            }
        }
        return ans;
    }
}