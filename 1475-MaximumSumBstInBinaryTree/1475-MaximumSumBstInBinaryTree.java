// Last updated: 8/21/2025, 12:08:47 PM
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
    public int maxSumBST(TreeNode root) {
        return validBST(root).ans;
    }
    public BSTPair validBST(TreeNode root) {
		if (root == null) {
			return new BSTPair();
		}

		BSTPair lbp = validBST(root.left);
		BSTPair rbp = validBST(root.right);
		BSTPair sbp = new BSTPair();

		sbp.min = Math.min(lbp.min, Math.min(rbp.min, root.val));
		sbp.max = Math.max(lbp.max, Math.max(rbp.max, root.val));
		sbp.sum = lbp.sum + rbp.sum + root.val;
		sbp.isBST = lbp.isBST && rbp.isBST && lbp.max < root.val && rbp.min > root.val;
        if(sbp.isBST){
            sbp.ans=Math.max(lbp.ans, Math.max(rbp.ans,sbp.sum));
        }
        else{
            sbp.ans=Math.max(lbp.ans,rbp.ans);
        }
		return sbp;
	}

	class BSTPair {
		boolean isBST = true;
		long max = Long.MIN_VALUE;
		long min = Long.MAX_VALUE;
        int sum=0;
        int ans=0; // only maximum bst part ka sum
	}

}