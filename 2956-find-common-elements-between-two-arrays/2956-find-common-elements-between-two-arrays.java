class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
       int n1=nums1.length;
       int n2=nums2.length; 
        
       int[] res = new int[2];
        
       int count1=0,count2=0;
        
       for(int i=0;i<n1;i++)
       {
          for(int j=0;j<n2;j++)
          {
              if(nums1[i]==nums2[j])
              {
                count1++;
                break;
              }
          }
       }
        
       res[0]=count1;
        
       for(int j=0;j<n2;j++)
       {
          for(int i=0;i<n1;i++)
          {
              if(nums2[j]==nums1[i])
              {
                count2++;
                break;
              }
          }
       }
       res[1]=count2;
       return res;
    }
}