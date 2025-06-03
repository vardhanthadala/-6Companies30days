/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        // 1.node doesn't have left or right - return null
        if (root == null) {
            return null;
        }
        if (key < root.val) {//If key is less than root’s value → look in the left subtree.
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {//If key is greater than root’s value → look in the right subtree.
            root.right = deleteNode(root.right, key);
        } else {
            // 2.node only has right subtree- return the right subtree
            if (root.left == null) {
                return root.right;
                // 3.node only has left subtree- return the left subtree
            } else if (root.right == null) {
                return root.left;
            }
            // 4.node has both left and right - find the minimum value in the right subtree,Replace the value of the current  node with the min value, then recursively delete the minimum value in the right subtree
            TreeNode minNode = findMin(root.right);
            root.val = minNode.val;
            root.right = deleteNode(root.right, root.val);
        }
        return root;
    }

    private TreeNode findMin(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
}