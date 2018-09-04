public class FindSubString{

  public static void main(String[] args){
      System.out.println(findSubString("ma","aaama"));
  }

  static int findSubString(String s1,String s2){
    int len1 = s1.length();
    int len2 = s2.length();
    for(int i = 0;i<=len2-len1;i++){
      int j;
      for(j=0;j<len1;j++){
        if(s2.charAt(i+j)!=s1.charAt(j)) {
          break;
        }
      }
      if(j==len1) {
      return i;
      }
    }
    return -1;
  }

}
