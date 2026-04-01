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
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int left=depth(root.left);
        int right=depth(root.right);
        if(Math.abs(left-right)<=1)
            return isBalanced(root.right)&&isBalanced(root.left);
        else return false;
    }
    public int depth(TreeNode node){
        if(node==null) return 0;

        Queue<TreeNode> q=new LinkedList<>();

        q.offer(node);
        int res=0;
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode cur=q.poll();
                if(cur.left!=null)
                    q.offer(cur.left);
                if(cur.right!=null)
                    q.offer(cur.right);
            }
            res++;
        }

        return res;
    }
}
