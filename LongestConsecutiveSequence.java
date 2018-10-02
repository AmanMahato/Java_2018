//Input: [100, 4, 200, 1, 3, 2]
//Output: 4
//Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

import java.util.*;
import java.lang.*;

public class LongestConsecutiveSequence{

  public static void main(String[] args){
    System.out.println(longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
  }

  public static int longestConsecutive(int[] nums) {
       if(nums == null || nums.length == 0) return 0;
       int result = 1;
       Set<Integer> set = new HashSet<>();
       for(Integer num:nums){
           set.add(num);
       }
       for(Integer num:nums){
           int left = num-1;
           int right = num+1;
           int count = 1;
           while(set.contains(left)){
               count ++;
               set.remove(left--);
           }
           while(set.contains(right)){
               count ++;
               set.remove(right++);
           }
           result = Math.max(result, count);
       }
       return result;
   }

}
