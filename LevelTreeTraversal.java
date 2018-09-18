//Binary Tree Level Order Traversal --> Given binary tree [3,9,20,null,null,15,7], o/p -->[[3],[9,20],[15,7]]

public class LevelTreeTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new LinkedList<>();
        if(root == null) return result;
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> tempList = new LinkedList<>();
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode temp = queue.poll();
                if(temp.left!=null){
                    queue.add(temp.left);
                }
                if(temp.right!=null){
                    queue.add(temp.right);
                }
                tempList.add(temp.val);
            }
            result.add(tempList);
        }
        return result;
    }

}
