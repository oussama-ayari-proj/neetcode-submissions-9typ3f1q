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
        if(root== null){
            return false;
        }
        else if(root.val == subRoot.val){
            if(isMatch(root,subRoot)){
                return true;
            }
        }
        return isSubtree(root.right,subRoot) || isSubtree(root.left, subRoot); 
        }

    private boolean isMatch(TreeNode p, TreeNode q){
        if( p == null && q == null){
            return true;
        }else if(p == null){
            return false;
        }else if(q == null){
            return false;
        }else{
            return p.val == q.val && isMatch(p.right,q.right) && isMatch(p.left,q.left);
        }
    }
}
