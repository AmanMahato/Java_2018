public class HeapSortSelf{

  public static void main(String[] args){
    int[] input = new int[]{12,4,2,98,123,-2,0,1};
    heapSort(input);
    printArray(input);
  }

  static void printArray(int[] input){
    for(int i:input){
      System.out.println(i);
    }
  }

  static void heapSort(int[] input){
    int len = input.length;
    for(int i=(len/2)-1;i>=0;i--){
      heapify(input,i,len);
    }
    for(int i = len-1;i>=0;i--){
      int temp = input[0];
      input[0] = input[i];
      input[i] = temp;
      heapify(input,0,i);
    }
  }

  static void heapify(int[] input, int i, int n){ //n is lenght of array
    int left = (2*i)+1;
    int right = (2*i)+2;
    int largest = i;
    if(left < n && input[left]>input[largest]){
      largest = left;
    }
    if(right<n && input[right]>input[largest]){
      largest = right;
    }
    if(largest!=i){
      int temp = input[i];
      input[i] = input[largest];
      input[largest] = temp;
      heapify(input,largest,n);
    }
  }

}
