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



}
