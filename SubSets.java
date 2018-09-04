//Non Distinct SubSets using backTracking

import java.util.*;
import java.lang.*;

public class SubSets{

  public static void main(String[] args){
    int[] input = new int[]{1,2,3};
    List<List<Integer>> result = subSet(input);
    for(List<Integer> innerList:result){
      for(Integer elem:innerList){
        System.out.print(elem+" ");
      }
      System.out.println();
    }
  }

  public static List<List<Integer>> subSet(int[] input){
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(input);
    helperSubSet(list, new ArrayList<Integer>(), input, 0);
    return list;
  }

  public static void helperSubSet(List<List<Integer>> list, List<Integer> temp, int[] input, int index){
    list.add(new ArrayList<Integer>(temp));
    for(int i=index;i<input.length;i++){
      temp.add(input[i]);
      helperSubSet(list, temp, input, i+1);
      temp.remove(temp.size()-1);
    }
  }

}
