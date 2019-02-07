//Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).
//For example:
//Given binary tree [3,9,20,null,null,15,7],

public class ZigZagLevelOrder{

public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> result = new LinkedList<>();
    helper(result,root,0);
    return result;
}

public void helper(List<List<Integer>> result, TreeNode root,int level){
    if(root == null) return;
    if(result.size()<=level){
        result.add(new LinkedList<Integer>());
    }
    if(level%2==0){
        result.get(level).add(root.val);
    } else {
        result.get(level).add(0,root.val);
    }
    helper(result,root.left,level+1);
    helper(result,root.right,level+1);
}

}
