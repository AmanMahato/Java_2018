//Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
       }

public class PathSum{

public List<List<Integer>> pathSum(TreeNode root, int sum) {
    List<List<Integer>> result = new LinkedList<>();
    List<Integer> temp = new LinkedList<>();
    pathSumHelper(root,sum,result,temp);
    return result;
}

//concept of backtracking is used
void pathSumHelper(TreeNode root, int sum, List<List<Integer>> result, List<Integer> temp){
    if(root==null) return;
    temp.add(root.val);
    if(root.left == null && root.right==null && sum==root.val){
        result.add(new LinkedList<>(temp));
        temp.remove(temp.size()-1);
        return;
    } else {
        pathSumHelper(root.left,sum-root.val,result,temp);
        pathSumHelper(root.right,sum-root.val,result,temp);
    }
    temp.remove(temp.size()-1);
}


}
