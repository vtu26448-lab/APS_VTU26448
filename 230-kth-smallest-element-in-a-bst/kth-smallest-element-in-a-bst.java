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
    public int visited=0;
    public int kthSmallest(TreeNode root, int k) {
        if(root==null)return -1;       
        
        int a=kthSmallest(root.left,k);
        visited++;
        if(visited==k)return root.val;
        
        int b=kthSmallest(root.right,k);
        if(a==-1)return b;
        return a;
    }
}