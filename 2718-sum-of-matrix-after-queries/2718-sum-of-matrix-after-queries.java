class Solution {
    public long matrixSumQueries(int n, int[][] q) {
        long totalSum = 0, cNo = 0, rNo = 0;
        HashSet<Integer> r = new HashSet<>(), c = new HashSet<>();
        
        for(int indx = q.length-1; indx > - 1 ; indx--)
        {
            var qs = q[indx];
            if(qs[0] == 0 && !r.contains(qs[1]))
            {
                r.add(qs[1]);
                rNo++;
               totalSum += (qs[2] * (n-cNo));
      
            }
            else if(qs[0] == 1 && !c.contains(qs[1]))
            {
                c.add(qs[1]);
                cNo++;
               totalSum += (qs[2] * (n- rNo));
            }
            
        }
        return totalSum;
    }
}