import java.util.*;
import java.lang.*;

class WordBreak {

    public static void main(String[] args){
      List<String> ans = new WordBreak().wordBreak("catsanddog",Arrays.asList(new String[]{"apple", "pen", "applepen", "pine", "pineapple"}));
      System.out.println("Here "+" "+ans.size());
      for(String sentence : ans){
        System.out.println(sentence);
      }
    }

    public List<String> wordBreak(String s, List<String> wordDict) {
      System.out.println("Here "+" "+wordDict.size());
        return DFS(s,wordDict, new HashMap<String, LinkedList<String>>());
    }

    List<String> DFS(String s, List<String> wordDict, HashMap<String, LinkedList<String>>map) {
    if (map.containsKey(s))
        return map.get(s);
    LinkedList<String>res = new LinkedList<String>();
    if (s.length() == 0) {
        res.add("");
        return res;
    }
    for (String word : wordDict) {
        if (s.startsWith(word)) {
            List<String>sublist = DFS(s.substring(word.length()), wordDict, map);
            for (String sub : sublist)
                res.add(word + (sub.isEmpty() ? "" : " ") + sub);
        }
    }
    map.put(s, res);
    return res;
}
}