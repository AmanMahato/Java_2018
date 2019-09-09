public class ArrayReverse {

  public static void main(String[] args){
    print(reverse(new int[]{1,2,3,4,5,6}));
  }

  static void print(int[] input){
    //input.forEach(x->System.out.print(x));
    for(int element:input){
      System.out.println(element);
    }
  }

  //Reverse Array Logic
  static int[] reverse(int[] input){
    if(input.length==0 || input==null) return new int[0];
    int i=0;
    int j=input.length-1;
    while(j>i){
      int temp = input[i];
      input[i] = input[j];
      input[j] = temp;
      i++;
      j--;
    }
    return input;
  }

}
