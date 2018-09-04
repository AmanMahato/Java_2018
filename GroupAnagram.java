import java.util.*;
import java.lang.*;
public class GroupAnagram{

  public static void main(String[] args){
    String[] input = new String[]{"aman","nama","god","ogd","hello"};
    Collection<List<String>> ans = getAnagram(input);
      for(List<String> singleList:ans){
        singleList.forEach(x->System.out.println(x));
        System.out.println("----------------------");
      }
  }

  public static Collection<List<String>> getAnagram(String[] input){
    Map<String,List<String>> map = new HashMap<>();
    for(String str:input){
      String sortedString = sortString(str);
      if(!map.containsKey(sortedString)){
        List<String> temp = new ArrayList<>();
        temp.add(str);
        map.put(sortedString,temp);
      } else {
        List<String> tempList = map.get(sortedString);
        tempList.add(str);
        map.put(sortedString,tempList);
      }
    }
    return map.values();
  }

  public static String sortString(String str){
    char[] temp = str.toCharArray();
    Arrays.sort(temp);
    return(new String(temp));
  }

}
