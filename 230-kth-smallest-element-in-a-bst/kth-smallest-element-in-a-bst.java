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
    int sm=0;
    int c=0;
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        inorder(root,k);
        return sm;


    }
    public void inorder(TreeNode n, int k){
        if(n==null){
            return ;
        }
        inorder(n.left,k);
        if(++c==k){
            sm=n.val;
            return;
        }
        inorder(n.right,k);
    }
}