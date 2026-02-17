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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stk = new Stack<>();
        TreeNode head = root;
        while (head != null || !stk.isEmpty()) {
            while (head != null) {
                stk.push(head);
                head = head.left;
            }
            head = stk.pop();
            res.add(head.val);
            head = head.right;
        }
        return res;
    }
}