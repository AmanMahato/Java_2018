public class QuickSort{
  public static void main(String[] args){
    int[] input = new int[]{-9,4,2,5,04,98,1234,-34,8};
    quickSort(input);
    printArray(input);
  }

  public static void printArray(int[] input){
      for(int i=0;i<input.length;i++){
        System.out.println(input[i]+" ");
      }
  }

  public static void swap(int[] input, int i, int j){
    int temp = input[i];
    input[i] = input[j];
    input[j] = temp;
  }

  public static void quickSort(int[] input){
    quickSortHelper(input,0,input.length-1);
  }

  public static void quickSortHelper(int[] input, int low, int high){
    if(low>=high) return;
    int position = split(input, low, high);
    quickSortHelper(input, low, position-1);
    quickSortHelper(input, position+1, high);
  }

  public static int split(int[] input, int low, int high){
    int pivot = low;
    int lowIndex = low+1;
    int highIndex = high;
    while(lowIndex<=highIndex){
      if(input[pivot]>=input[lowIndex]){
        lowIndex++;
        continue;
      }
      if(input[pivot]<input[highIndex]){
        highIndex--;
        continue;
      }
      swap(input,lowIndex++,highIndex--);
    }
    if(input[pivot]>=input[highIndex]){
      swap(input,pivot,highIndex);
      return highIndex;
    }
    return pivot;
  }

}
