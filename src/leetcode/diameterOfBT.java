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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;
        //get the height of left and right subtrees
        int lHeight = height(root.left);
        int rHeight = height(root.right) ;
        
        //get the diameter of left and right sub-trees
        int lDiameter = diameterOfBinaryTree(root.left);
        int rDiameter = diameterOfBinaryTree(root.right);
        
        /*
        return max of the following three
        1. Diameter of right subtree
        2. Diameter of left subtree
        3. Height of left subtree + Height of right subtree inclusive of the root
        */
        return Math.max(lHeight + rHeight, Math.max(lDiameter,rDiameter));
        
    }
    /* calculates the height inclusive of the root*/
    public int height(TreeNode node)
    {
        if(node == null)
            return 0;
        int leftHeight = height(node.left) ;
        int rightHeight = height(node.right) ;
        
        return Math.max(leftHeight,rightHeight) + 1 ;
    }
}
