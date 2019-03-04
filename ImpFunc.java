//https://aonecode.com/getArticle/1000

//Two SortedList Merge
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
 if(l1==null) return l2;
 if(l2==null) return l1;
 if(l1.val<l2.val){
   l1.next = mergeTwoLists(l1.next,l2);
   return l1;
 } else {
   l2.next = mergeTwoLists(l1,l2.next);
   return l2;
 }
 }

//Palindromic Substrings
 public int countSubstrings(String s) {
    int len = s.length();
    if(len==0 || s==null) return 0;
    int count = 0;
    for(int i=0;i<len;i++){
        int low = i;
        int high = i;
        while(low>=0 && high<len && s.charAt(low)==s.charAt(high)){
            count ++;
            low --;
            high ++;
        }

        low = i;
        high = i+1;
        while(low>=0 && high<len && s.charAt(low)==s.charAt(high)){
            count ++;
            low --;
            high ++;
        }
    }

//
public class Solution {
    int maxValue;

    public int maxPathSum(TreeNode root) {
        maxValue = Integer.MIN_VALUE;
        maxPathDown(root);
        return maxValue;
    }

    private int maxPathDown(TreeNode node) {
        if (node == null) return 0;
        int left = Math.max(0, maxPathDown(node.left));
        int right = Math.max(0, maxPathDown(node.right));
        maxValue = Math.max(maxValue, left + right + node.val);
        return Math.max(left, right) + node.val;
    }
}
//

//Three Sum Closest
public int threeSumClosest(int[] num, int target) {
        int result = num[0] + num[1] + num[num.length - 1];
        Arrays.sort(num);
        for (int i = 0; i < num.length - 2; i++) {
            int start = i + 1, end = num.length - 1;
            while (start < end) {
                int sum = num[i] + num[start] + num[end];
                if (sum > target) {
                    end--;
                } else {
                    start++;
                }
                if (Math.abs(sum - target) < Math.abs(result - target)) {
                    result = sum;
                }
            }
        }
        return result;
    }
  //

  //Check if two tree is same/identical
  public boolean isSameTree(TreeNode p, TreeNode q) {
    if(p == null && q == null) return true;
    if(p == null || q == null) return false;
    if(p.val == q.val)
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    return false;
}
//Check if two tree is symmetric
public boolean isSymmetric(TreeNode root) {
    return root==null || isSymmetricHelp(root.left, root.right);
}
private boolean isSymmetricHelp(TreeNode left, TreeNode right){
    if(left==null || right==null)
        return left==right;
    if(left.val!=right.val)
        return false;
    return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
}
