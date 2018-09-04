import java.lang.*;
import java.util.*;

public class FindMaxSubString{

  public static void main(String[] args){
    System.out.println(findMaxSubString("abcda"));
  }

  public static String findMaxSubString(String str){
    Set<Character> set = new HashSet<>();
    String longestTillNow = "";
    String longestOverAll = "";
    for(int i =0;i<str.length();i++){
      Character c = str.charAt(i);
      if(!set.contains(c)){
        longestTillNow = longestTillNow+c.toString();
        set.add(c);
        if(longestTillNow.length()>longestOverAll.length()) longestOverAll = longestTillNow;
      } else {
        longestTillNow = "";
        set.clear();
      }
    }
    return longestOverAll;
}


}





//temp
Set<Character> set = new HashSet<>();
String longestTillNow = "";
String longestOverAll = "";
for(int i =0;i<s.length();i++){
  Character c = s.charAt(i);
  if(set.contains(c)){
    set.clear();
    set.add(c);

  } else {
    //TODO
      set.add(c);
      longestTillNow = longestTillNow + c.toString();
      if(longestTillNow>longestOverAll) {
          longestOverAll = longestTillNow;
      }
  }
}
return longestOverAll.length();
