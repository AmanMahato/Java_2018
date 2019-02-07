import java.util.*;
import java.lang.*;
public class LongestPalindromicSubstring{

  public static void main(String[] args){
    System.out.println(getLongestPalindrome("forgeeksskeegfor"));//geeksskeeg-->10
    System.out.println(getLongestPalindrome("aman"));
    System.out.println(longestPossiblePalindrome("forgeeksskeegfor"));
  }

  public static String getLongestPalindrome(String str){
    int maxLength = 1;
    int start = 0;
    int len = str.length();
    //int low=0;
    //int high=0;
    for(int i=1;i<len;i++){
      int low=i-1;
      int high=i;

      //even
      while(low>=0 && high<len && str.charAt(low)==str.charAt(high)){
        //System.out.println("3");
        if(maxLength<(high-low+1)){
          //System.out.println("4");
          start = low;
          maxLength = high-low+1;
        }
        low--;
        high++;
      }

      //odd
      low=i-1;
      high=i+1;
      while(low>=0 && high<len && str.charAt(low)==str.charAt(high)){
        if(maxLength<(high-low+1)){
          start = low;
          maxLength = high-low+1;
        }
        low--;
        high++;
      }


    }

    return str.substring(start,start+maxLength);
  }

//This question is completely different from the upper one, this one makes the longest possible palindrome from the given word
  public static int longestPossiblePalindrome(String s){ //i/p->forgeeksskeegfor--[]
    int count = 0;
    Set<Character> set = new HashSet<Character>();
    for(int i=0;i<s.length();i++){
      if(!set.contains(s.charAt(i))){
        set.add(s.charAt(i));
      } else {
        count ++ ;
        set.remove(s.charAt(i));
    }
  }
  return (set.isEmpty() ? (count*2) : (count *2)+1);
  }

  //This is SUBSEQUENCE, Completely different than original question
  public static int longestPalindromeSubseq(String s) {
        int[][] dp = new int[s.length()][s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i+1][j-1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
                }
            }
        }
        return dp[0][s.length()-1];
    }

}
