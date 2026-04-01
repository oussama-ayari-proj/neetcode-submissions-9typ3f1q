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
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return root;
        Queue<TreeNode> bfs=new LinkedList<>();
        bfs.add(root);
        while(!bfs.isEmpty()){
            TreeNode cur=bfs.poll();
            if(cur.right!=null && cur.left!=null){//not a leaf node
                TreeNode tmp = cur.right;
                cur.right=cur.left;
                cur.left=tmp;
            }else if(cur.right==null && cur.left!=null){
                cur.right=cur.left;
                cur.left=null;
            }else if(cur.right!=null){
                cur.left=cur.right;
                cur.right=null;
            }
            if(cur.right!=null)
                bfs.add(cur.right);
            if(cur.left!=null)
                bfs.add(cur.left);
        }
        return root;
    }
}
