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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot==null || isSameTree(root,subRoot)) return true;
        if(root==null) return false;
        return isSubtree(root.right,subRoot) || isSubtree(root.left,subRoot);
    }
    public boolean isSameTree(TreeNode q, TreeNode p){
        if(q==null && p ==null)
            return true;
        if(q==null || p==null || q.val!=p.val)
            return false;
        return isSameTree(q.left,p.left) && isSameTree(q.right,p.right);
    }
}
