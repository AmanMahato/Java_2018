/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> temp = new LinkedList<>();
        pathSumHelper(root,sum,result,temp);
        return result;
    }

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

//new

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root!=null){
        if(root.left==null && root.right==null && root.val-sum==0){
            return true;
        } else {
            return(hasPathSum(root.left,sum-root.val) || hasPathSum(root.right,sum-root.val));
        }
        }
        return false;
    }
}
