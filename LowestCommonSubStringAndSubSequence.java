//Lowest Common SubString and SubSequence
import java.util.*;
import java.lang.*;

public class LowestCommonSubStringAndSubSequence{

  public static void main(String[] args){
    System.out.println(lowestCommonSubString("abmanco","bomanpo"));
    System.out.println(lowestCommonSubSequence("abmanco","bomanpo"));
  }
//naming is confusng, its longest
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

//its actually longest
  static int lowestCommonSubSequence(String s1, String s2){
    int[][] dp = new int[s1.length()+1][s2.length()+1];
    int max = 0;
    for(int i=1;i<=s1.length();i++){
      for(int j=1;j<=s2.length();j++){
        if(s1.charAt(i-1)==s2.charAt(j-1)){
          dp[i][j] = dp[i-1][j-1]+1; //substring
        } else {
          dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
        }
        if(max<dp[i][j]) max = dp[i][j];
      }
    }
    return max;
  }

  //For Comparision Purpose
  static int getEditDistance(String str1, String str2){
    int len1 = str1.length();
    int len2 = str2.length();
    int[][] dp = new int[len1+1][len2+1]; //Always note: str1 is vertical and str2 is horizonal in dp table
    for(int i=0;i<=len1;i++){
      for(int j=0;j<=len2;j++){
        if(i==0){
          dp[i][j] = j;
        } else if(j==0){
          dp[i][j] = i;
        } else if(str1.charAt(i-1)==str2.charAt(j-1)){
          dp[i][j] = dp[i-1][j-1];
        } else {
          dp[i][j] = Math.min(dp[i][j-1],Math.min(dp[i-1][j],dp[i-1][j-1]))+1;
        }
      }
    }
    return dp[len1][len2];
  }

//for comparision purpose only
  static int minCostPath(int[][] input, int m , int n){
    int[][] dpArray = new int[m+1][n+1];
    dpArray[0][0] = input[0][0];

    //col
    for(int i=1;i<=m;i++){
      dpArray[i][0] = dpArray[i-1][0]+input[i][0];
    }

    //row
    for(int j=1;j<=n;j++){
      dpArray[0][j] = dpArray[0][j-1]+input[0][j];
    }

    for(int i=1;i<=m;i++){
      for(int j=1;j<=n;j++){
        dpArray[i][j] = min(dpArray[i-1][j-1],dpArray[i-1][j],dpArray[i][j-1])+input[i][j];
      }
    }
    return dpArray[m][n];
  }

}
