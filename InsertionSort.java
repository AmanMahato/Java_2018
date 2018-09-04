public class InsertionSort{
    public static void main(String[] args){
      int[] result = new InsertionSort().insertionSort(new int[]{1,2,11,3,4,5,-2,1,0,-4});
      for(int i:result){
        System.out.println(i);
      }
    }

    int[] insertionSort(int[] input){
        for(int i=1;i<input.length;i++){
          int j=i-1;
          int key = input[i];
          while(j>=0 && key<input[j]){
            input[j+1] = input[j];
            j--;
          }
          input[j+1] = key;
        }
        return input;
    }
}
