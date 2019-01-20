public class CheckBST{

static class Node{
  int val;
  Node left;
  Node right;
  Node(int val){
    this.val = val;
    left=null;
    right=null;
  }
}

static Node root;
static Node prev;

static boolean isBST(){
  prev = null;
  return isBST(root);
}

//main logic
static boolean isBST(Node root){
  if(root!=null){
    if(!isBST(root.left)){
      return false;
    }
    if(prev!=null && node.data<=prev.data){
      return false;
    }
    prev = node;
    return (isBST(node.right));
  }
  return  true;
}

////
public boolean isValidBST(TreeNode root) {
    return isValidBST(root, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
}

public boolean isValidBST(TreeNode p, double min, double max){
    if(p==null)
        return true;

    if(p.val <= min || p.val >= max)
        return false;

    return isValidBST(p.left, min, p.val) && isValidBST(p.right, p.val, max);
}
////



///
public boolean isValidBST(TreeNode root) {
        if(root == null)
            return true;

        LinkedList<BNode> queue = new LinkedList<BNode>();
        queue.add(new BNode(root, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY));
        while(!queue.isEmpty()){
            BNode b = queue.poll();
            if(b.n.val <= b.left || b.n.val >=b.right){
                return false;
            }
            if(b.n.left!=null){
                queue.offer(new BNode(b.n.left, b.left, b.n.val));
            }
            if(b.n.right!=null){
                queue.offer(new BNode(b.n.right, b.n.val, b.right));
            }
        }
        return true;
    }

    class BNode{
    TreeNode n;
    double left;
    double right;
    public BNode(TreeNode n, double left, double right){
        this.n = n;
        this.left = left;
        this.right = right;
    }
    ////


    ///
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        TreeNode prev = null;
        while(current!=null || stack.size()!=0){
            while(current!=null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            if(prev!=null && current.val<=prev.val) return false;
            prev = current;
            current = current.right;
        }
        return true;
    }
    ///



}
