//Input: [1,2,3]
//    1
//   / \
//  2   3
//Output: 25  coz 12+13

public class SumRootToLeafNum{

public int sumNumbers(TreeNode root) {
        if(root == null) return 0;
        return findSum(root,0);
    }

    public int findSum(TreeNode root, int sum){
        if(root==null) return 0;
        if(root.left==null && root.right==null){
            return sum*10+root.val;
        }
        return(findSum(root.left,sum*10+root.val)+findSum(root.right,sum*10+root.val));
    }
}
