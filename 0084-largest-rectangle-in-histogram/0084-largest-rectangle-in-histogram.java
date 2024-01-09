class Solution {
    public int largestRectangleArea(int[] heights) {   
        Stack<Integer> stk = new Stack<>();
        int max = 0;
        for(int i = 0; i <= heights.length; i++)
        {

            while(!stk.empty() && (i == heights.length || heights[stk.peek()] >= heights[i])){
                int idx = stk.pop();

                int left = stk.empty() ? 0: stk.peek() + 1;
            
                max = Math.max(max, heights[idx]*(i-1 - left + 1));
            }
            stk.push(i);
        }
        return max;
    }
}