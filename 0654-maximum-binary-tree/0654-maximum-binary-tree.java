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
    private TreeNode build(int[] nums, int start, int end) {
        if (start > end) return null;
        
        int indMax = start;
        for (int i = start + 1; i <= end; i++) {
            if (nums[i] > nums[indMax]) {
                indMax = i;
            }
        }
        
        TreeNode root = new TreeNode(nums[indMax]);
        root.left = build(nums, start, indMax - 1);
        root.right = build(nums, indMax + 1, end);
        
        return root;
    }
    
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums == null) {
            return null;
        }
        return build(nums, 0, nums.length - 1);
    }
}
