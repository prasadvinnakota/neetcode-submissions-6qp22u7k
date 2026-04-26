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
    int count = 0;
    public int goodNodes(TreeNode root) {
        int maxSeenSoFar = Integer.MIN_VALUE;
        dfs(root, maxSeenSoFar);

        return count;
    }

    private void dfs(TreeNode node, int maxSeenSoFar)
    {
        if(node == null)
        {
            return;
        }

        if(node.val >= maxSeenSoFar)
        {
            maxSeenSoFar = Math.max(maxSeenSoFar, node.val);
            count++;
        }

        dfs(node.left, maxSeenSoFar);
        dfs(node.right, maxSeenSoFar);


    }
}
