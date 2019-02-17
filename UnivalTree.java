//to count the unival trees (Trees whose all the nodes have same value)
public class UnivalTree{
    int count = 0;
    public boolean unival(TreeNode root){
        if(root == null)
            return true;
        boolean left  = unival(root.left);
        boolean right = unival(root.right);

        if(left && right &&
           (root.left == null || root.left.val == root.val) &&
           (root.right == null || root.right.val == root.val)){
            count++;
            return true;
        }
        return false;
    }
}
