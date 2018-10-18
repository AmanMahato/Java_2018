//Simple and much easy to understand
import java.util.*;
import java.lang.*;

public class MergeSortNew{

  public static void main(String[] args){
      int[] input = new int[]{45,23,11,89,77,98,4,28,65,43};
      mergeSort(input);
      for(Integer i:input){
        System.out.println(i);
      }
  }

  public static void mergeSort(int[] input){
    mergeSort(input,0,input.length-1);
  }

  public static void mergeSort(int[] input, int low, int high){
    if(low<high){
      int mid = low+((high-low)/2);
      mergeSort(input,low,mid);
      mergeSort(input,mid+1,high);
      merge(input,low,mid,high);
    }
  }

  public static void merge(int[] input, int low, int mid, int high){
    int[] temp = new int[input.length];
    for(int i=low;i<=high;i++){
      temp[i]=input[i];
    }
    int i = low;
    int k = low;
    int j = mid+1;
    while(i<=mid && j<=high){
      if(temp[i]<=temp[j]){
        input[k]=temp[i++];
      } else {
        input[k] = temp[j++];
      }
      k++;
    }
    while(i<=mid){
      input[k++] = temp[i++];
    }
    while(j<=high){
      input[k++] = temp[j++];
    }
  }

}
