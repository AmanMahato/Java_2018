//Find minimum edit distance (3 Operations-->Insert, Delete, Update)

import java.util.*;
import java.lang.*;

public class EditDistance{

  public static void main(String[] args){
    System.out.println(getEditDistance("aman","mahato"));
  }

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
}
