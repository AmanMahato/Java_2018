//* is equivalent to BackSpace of keyboard, do in constant space
//This solution is wrong.
public class BackSpace {

  public static void main(String[] args){
    if(isEqual("abc**","akeod****e*")){
      System.out.println("Equal");
    } else {
      System.out.println("Not Equal");
    }

    if(isEqual("ac**","akeod****e*")){
      System.out.println("Equal");
    } else {
      System.out.println("Not Equal");
    }
  }

  public static boolean isEqual(String str1,String str2){
    int len1 = str1.length()-1;
    int len2 = str2.length()-1;
    if(len1>=0 && str1.charAt(len1)!='*' && len2>=0 && str2.charAt(len2)!='*'){
      if(str1.charAt(len1)!=str2.charAt(len2)){
        return false;
      } else {
      while(len1>=0 && str1.charAt(len1)=='*'){
        len1--;
      }
      while(len2>=0 && str2.charAt(len2)=='*'){
        len2--;
      }
    }
  }
  return true;
}
}
