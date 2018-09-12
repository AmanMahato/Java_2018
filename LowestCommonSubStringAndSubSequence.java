//Lowest Common SubString and SubSequence
import java.util.*;
import java.lang.*;

public class LowestCommonSubStringAndSubSequence{

  public static void main(String[] args){
    System.out.println(lowestCommonSubString("abmanco","bomanpo"));
    System.out.println(lowestCommonSubSequence("abmanco","bomanpo"));
  }

  static int lowestCommonSubString(String s1, String s2){
    int[][] dp = new int[s1.length()+1][s2.length()+1];
    int max = 0;
    for(int i=1;i<=s1.length();i++){
      for(int j=1;j<=s2.length();j++){
        if(s1.charAt(i-1)==s2.charAt(j-1)){
          dp[i][j] = dp[i-1][j-1]+1;
          if(max<dp[i][j]) max = dp[i][j];
        }
      }
    }
    return max;
  }

  static int lowestCommonSubSequence(String s1, String s2){
    int[][] dp = new int[s1.length()+1][s2.length()+1];
    int max = 0;
    for(int i=1;i<=s1.length();i++){
      for(int j=1;j<=s2.length();j++){
        if(s1.charAt(i-1)==s2.charAt(j-1)){
          dp[i][j] = dp[i-1][j-1]+1;
        } else {
          dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
        }
        if(max<dp[i][j]) max = dp[i][j];
      }
    }
    return max;
  }

}
