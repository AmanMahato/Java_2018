public class LongestPalindromicSubstring{

  public static void main(String[] args){
    System.out.println(getLongestPalindrome("forgeeksskeegfor"));//geeksskeeg-->10
    System.out.println(getLongestPalindrome("aman"));

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

}
