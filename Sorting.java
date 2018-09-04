//InsertionSort Sort

public class Sorting{

  public static void main(String[] args){
    int[] input = new int[]{5,1,4,-3,0,7};
    //System.out.println("Aman"+" "+insertionSort(input).length);
    printArray(insertionSort(input));
  }

  public static void printArray(int[] input){
    for(int ind:input){
      System.out.println(ind);
    }
  }

  public static int[] insertionSort(int[] input){
    for(int i = 1; i<input.length;i++){
    int key = input[i];
    int j;
      for(j = i-1;j>=0 && input[j]>key;j--){
        input[j+1] = input[j];
      }
      input[j+1] = key;
  }
    return input;
  }
}
