package trees;

public class CheckIfSubtreeContainsFunction {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null){
            return false;
        }
        
        // Always check the root from s and t
        if(checkPreorder(s,t)){
            return true;
        }
        
        // Check left child or right child
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }
    
    private boolean checkPreorder(TreeNode s, TreeNode t){
    	// base case, if they are both null, we know they are the same
        if(s == null && t == null){
            return true;
        }
        
        // If one of them is null and the other is not, they are not the same
        if(s == null || t == null){
            return false;
        }
        
        // Not the same if both node not the asme
        if(s.val != t.val){
            return false;
        }
        
        // Since preorder, check current, check left then right
        return checkPreorder(s.left, t.left) && checkPreorder(s.right, t.right);
        
    }
}
