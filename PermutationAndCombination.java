import java.lang.*;
import java.util.*;

public class PermutationAndCombination{

  public static void main(String[] args){
    int[] input = new int[]{1,1,3};
    List<List<Integer>> result1 = getSubSetWithoutDuplicate(input);
    List<List<Integer>> result2 = getSubSetWithDuplicate(input);
    //List<List<Integer>> result3 = getPermutationWithoutDuplicate(input);
    //List<List<Integer>> result4 = getPermutationWithDuplicate(input);
    //List<List<Integer>> result5 = getCombinationWithoutDuplicate(input);
    //List<List<Integer>> result6 = getCombinationWithDuplicate(input);
    println(result1);
    System.out.println("----------------------------------------");
    println(result2);

  }

  static void println(List<List<Integer>> list){
    for(List<Integer> innerList:list){
      //System.out.println("[");
      for(Integer elem:innerList){
        System.out.print(elem+" ");
      }
      //System.out.print("]");
      System.out.println();
    }
  }

  public static List<List<Integer>> getSubSetWithoutDuplicate(int[] input){
    List<List<Integer>> result = new LinkedList<>();
    Arrays.sort(input);
    getSubSetWithoutDuplicateHelper(result, new LinkedList<Integer>(), input, 0);
    return result;
  }

  public static void getSubSetWithoutDuplicateHelper(List<List<Integer>> list, List<Integer> temp, int[] nums, int index){
    list.add(new LinkedList<Integer>(temp));
    for(int i=index;i<nums.length;i++){
      temp.add(nums[i]);
      getSubSetWithoutDuplicateHelper(list, temp, nums, i+1);
      temp.remove(temp.size()-1);
    }
  }

  public static List<List<Integer>> getSubSetWithDuplicate(int[] input){
    List<List<Integer>> result = new LinkedList<>();
    Arrays.sort(input);
    getSubSetWithDuplicateHelper(result, new LinkedList<Integer>(), input, 0);
    return result;
  }

  public static void getSubSetWithDuplicateHelper(List<List<Integer>> list, List<Integer> temp, int[] nums, int index){
    list.add(new LinkedList<Integer>(temp));
    for(int i=index;i<nums.length;i++){
      if (i>index && nums[i]==nums[i-1]) continue;
      temp.add(nums[i]);
      getSubSetWithDuplicateHelper(list, temp, nums, i+1);
      temp.remove(temp.size()-1);
    }
  }




}
