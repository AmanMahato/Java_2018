public class InsertIntoBst{

public TreeNode insertIntoBST(TreeNode root, int val) {
  if(root == null) {
      root = new TreeNode(val);
      return root;
  }
  if(val<root.val){
      root.left = insertIntoBST(root.left,val);
  }
  if(val>root.val){
      root.right = insertIntoBST(root.right,val);
  }
  return root;
}

//code to inset in Binary Tree
static void insert(Node temp, int key)
{
    Queue<Node> q = new LinkedList<Node>(); 
    q.add(temp);

    // Do level order traversal until we find
    // an empty place.
    while (!q.isEmpty()) {
        temp = q.peek();
        q.remove();

        if (temp.left == null) {
            temp.left = new Node(key);
            break;
        } else
            q.add(temp.left);

        if (temp.right == null) {
            temp.right = new Node(key);
            break;
        } else
            q.add(temp.right);
    }
}

}
