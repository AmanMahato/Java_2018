//Maximum Product Subarray

public class MaxProduct{

public int maxProduct(int[] nums) {
      int result = nums[0];
      int min = nums[0];
      int max = nums[0];
      for(int i=1;i<nums.length;i++){
          int temp = min;
          min = Math.min(nums[i],Math.min(nums[i]*min,nums[i]*max));
          max = Math.max(nums[i],Math.max(nums[i]*temp,nums[i]*max));
          result = Math.max(result,max);
      }
      return result;
  }

}
