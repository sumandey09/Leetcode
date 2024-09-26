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
import java.util.*;

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        // List to store node info: (node, x-coordinate, y-coordinate)
        List<int[]> nodes = new ArrayList<>();
        
        // DFS to populate the nodes list with coordinates
        dfs(root, 0, 0, nodes);

        // Sort nodes based on:
        // 1. x-coordinate (vertical order)
        // 2. y-coordinate (level)
        // 3. node value (for nodes on the same vertical and level)
        Collections.sort(nodes, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            } else if (a[1] != b[1]) {
                return Integer.compare(b[1], a[1]);
            } else {
                return Integer.compare(a[2], b[2]);
            }
        });

        // Group sorted nodes by their x-coordinate (vertical)
        List<List<Integer>> result = new ArrayList<>();
        int prevX = Integer.MIN_VALUE;
        for (int[] node : nodes) {
            if (node[0] != prevX) {
                prevX = node[0];
                result.add(new ArrayList<>());
            }
            result.get(result.size() - 1).add(node[2]);
        }

        return result;
    }

    // DFS to gather (x, y, val) for each node
    private void dfs(TreeNode node, int x, int y, List<int[]> nodes) {
        if (node == null) {
            return;
        }
        nodes.add(new int[]{x, y, node.val});
        dfs(node.left, x - 1, y - 1, nodes);
        dfs(node.right, x + 1, y - 1, nodes);
    }
}
