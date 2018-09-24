//1. Given an array of integers, push all the zeroes to right and all non-zeroes to start of the array.
//Order of non zero elements should not be disturbed. Do it in place. [4,0,3,2,0] -> [4,3,2,0,0]

public class ArrayManipulation{

  public static void main(String[] args){
    int[] input = new int[]{4,0,3,2,0};
    manipuateArray(input);
    for(Integer i : input){
      System.out.print(i+" ");
    }
  }

  static void manipuateArray(int[] input){
    for(int i=0;i<input.length;i++){
      int key = input[i];
      int j=i;
      while(key == 0 && j<input.length-1){
        input[j] = input[j+1];
        j++;
      }
      input[j] = key;
    }
  }
}
