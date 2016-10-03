ass ResultType{
    public boolean isba;
    public int maxdep;
    public ResultType(boolean ifbal,int dep){
        this.isba = ifbal;
        this.maxdep = dep;
    }
}
public class Solution {
//use rec
    // public boolean isBalanced(TreeNode root) {
    //     return helper(root).isba;
    // }
    
    // private ResultType helper(TreeNode node){
    //     if(node == null){
    //         return new ResultType(true,0);
    //     }
        
    //     ResultType left = helper(node.left);
    //     ResultType right = helper(node.right);
    //      if (!left.isba || !right.isba) {
    //         return new ResultType(false, -1);
    //     }
        
    //     // root not balance
    //     if (Math.abs(left.maxdep - right.maxdep) > 1) {
    //         return new ResultType(false, -1);
    //     }
        
    //     return new ResultType(true, Math.max(left.maxdep, right.maxdep) + 1);
    // }
    
    //devide & conquer
    public boolean isBalanced(TreeNode root) {
        int rs = helper(root);
        if(rs == -1){
            return false;
        }
        return true;
    }
    
    public int helper(TreeNode node){
        if(node == null){
            return 0;
        }
        
        int left = helper(node.left);
        int right = helper(node.right);
        if(left == -1 || right == -1 || Math.abs(left - right) > 1){
            return -1;
        }
        return Math.max(left, right) + 1;
    }
    
   
    
}
