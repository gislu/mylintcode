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
        public ArrayList<Integer> preorderTraversal(TreeNode root){
           Stack<TreeNode> stack = new Stack<TreeNode>();
           ArrayList<Integer> preorder = new ArrayList<Integer>();
           if(root == null){
               return preorder;
           }
           stack.push(root);
           while(!stack.empty()){
               TreeNode node = stack.pop();
               preorder.add(node.val);
               if(node.right != null){
                   stack.push(node.right);
               }
               if(node.left != null){
                   stack.push(node.left);
               }
           }
           return preorder;
        }
        
        //rec
        // public ArrayList<Integer> preorderTraversal(TreeNode root){
        //     ArrayList<Integer> preorder = new ArrayList<Integer>();
        //     if(root == null){
        //         return preorder;
        //     }
            
        //     traversal(root,preorder);   
        //     return preorder;
        // }
        // private void traversal(TreeNode root,ArrayList<Integer> list){
        //     if(root == null){
        //         return ;
        //     }
        //     list.add(root.val);
        //     traversal(root.left,list);
        //     traversal(root.right,list);
        // }
    
    
    //dedive && conquer
    //  public ArrayList<Integer> preorderTraversal(TreeNode root){
    //         ArrayList<Integer> preorder = new ArrayList<Integer>();
    //         if(root == null){
    //             return preorder;
    //         }
    //         preorder.add(root.val);
    //         ArrayList<Integer> left = preorderTraversal(root.left);
    //         ArrayList<Integer> right = preorderTraversal(root.right);
            
    //         preorder.addAll(left);
    //         preorder.addAll(right);
    //         return preorder;
    // }
}










