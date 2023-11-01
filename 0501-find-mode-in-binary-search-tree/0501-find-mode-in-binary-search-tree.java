/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void dfs(TreeNode node, Map<Integer, Integer> c) 
    {
        if (node == null) {
            return;
        }
        
        c.put(node.val, c.getOrDefault(node.val, 0) + 1);
        dfs(node.left, c);
        dfs(node.right, c);
    }
    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> c = new HashMap();
        dfs(root, c);
        
        int maxFreq = 0;
        
        for(int key: c.keySet())
        {
            maxFreq = Math.max(maxFreq, c.get(key));
        }
        
        List<Integer> res = new ArrayList();
        for(int key: c.keySet())
        {
            if(c.get(key) == maxFreq)
            {
                res.add(key);
            }
        }
        
        int[] result = new int[res.size()];
        for(int i=0; i<res.size(); i++)
        {
            result[i] = res.get(i);
        }
        
        return result;
    }
}