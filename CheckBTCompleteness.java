//Completeness of Binary Tree

public class CheckBTCompleteness {

public boolean isCompleteTree(TreeNode root) {
      Queue<TreeNode> bfs = new LinkedList<TreeNode>();
      bfs.add(root);
      while (bfs.peek() != null) {
          TreeNode node = bfs.poll();
          bfs.add(node.left);
          bfs.add(node.right);
      }
      while (!bfs.isEmpty() && bfs.peek() == null)
          bfs.poll();
      return bfs.isEmpty();

  }

}
