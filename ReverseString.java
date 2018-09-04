public class ReverseString{

  public static void main(String[] args){
    System.out.println(reverse("Hello"));
  }

  public static String reverse(String str){
    char[] input = str.toCharArray();
    int len = input.length;
    for(int i=0;i<len/2;i++){
      char temp = input[i];
      input[i] = input[len-1-i];
      input[len-1-i] = temp;
    }
    return new String(input);
  }

}
