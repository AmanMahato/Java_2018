public class SumTargetIndex {

  public static void main(String[] args){
    SumTargetIndex testObj = new SumTargetIndex();
    System.out.println(testObj.twoSum(new int[]{2,7,11,15},9))
  }

  public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int initialIndex = 0;
        for(int i=1;i<nums.length;i++){
            result[0] = initialIndex;
            if((result[initialIndex]+result[i])==target && initialIndex<result.length){
                result[1] = i;
                return result;
            } else {
                initialIndex++;
            }
        }
        return result;
    }

}
