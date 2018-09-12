import java.lang.*;
import java.util.*;

public class Trie{

  public static void main(String args){
    System.out.println("Hello");
    //add("aman");
    //System.out.println(isPresent("ama"));
    //System.out.println(isPresent("aman"));
  }

  static class TrieNode{
    TrieNode[] children = new TrieNode[26];
    boolean isEnd;
    TrieNode(){
      Arrays.fill(children,null);
      isEnd = false;
    }
  }

  static TrieNode root;



  static void add(String str){
    int length = str.length();
    int index;
    TrieNode crawl = root;
    for(int i=0;i<length;i++){
      index = str.charAt(i)-'a';
      if(crawl.children[index]!=null){
        continue;
      } else {
        crawl = new TrieNode();
        crawl = crawl.children[index];
      }
      crawl.isEnd = true;
    }
  }

  static boolean isPresent(String key){
    int length = key.length();
    int level = 0;
    int index;
    TrieNode crawl = root;
    for(int i=0;i<length;i++){
      index = key.charAt(i)-'a';
      if(crawl.children[index]==null) return false;
      crawl = crawl.children[index];
    }
    return (crawl!=null && crawl.isEnd);
  }

}
