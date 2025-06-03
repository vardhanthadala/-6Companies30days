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

    TreeNode firstElement = null;
    TreeNode secondElement = null;
    TreeNode prevElement = null;

    public void recoverTree(TreeNode root) {

        // In order traversal to find the two elements
        traverse(root);

        // Swap the values of the two nodes
        int temp = firstElement.val;
        firstElement.val = secondElement.val;
        secondElement.val = temp;
    }

    private void traverse(TreeNode root) {
        if (root == null)
            return;

        traverse(root.left);

        if (prevElement != null && prevElement.val >= root.val) {
            if (firstElement == null) {
                firstElement = prevElement;
            }
            secondElement = root;
        }

        // Update prevElement to current node
        prevElement = root;

        traverse(root.right);
    }

}