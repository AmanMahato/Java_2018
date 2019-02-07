//largest sum --> contigious subarray. Do in O(n).
public class MaximumSubArray{

  public static void main(String[] args){
    System.out.println(maximumSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
  }

  static int maximumSubArray(int[] input){
    int len = input.length;
    int[] dp = new int[len];
    dp[0] = input[0];
    int max = input[0];
    for(int i=1;i<len;i++){
      dp[i] = input[i] + (dp[i-1]>0 ? dp[i-1]:0);
      max = Math.max(max, dp[i]);
    }
    return max;
  }

}
