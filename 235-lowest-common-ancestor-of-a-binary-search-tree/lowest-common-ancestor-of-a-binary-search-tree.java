/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


// // normal binary tree lca code also works but not considered as that optimised ..... tc : O(N)
// class Solution {
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//          if (root == null || root == p || root == q) {
//             return root;
//         }

//         TreeNode leftLca = lowestCommonAncestor(root.left, p, q);
//         TreeNode rightLca = lowestCommonAncestor(root.right, p, q);

//         if (leftLca == null) {
//             return rightLca;
//         }

//         if (rightLca == null) {
//             return leftLca;
//         }

//         return root;
//     }
// }

// // bst lca preffered approach ..... tc : O(H) → balanced BST me O(log N)
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(root != null){
            if(p.val < root.val && q.val < root.val){
                root = root.left;
            }    
            else if(p.val > root.val && q.val > root.val){
                root = root.right;
            }
            else{
                return root;
            }
        }
        return null;
    }
}