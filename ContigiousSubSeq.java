//2. Given an unsorted array of positive integers, and a value. Return True/False if a contiguous sequence of numbers can sum upto that value.
import java.util.*;
import java.lang.*;

public class ContigiousSubSeq{

  public static void main(String[] args){
    System.out.println(isPossible(new int[]{1,2,3,4,5},9));
  }

  public static boolean isPossible(int[] input, int value){
    Arrays.sort(input);
    for(int i=0;i<input.length;i++){
      int sum = 0;
      int j = i;
      while(sum<value && j<input.length){
        sum = sum + input[j++];
        if(sum == value) return true;
      }
    }
    return false;
  }
}
