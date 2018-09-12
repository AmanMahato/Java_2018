public class AlternateString{

  public static void main(String[] args){
    System.out.println(alternateString("amanmahato","kumar"));
  }

  static String alternateString(String str1, String str2){
    int len1 = str1.length();
    int len2 = str2.length();
    int i = 0;
    StringBuilder sb = new StringBuilder();
    while(i<len1 && i<len2){
      sb.append(str1.charAt(i));
      sb.append(str2.charAt(i));
      i++;
    }
    String temp;
    if(len1>len2){
      temp = str1;
    } else if(len2>len1){
      temp = str2;
    } else {
      return sb.toString();
    }
    for(int j=i;j<temp.length();j++){
      sb.append(temp.charAt(j));
    }
    return sb.toString();
  }

}
