package com.company;
import java.util.*;

public class SeperateTheDigitsInAnArray {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++)
        {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            while(nums[i]>0)
            {
                int t = nums[i] % 10;
                nums[i] /= 10;
                temp.add(t);
            }
            for(int j=temp.size()-1; j>=0; j--)
            {
                result.add(temp.get(j));
            }
        }
        int[] answer = new int[result.size()];
        for(int j=0; j<result.size(); j++)
        {
            answer[j] = result.get(j);
        }
        return answer;
    }
}
