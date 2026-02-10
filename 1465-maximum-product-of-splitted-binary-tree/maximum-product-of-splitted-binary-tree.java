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
    static long totSum;
    static long maxp;
    static int mod=1000000000+7;
    public int maxProduct(TreeNode root) {
        maxp = 0;
        totSum=totSum(root);
        dfs(root);
        return (int)(maxp%mod);
        
    }
    public long totSum(TreeNode node){
        if(node==null){
            return 0;
        }
        return node.val+totSum(node.left)+totSum(node.right);
    }
    public long dfs(TreeNode node){
        if(node==null){
            return 0;
        }
        long left= dfs(node.left);
        long right= dfs(node.right);
        long cen= node.val+left+right;
        long product= cen * (totSum-cen);
        maxp= Math.max(product,maxp);

        return cen;

    }
}