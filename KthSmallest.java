//Kth Smallest Element in a BST

public class KthSmallest{

  public static void main(String[] args){
    //TOOD
  }

  Stack<TreeNode> stack = new Stack<>();

  public int kthSmallest(TreeNode root, int k) {
    pushAll(root);
    TreeNode temp = null;
    for(int i=0;i<k;i++){
        temp = next();
    }
      return temp.val;
      }

void pushAll(TreeNode root){
    for(;root!=null;stack.push(root),root=root.left){

    }
}

TreeNode next(){
    TreeNode temp = stack.pop();
    pushAll(temp.right);
    return temp;
}
}

//2nd Solution
DFS in-order recursive:

    // better keep these two variables in a wrapper class
    private static int number = 0;
    private static int count = 0;

    public int kthSmallest(TreeNode root, int k) {
        count = k;
        helper(root);
        return number;
    }

    public void helper(TreeNode n) {
        if (n.left != null) helper(n.left);
        count--;
        if (count == 0) {
            number = n.val;
            return;
        }
        if (n.right != null) helper(n.right);
    }
