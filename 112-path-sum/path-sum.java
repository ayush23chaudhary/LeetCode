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
    public boolean hasPathSum(TreeNode root, int targetSum) { 
        if(root==null){
            return false;
        }
        return path(root,targetSum,0);
    }
    public  boolean path(TreeNode root, int sum,int curr){
        if(root==null){
            return false;
        }
        if(sum-root.val==curr && root.left==null && root.right==null){
            return true;
        }
        return path(root.left,sum,curr+root.val) || path(root.right,sum,curr+root.val);

    }
}