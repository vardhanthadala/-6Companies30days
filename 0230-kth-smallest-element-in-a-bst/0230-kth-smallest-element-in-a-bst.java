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
    public int kthSmallest(TreeNode root, int k) {
        int[] counter = new int[1];      // counter[0] = number of nodes visited
        int[] kSmallest = new int[1];    // kSmallest[0] = value of k-th smallest
        inorder(root, counter, k, kSmallest);
        return kSmallest[0];
    }

    private void inorder(TreeNode node, int[] counter, int k, int[] kSmallest) {
        if (node == null || counter[0] >= k) return;

        // Traverse left subtree
        inorder(node.left, counter, k, kSmallest);

        // Visit node
        counter[0]++;
        if (counter[0] == k) {
            kSmallest[0] = node.val;
            return;
        }

        // Traverse right subtree
        inorder(node.right, counter, k, kSmallest);
    }
}
