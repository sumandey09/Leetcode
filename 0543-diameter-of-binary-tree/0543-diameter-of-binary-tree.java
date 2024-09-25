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
    public int maxDiameter = 0;
    public int calculateDepth(TreeNode node) {
            if (node == null) return 0;
            int leftDepth = calculateDepth(node.left);
            int rightDepth = calculateDepth(node.right);
            maxDiameter = Math.max(maxDiameter, leftDepth + rightDepth);
             return 1 + Math.max(leftDepth, rightDepth);


    }
    public int diameterOfBinaryTree(TreeNode root) {
        calculateDepth(root);
        return maxDiameter;
    }
}