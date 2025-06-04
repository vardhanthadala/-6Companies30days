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
    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder, Integer.MAX_VALUE, new int[] { 0 }); //Initially when we start the roots upperbound is int+max
    }

    public TreeNode helper(int[] A, int bound, int[] i) {
 
        if (i[0] == A.length || A[i[0]] > bound)//No more elements || Out of bound
            return null;
        TreeNode root = new TreeNode(A[i[0]++]);
        root.left = helper(A, root.val, i);//When it goes to left the bound has to adjusted
        root.right = helper(A, bound, i);
        return root;
    }
}