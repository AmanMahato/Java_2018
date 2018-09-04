import java.util.*;
import java.lang.*;

public class CheckAnagram {

  public static void main(String[] args){
    String s1 = "aman";
    String s2 = "kuma";
    System.out.println(isAnagram(s1,s2));
  }

  public static boolean isAnagram(String s1, String s2){
    if(s1.length()!=s2.length()) return false;
    int len = s1.length();
    Map<Character,Integer> map = new HashMap<>();
    for(int i=0;i<len;i++){
      if(!map.containsKey(s1.charAt(i))){
        map.put(s1.charAt(i),1);
      } else {
        map.put(s1.charAt(i),map.get(s1.charAt(i))+1);
      }
    }

    for(int i=0;i<len;i++){
      if(!map.containsKey(s2.charAt(i))){
        return false;
      } else {
        map.put(s2.charAt(i),map.get(s2.charAt(i))-1);
        if(map.get(s2.charAt(i))==0) map.remove(s2.charAt(i));
      }

    }
    return map.isEmpty();
  }


}
