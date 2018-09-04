import java.util.*;
public class LongestCommonSub{

  public static void main(String[] args){
    String s1 = "Aman";
    String s2 = "Kumar";
    System.out.println(longestCommonSub(s1.toCharArray(),s2.toCharArray(),s1.length(),s2.length()));
  }

  //Recursive way
  public static int longestCommonSub(char[] s1, char[] s2, int len1, int len2){
    if(s1==null || s2==null) return 0;
    if(len1==0 || len2==0) return 0;
    if(s1[len1-1]==s2[len2-1]){
      return(1+longestCommonSub(s1,s2,len1-1,len2-1));
    } else{
      return(Math.max(longestCommonSub(s1,s2,len1,len2-1),longestCommonSub(s1,s2,len1-1,len2)));
    }
  }

  //Non Recursive
  public static int longestCommonSubNonRec(char str1[], char str2[]){
    int len1 = str1.length;
    int len2 = str2.length;
    int[][] result= new int[len1+1][len2+1];
    for(int i=0;i<=len1;i++){
      for(int j=0;j<=len2;j++){
        if(i==0 || j==0){
          result[i][j] = 0;
        }
        if(str1[i]==str2[j]){

        }
      }
    }
  }



}
