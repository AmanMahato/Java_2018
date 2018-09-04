import java.util.*;
import java.lang.*;

public class SubSet{

  public static void main(String[] args){
    List<List<Character>> result = getSubSet(new Character[]{'a','m','a','n'});
    for(List<Character> inner : result){
      for(Character c:inner){
        System.out.print(c+" ");
      }
      System.out.println();
    }
  }

  public static List<List<Character>> getSubSet(Character[] input){
    int len = input.length;
    List<List<Character>> outer = new LinkedList<>();
    for(int i=0;i<Math.pow(2,len);i++){
      List<Character> innerList = new LinkedList<>();
      for(int j=0;j<len;j++){
        if((i&(1<<j))>0){
          innerList.add(input[j]);
        }
      }
      outer.add(innerList);
    }
    return outer;
  }
}
