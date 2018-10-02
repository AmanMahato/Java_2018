//Next Greater Element (LeetCode)

public class NextGreaterElem{

public static void main(String[] args){
  //Input: nums1 = [4,1,2], nums2 = [1,3,4,2].
  //Output: [-1,3,-1]
}

public int[] nextGreaterElement(int[] nums1, int[] nums2) {
  Stack<Integer> stack = new Stack<>();
  Map<Integer, Integer> map = new HashMap<>();
  for(int i=0;i<nums2.length;i++){
      if(stack.isEmpty()){
          stack.push(nums2[i]);
      } else {
          while(!stack.isEmpty() && stack.peek()<nums2[i]){
              map.put(stack.pop(),nums2[i]);
          }
          stack.push(nums2[i]);
      }
  }
  for(int i=0;i<nums1.length;i++){
      nums1[i] = ( map.containsKey(nums1[i]) ? map.get(nums1[i]) : -1);
  }
  return nums1;
}

}
