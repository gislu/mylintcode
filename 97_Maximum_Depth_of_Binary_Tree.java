tion of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: An integer.
     */

//devide && conquer
    // public int maxDepth(TreeNode root){
    //     if(root == null){
    //         return 0;
    //     }
    //     int left = maxDepth(root.left);
    //     int right = maxDepth(root.right);
        
    //     return Math.max(left,right) + 1;
    // }
    
// rec
    int depth;
    public int maxDepth(TreeNode root){
        depth = 0;
        if(root == null){
            return depth;
        }
        helper(root,depth + 1);
        return depth;
    }
     private void helper(TreeNode node,int curtdep){
         if(node == null){
             return;
         }
         if(depth < curtdep){
             depth = curtdep;
         }
         helper(node.left, curtdep + 1);
         helper(node.right, curtdep + 1);
         
         
     }
    
    }
    
