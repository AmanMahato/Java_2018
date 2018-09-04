import java.util.*;
import java.lang.*;

public class StringPermutation{

  public static void main(String[] args){
    for(List<Character> innerList:getPermutation("abcdxa")){ //abcdxabcde
      String ans = "";
      for(Character str:innerList){
        ans = ans+str.toString();
        //System.out.print(str);
      }
      System.out.println(ans);
    }
  }

  public static List<List<Character>> getPermutation(String input){
    List<List<Character>> list = new LinkedList<>();
    getPermutationHelper(list, new LinkedList<Character>(),input.toCharArray());
    return list;
}

public static void getPermutationHelper(List<List<Character>> list, List<Character> temp, char[] input){
    if(temp.size()==input.length){
        list.add(new ArrayList<Character>(temp));
    }
    for(int i=0;i<input.length;i++){
        if(temp.contains(input[i])) continue;
        temp.add(input[i]);
        getPermutationHelper(list,temp,input);
        temp.remove(temp.size()-1);
    }
}

}
